package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        {
            int sqr = service.counter(300, 600);
            System.out.println(sqr);
        }

    }
}