package jobs4u.server;

import core.management.candidate.repository.CandidateRepository;
import core.management.jobApplication.domain.ApplicationState;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.repository.JobOpeningRepository;
import jobs4u.server.server.EmailService;
import jobs4u.server.server.PropertiesLoader;
import core.management.user.domain.ExemploPasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import jobs4u.server.server.Server;
import org.apache.commons.io.ByteOrderMark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import core.infrastructure.persistence.PersistenceContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

import static jobs4u.server.server.SimpleHandler.hasMyAttributeChanged;
import static jobs4u.server.server.SimpleHandler.updateInitialPhases;
import static jobs4u.server.server.SimpleHandler.getAttributeChanged;

public class FollowupServer {

    static List<ApplicationState> inicialState = new ArrayList<>();

    static CandidateRepository candidateRepository = PersistenceContext.repositories().candidate();
    static JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    private static final Logger LOGGER = LoggerFactory.getLogger(FollowupServer.class);
    private static final int PORT = 10999;

    public static void main(String[] args) throws InterruptedException {
        try {
            Server server = new Server(PORT);
            System.out.println("At any time, press ENTER to stop server");
            init();


            update();

            Thread monitorThread = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(inicialState.get(0));
                    if (hasMyAttributeChanged(inicialState)) {
                        jobApplication application = getAttributeChanged(inicialState);
                        EmailService.sendEmailNotification(application);
                        inicialState.clear();
                        Iterable<jobApplication> allApplications = PersistenceContext.repositories().application().findAll();
                        if (allApplications != null) {
                            for (jobApplication  applications : allApplications) {
                                inicialState.add(applications.getApplicationState());
                            }
                        }
                    }
                    try {
                        Thread.sleep(2000); // Check every 1 second
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            monitorThread.setDaemon(true);
            monitorThread.start();

           // Thread.sleep(5*1000); //Sleep for 5 seconds
            Thread thread = new Thread(server);
            thread.setDaemon(true);
            thread.start();
            Scanner sc = new Scanner(System.in);
            System.out.println("At any time, press ENTER to stop server");
            sc.nextLine();
            server.stop();
            stop(thread);
        } catch (IOException e) {
            System.out.println("Could not bind to port " + PORT);
            System.out.println("Exiting the application...");
            System.out.println("Have a nice day ;)");
        }
    }


    public static void init() {
        System.out.println("Initializing server...");
        AuthzRegistry.configure(PersistenceContext.repositories().users(), new ExemploPasswordPolicy(),
                new PlainTextEncoder());
        PropertiesLoader.load();
//        new AppSettings();
    }

    public static void stop(Thread thread){
        thread.interrupt();
    }

    public static void update(){
        inicialState.clear();
        Iterable<jobApplication> allApplications = PersistenceContext.repositories().application().findAll();
        if (allApplications != null) {
            for (jobApplication  application : allApplications) {
                inicialState.add(application.getApplicationState());
            }
        }
    }
}