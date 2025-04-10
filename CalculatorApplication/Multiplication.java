package CalculatorApplication;

import java.util.Scanner;

public class Multiplication implements Computation {
    public void performComputation() {
        int number1, number2;
        double product;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = input.nextInt();
        System.out.println("Enter the first number:");
        number2 = input.nextInt();
        product = (double)number1*number2;
        System.out.println("PRODUCT:"+ product);

    }



    }

