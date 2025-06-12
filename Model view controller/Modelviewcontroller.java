/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller;

import modelviewcontroller.Model.Model;
import modelviewcontroller.controller.Controller;
import modelviewcontroller.view.View;

/**
 *
 * @author SP23-BSE-066
 */
public class Modelviewcontroller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Model m=new Model();
    View v=new View();
    Controller c=new Controller(m,v);
        c.addStudent("Ali",2,"sp23-bse-066");
        c.addStudent("Sara",3.5,"sp23-bse-678");
        c.addStudent("John",4,"sp23-bse-324");
        c.addStudent("Zara",1.5,"sp23-bse-325");

        System.out.println("All Students:");
        c.displayAllStudents();

        System.out.println("\nBad Students:");
        c.displayBadStudents();
        System.out.println("\nGood Students:");
        c.displaygoodStudents();
    }
    
}