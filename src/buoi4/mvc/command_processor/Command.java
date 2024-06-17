package buoi4.mvc.command_processor;

import buoi4.mvc.CalculatorModel;

public abstract class Command {
    protected CalculatorModel calculatorModelRemote;
    public abstract void execute();
}
