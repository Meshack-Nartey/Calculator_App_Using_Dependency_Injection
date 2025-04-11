package CalculatorApplication;

import java.util.Scanner;

public class Division implements Computation {
    @Override
    public void performComputation() {
        int number1;
        int number2;

        double quotient;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = input.nextInt();
        System.out.println("Enter the second number:");
        number2 = input.nextInt();
        quotient = (float) number1 / number2;
        System.out.println("QUOTIENT:"+ quotient);
    }
}
