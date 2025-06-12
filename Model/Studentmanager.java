/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller.Model;
import modelviewcontroller.Model.Model;
import modelviewcontroller.controller.Controller;
import modelviewcontroller.view.View;
/**
 *
 * @author SP23-BSE-066
 */
public class Studentmanager {
    private String name;
    private String rollno;
    private double CGPA;

    public Studentmanager(String name, double CGPA,String rollno) {
        this.name = name;
        this.CGPA = CGPA;
        this.rollno=rollno;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }
     public String getroll() {
        return rollno;
    }
}
