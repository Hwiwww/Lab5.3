package org.example.commands;

public class UpdateIdCommand extends Commands {
    public UpdateIdCommand() {
        super("Update id");
    }

    @Override
    public void execute() {
        System.out.println("обновить значение элемента коллекции, id которого равен заданному");
    }

    @Override
    public String getDescription() {
        return "This command updates the value of a collection item using id.";
    }
}
