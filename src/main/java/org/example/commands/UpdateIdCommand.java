package org.example.commands;

public class UpdateIdCommand extends Commands {
    public UpdateIdCommand() {
        super("update id");
    }

    @Override
    public void execute(String[] args) {
        System.out.println("обновить значение элемента коллекции, id которого равен заданному");
    }

    @Override
    public String getDescription() {
        return "this command updates the value of a collection item using id.";
    }
}
