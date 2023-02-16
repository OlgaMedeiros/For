package ru.netology.sqr;

public class SQRService {

    public int calc(int numberOne, int numberTwo) {

        int j = 0;

        for (int i = 10; i <= 99; i++) {

            int iSqr = i * i;
            if (iSqr >= numberOne) {
                if (iSqr <= numberTwo) {
                    j++;
                }
            }
        }
        return j;
    }
}