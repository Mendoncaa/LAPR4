/* 
package app.backoffice.apresentacao;

import core.util.MainMenuUI;
import core.util.ExitUI;


// import org.springframework.stereotype.Component;
import core.util.MenuItem;
import core.util.UI;
import java.util.ArrayList;
import java.util.List;
import app.backoffice.apresentacao.RegisterApplicationUI;


public class ApplicationUI implements UI {

    private final RegisterApplicationUI registerApplicationUI;
    private final MainMenuUI applicationManagementMainMenuUI;

    public ApplicationUI(RegisterApplicationUI registerApplicationUI) {
        this.registerApplicationUI = registerApplicationUI;
        this.applicationManagementMainMenuUI = new MainMenuUI(options(), "Application Management Main Menu");
    }

    @Override
    public void show() {
        applicationManagementMainMenuUI.show();
    }

    private List<MenuItem> options() {
        List<MenuItem> options = new ArrayList<>();
        options.add(new MenuItem("Register Application", registerApplicationUI));
        options.add(new MenuItem("Exit to Main Menu", new ExitUI()));
        return options;
    }
}
*/
