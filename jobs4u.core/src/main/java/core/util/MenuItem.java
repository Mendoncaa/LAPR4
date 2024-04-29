package core.util;

import lombok.SneakyThrows;


import java.util.Objects;

public class MenuItem implements UI {

    private final String description;
    private final UI ui;

    public MenuItem(String description, UI ui)
    {
        if (description.isBlank())
            throw new IllegalArgumentException("MenuItem description cannot be null or empty.");
        if (Objects.isNull(ui))
            throw new IllegalArgumentException("MenuItem does not support a null UI.");

        this.description = description;
        this.ui = ui;
    }

    public boolean hasDescription(String description)
    {
        return this.description.equals(description);
    }

    public String toString()
    {
        return this.description;
    }

    @SneakyThrows
    @Override
    public void show() {
        this.ui.show();
    }
}