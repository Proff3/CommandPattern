package ru.sbt.pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("First case:");
        AbstractCommand mesWithLink = new MessageWithLinkToForm("John Washington", "https://google.com/myopinion");
        mesWithLink.execute();

        System.out.println("Second case:");
        AbstractCommand emailWithForm =
                new NotificationEmailWithForm("John Washington", "interview about corporations", "JWashingtonIsTheBest@whitehouse.gov");
        emailWithForm.execute();

        System.out.println("Third case:");
        mesWithLink.execute();
        emailWithForm.execute();
    }
}
