package ru.sbt.pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("First case:");
        AbstractCommand mesWithLink = new MessageWithLinkToForm("German Gref", "https://www.sbt.ru/credits");
        mesWithLink.execute();

        System.out.println("Second case:");
        AbstractCommand emailWithForm =
                new NotificationEmailWithForm("German Gref", "credits", "GGref@sbt.ru");
        emailWithForm.execute();

        System.out.println("Third case:");
        mesWithLink.execute();
        emailWithForm.execute();
    }
}
