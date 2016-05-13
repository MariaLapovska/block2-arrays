package com.epam.arrays.lab;

/**
 * Created by Asus on 12.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.processUser();
    }
}
