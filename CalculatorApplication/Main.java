package CalculatorApplication;

// MAIN ENTRY
public class Main {
public static void main(String[] args) {
    //Injecting one of the operations(CalculatorApplication.Addition) into CalculatorApplication.CalculatorService.
    var CalculatorService = new CalculatorService(new Addition());

    //perform calculation
    CalculatorService.calculate();

}
}