/*
package shared.common.presentation.common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import sem4pi.shared.common.util.Console;
import sem4pi.shared.common.util.MenuItem;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class MainMenuUI implements UI {

    private List<MenuItem> options;

    private String description;

    @Override
    public void show() {
        List<MenuItem> options = getOptions();
        int option;
        do
        {
            Console.showList(options, this.description);
            option = Console.readOption(1, options.size(), options.size());

            if ( (option >= 1) && (option < options.size())) {
                options.get(option - 1).show();
            }
        }
        while (option != options.size());
    }

    public List<MenuItem> getOptions() {
        return options;
    }
}
*/