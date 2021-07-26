package ru.sbt.pattern;

class NotificationMessage extends AbstractCommand{

    public NotificationMessage(String client){
        super(client);
    }

    @Override
    void execute() {
        System.out.println("Sms notification to " + client + " has benn send!");
    }
}