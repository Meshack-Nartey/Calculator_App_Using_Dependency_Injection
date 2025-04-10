package CalculatorApplication;

import java.util.Scanner;

public class Addition implements Computation {
    @Override
    public void performComputation() {
        int number1;
        int number2;

        double sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = input.nextInt();
        System.out.println("Enter the second number:");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("SUM:"+ sum);
    }


    }

