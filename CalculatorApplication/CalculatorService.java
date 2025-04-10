package CalculatorApplication;

public class CalculatorService{

    public Computation computation;
    // Constructor Injection: Inject a computation type (CalculatorApplication.Addition, CalculatorApplication.Multiplication, etc.)
    public CalculatorService(Computation computation) {
        this.computation = computation;
    }

    // Calls the injected computation method
    public void calculate(){
        computation.performComputation();


    }
}
