package org.example.commands;


import org.example.a.CollectionManager;

public abstract class Commands {
    public final String name;

    protected Commands(String name) {
        this.name = name;
    }


    public abstract void execute();


    public String getName() {
        return name;
    }


    public abstract String getDescription();

}
