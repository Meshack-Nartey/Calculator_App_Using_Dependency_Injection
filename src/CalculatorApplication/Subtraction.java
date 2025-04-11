package CalculatorApplication;

import java.util.Scanner;

public class Subtraction implements Computation {
    @Override
    public void performComputation(){
        int number1;
        int number2;

        int difference;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = input.nextInt();
        System.out.println("Enter the second number:");
        number2 = input.nextInt();
        difference = number1+number2;
        System.out.println("DIFFERENCE:"+ difference);
    }
}
