package com.tw.Menu;

import com.tw.Command.ICommand;

public class Menu{
    private String name;
    private ICommand command;

    public Menu(String name, ICommand command){
        this.name = name;
        this.command = command;
    }

    public ICommand getCommand() {
        return command;
    }

    public String getName() {
        return name;
    }
}


