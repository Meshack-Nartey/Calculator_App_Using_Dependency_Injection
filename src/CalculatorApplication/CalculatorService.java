package CalculatorApplication;

public class CalculatorService{

    public static Computation computation;
    // Constructor Injection: Inject a computation type (CalculatorApplication.Addition, CalculatorApplication.Multiplication, etc.)
    public CalculatorService(Computation computation) {
        CalculatorService.computation = computation;
    }

    // Calls the injected computation method
    public static void calculate(){
        computation.performComputation();


    }
}
