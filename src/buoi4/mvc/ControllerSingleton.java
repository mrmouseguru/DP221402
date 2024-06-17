package buoi4.mvc;

public class ControllerSingleton {

    private static ControllerSingleton controller = null;

    private ControllerSingleton(){}

    public static ControllerSingleton makController(){
        if(controller == null){
            controller = new ControllerSingleton();
        }

        return controller;
    }



}
