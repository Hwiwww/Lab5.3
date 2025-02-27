package org.example.commands;


public abstract class Commands {
    public final String name;

    protected Commands(String name) {
        this.name = name;
    }


    public abstract void execute(String[] args);


    public String getName() {
        return name;
    }


    public abstract String getDescription();

}
