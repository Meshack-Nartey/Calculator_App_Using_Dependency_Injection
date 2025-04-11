package CalculatorApplication;

import java.util.Scanner;

// MAIN ENTRY
public class Main {
public static void main(String[] args) {
    //Injecting one of the operations(CalculatorApplication.Addition) into CalculatorApplication.CalculatorService.
    int choice;
    Scanner input = new Scanner(System.in);
    System.out.print("""
            What computation do you want to perform:
            1.Addition
            2.Division
            3.Multiplication
            4.Subtraction
            """);
       choice = input.nextInt();
    switch (choice) {
        case 1:
            CalculatorService  addition = new CalculatorService(new Addition());
            break;
        case 2:
            CalculatorService division = new CalculatorService(new Division());
            break;
        case 3:
            CalculatorService multiplication = new CalculatorService(new Multiplication());
            break;
        case 4:
            CalculatorService subtraction = new CalculatorService(new Subtraction());
        default:
            System.out.println("You entered an invalid choice");
    }

    //perform calculation
    CalculatorService.calculate();
}
}