# Calculator Application

## Overview
This is a simple calculator application that demonstrates the use of Dependency Injection in Java. The program is structured to support multiple computation operations such as addition, subtraction, and multiplication by implementing a common interface.

## Classes and Their Functions

1. **CalculatorApp**  
   - The entry point of the application.
   - Instantiates the `CalculatorService` with a specific computation type.
   - Initiates the computation process.

2. **CalculatorService**  
   - Acts as a service layer for performing calculations.
   - Depends on an implementation of the `Computation` interface.
   - Delegates the computation task to the injected computation class.

3. **Computation (Interface)**  
   - Defines a contract for computation operations.
   - Any class implementing this interface must provide an implementation for the computation logic.

4. **Addition, Subtraction, Multiplication (Implementations of Computation)**  
   - Implement the `Computation` interface.
   - Provide specific logic for performing addition, subtraction, or multiplication.

## How It Works
- The `CalculatorApp` initializes the `CalculatorService` with a computation type (e.g., `Addition`).
- The `CalculatorService` calls the `performComputation()` method on the injected computation class.
- The computation class interacts with the user to receive input and performs the necessary calculation.
- The result is displayed on the console.

This structure makes it easy to extend the application by adding new computation types without modifying existing code, following the Open-Closed Principle of SOLID design.

