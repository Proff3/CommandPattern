package ru.sbt.pattern;

class NotificationEmailWithForm extends AbstractCommand {
    String email;
    String form;

    public NotificationEmailWithForm(String client, String form, String email){
        super(client);
        this.form = form;
        this.email = email;
    }

    @Override
    void execute(){
        System.out.println("Email with form on " + form + " has been sent to " + client + " on email " + email);
        NotificationMessage nf = new NotificationMessage(client);
        nf.execute();
    }
}
