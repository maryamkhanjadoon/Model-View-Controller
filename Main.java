/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
class Model {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
class View {
    public void printData(String data) {
        System.out.println("Data: " + data);
    }
}
 class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setData(String data) {
        model.setData(data);
    }

    public String getData() {
        return model.getData();
    }

    public void updateView() {
        view.printData(getData());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the model, view, and controller
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Set the data and update the view
        controller.setData("Hello, MVC!");
        controller.updateView();
    }
}
