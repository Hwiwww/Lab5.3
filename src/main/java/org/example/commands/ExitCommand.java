package org.example.commands;

public class ExitCommand extends Commands {
    public ExitCommand() {
        super("Exit");
    }

    @Override
    public void execute() {
        System.out.println("завершить программу (без сохранения в файл)");
    }

    @Override
    public String getDescription() {
        return "This command terminates the program.";
    }
}
