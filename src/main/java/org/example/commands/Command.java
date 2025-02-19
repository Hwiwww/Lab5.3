package org.example.commands;

// Абстрактный класс команды, общие свойства всех команд
public abstract class Command {
    private final String name;

    protected Command(String name) {
        this.name = name;
    }

    // Абстрактный метод выполнения команды
    public abstract void execute();

    // Название команды
    public String getName() {
        return name;
    }

    // Описание команды
    public abstract String getDescription();

}
