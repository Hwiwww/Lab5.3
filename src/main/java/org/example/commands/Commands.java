package org.example.commands;


public abstract class Commands {
    private final String name;

    protected Commands(String name) {
        this.name = name;
    }


    public abstract void execute();


    public String getName() {
        return name;
    }


    public abstract String getDescription();

}
