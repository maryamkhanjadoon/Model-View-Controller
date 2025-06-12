/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller.controller;

import java.util.List;
import modelviewcontroller.Model.Model;
import modelviewcontroller.Model.Studentmanager;
import modelviewcontroller.view.View;
import modelviewcontroller.controller.Controller;
/**
 *
 * @author SP23-BSE-066
 */
public class Controller {
   
     private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent(String name, double CGPA,String rollno) {
        Studentmanager s = new Studentmanager(name,CGPA,rollno);
        model.addStudent(s);
    }

    public void displayBadStudents() {
        List<Studentmanager> badStudents = model.getBadStudents();
        view.printStudents(badStudents);
    }
     public void displaygoodStudents() {
        List<Studentmanager> goodStudents = model.getgoodStudents();
        view.printStudents(goodStudents);
    }

    public void displayAllStudents() {
        List<Studentmanager> allStudents = model.getAllStudents();
        view.printStudents(allStudents);
    }
}
