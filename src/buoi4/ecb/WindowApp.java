package buoi4.ecb;

public class WindowApp {
    public static void main(String[] args) {
        CalculatorEntity calculatorEntityRemote = 
        new CalculatorEntity();

        CalculatorBoundary calculatorBoundaryRemote = 
        new CalculatorBoundary();

        calculatorBoundaryRemote.getCalculatorControlRemote()
        .setCalculatorEntityRemote(calculatorEntityRemote);

        // CalculatorControl2 calculatorControlRemote = new 
        // CalculatorControl2(calculatorBoundaryRemote, calculatorEntityRemote);

        //calculatorBoundaryRemote.
       // setCalculatorControlRemote(calculatorControlRemote);
    }

}
