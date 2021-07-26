package ru.sbt.pattern;

abstract class AbstractCommand{
    String client;

    protected AbstractCommand(String client){
        this.client = client;
    }

    abstract void execute();
}