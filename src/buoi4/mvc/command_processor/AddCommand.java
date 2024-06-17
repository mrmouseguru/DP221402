package buoi4.mvc.command_processor;

import buoi4.mvc.CalculatorModel;

public class AddCommand extends Command{
    private double num1;
    private double num2;

    public AddCommand(CalculatorModel calculatorModelRemote, 
    double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        this.calculatorModelRemote = calculatorModelRemote;
    }

    @Override
    public void execute() {
        calculatorModelRemote.add(num1, num2);
    }

}
