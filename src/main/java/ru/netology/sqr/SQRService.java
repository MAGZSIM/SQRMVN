package ru.netology.sqr;

public class SQRService {

    public int counter(int min, int max) {
        int amount = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= min)
                if (i * i <= max)
                    amount = amount + 1;

        }
        return amount;
    }
}
