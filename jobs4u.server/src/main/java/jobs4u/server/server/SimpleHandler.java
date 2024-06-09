package jobs4u.server.server;

import core.infrastructure.persistence.PersistenceContext;
import core.management.candidate.repository.CandidateRepository;
import core.management.costumer.repository.CustomerRepository;
import core.management.jobApplication.domain.ApplicationState;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import lombok.SneakyThrows;

import java.io.*;
import java.net.Socket;
import java.util.List;


public class SimpleHandler extends Handler {
    static ApplicationRepository applicationRepository = PersistenceContext.repositories().application();
    JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    UserRepository userRepository = PersistenceContext.repositories().users();
    CandidateRepository candidateRepository = PersistenceContext.repositories().candidate();
    CustomerRepository customerRepository = PersistenceContext.repositories().customer();

    public SimpleHandler(Socket socket) throws IOException {
        super(socket);
    }

    @SneakyThrows
    @Override
    public void handle() {
        System.out.println("\nNew client connected!");
//        try {
//            while (true) {
//                final int commtest = 0, disconn = 1, ack = 2, err = 3, auth = 4, app = 5, opn = 6;
//
//                byte[] request;
//                try {
//                    request = (byte[]) input.readObject();
//                } catch (EOFException e) {
//                    System.out.println("Connection closed!");
//                    break; // Sair do loop ao detectar EOFException
//                }
//                DecodedMessage decodedmessage = DecodedMessage.decodeMessage(request);
//                int code = decodedmessage.getCode();
//                int version = decodedmessage.getVersion();
//                Object decodedData1 = decodedmessage.getData1();
//                Object decodedData2 = decodedmessage.getData2();
//                System.out.println(Arrays.toString(request));
//
//
//                switch (code) {
//                    case app:
//                        List<String> applications = new ArrayList<>();
//                        Iterable<jobApplication> allApplications = applicationRepository.findAll();
//                        Optional<Candidate> candidate = candidateRepository.findByUsername(Username.valueOf(String.valueOf(decodedData1)));
//                        if (allApplications != null) {
//                            for (jobApplication jobApplication : allApplications) {
//                                    if (candidate.isPresent() && Objects.equals(jobApplication.Candidate(), candidate.get())) {
//                                        applications.add(jobApplication.toString());
//                                    }
//                            }
//                        }
//
//                        byte[] responseList = MessageBuilder.createMessage(version, code, applications, null);
//                        output.writeObject(responseList);
//                        //verificar se os dados são enviados
//                        output.flush();
//                        break;
//
//                    case opn:
//                        List<String> jobOpenings = new ArrayList<>();
//                        Iterable<JobOpening> allJobOpenings = jobOpeningRepository.findAll();
//                        Optional<Customer> customer = customerRepository.findByUsername(Username.valueOf(String.valueOf(decodedData1)));
//                        if (allJobOpenings != null) {
//                            for (JobOpening jobOpening : allJobOpenings) {
//                                if (customer.isPresent() && Objects.equals(jobOpening.getCustomer().user().username(), customer.get().user().username())) {
//                                    jobOpenings.add(jobOpening.toString());
//                                }
//                            }
//                        }
//
//                        byte[] responseListOpn = MessageBuilder.createMessage(version, code, jobOpenings, null);
//                        output.writeObject(responseListOpn);
//                        //verificar se os dados são enviados
//                        output.flush();
//                        break;
//
//                    case auth:
//                        int codeLogin = err;
//                        Optional<SystemUser> user = userRepository.ofIdentity(Username.valueOf(String.valueOf(decodedData1)));
//                        if (user.isPresent()) {
//                            SystemUserDetails candidateDetails = new SystemUserDetails(user.get());
//                            if (candidateDetails.getPassword().equals(String.valueOf(decodedData2)) && user.get().hasAny(ProjectRoles.CANDIDATE, ProjectRoles.CUSTOMER)) {
//                                codeLogin = ack;
//                            }
//                        }
//
//                        byte[] responseLogin = MessageBuilder.createMessage(version, codeLogin, null, null);
//                        output.writeObject(responseLogin);
//                        break;
//
//                    case commtest:
//                        byte[] responseCommtest = MessageBuilder.createMessage(version, ack, null, null);
//                        output.writeObject(responseCommtest);
//                        break;
//
//                    case disconn:
//                        byte[] responseDisconn = MessageBuilder.createMessage(version, ack, null, null);
//                        output.writeObject(responseDisconn);
//                        socket.close();
//                        break;
//
//                    default:
//                        byte[] responseError = MessageBuilder.createMessage(version, err, "Invalid message!", null);
//                        output.writeObject(responseError);
//                }
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static boolean hasMyAttributeChanged(List<ApplicationState> previous) {
        Iterable<jobApplication> allApplications = PersistenceContext.repositories().application().findAll();
        int index = 0;
        for (jobApplication application : allApplications){
            ApplicationState currentState = application.getApplicationState();
            if (!currentState.equals(previous.get(index))) {
                return true;
            }
            index++;
        }
        return false;
    }

    public static List<ApplicationState> updateInitialPhases(List<ApplicationState> initialPhases) {
        initialPhases.clear();
        Iterable<jobApplication> allApplications = PersistenceContext.repositories().application().findAll();
        for (jobApplication application : allApplications) {
            initialPhases.add(application.getApplicationState());
        }
        return initialPhases;
    }

    public static jobApplication getAttributeChanged(List<ApplicationState> previous) {
        Iterable<jobApplication> allApplications = PersistenceContext.repositories().application().findAll();
        int index = 0;
        for (jobApplication application : allApplications){
            ApplicationState currentState = application.getApplicationState();
            if (!currentState.equals(previous.get(index))) {
                return application;
            }
            index++;
        }
        return null;
    }
}
