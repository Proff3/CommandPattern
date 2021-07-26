package ru.sbt.pattern;

class MessageWithLinkToForm extends AbstractCommand{

    String link;

    public MessageWithLinkToForm(String client, String link){
        super(client);
        this.link = link;
    }

    @Override
    void execute() {
        System.out.println("Link to " + link + " has been sent to " + client + " in SMS");
    }
}