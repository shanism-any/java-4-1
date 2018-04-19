package com.tw.Command;

public class Exit implements ICommand{

    @Override
    public void Execute() {
        System.exit(0);
    }
}
