/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller.view;
import java.util.List;
import modelviewcontroller.Model.Model;
import modelviewcontroller.Model.Studentmanager;
import modelviewcontroller.controller.Controller;
import modelviewcontroller.view.View;
/**
 *
 * @author SP23-BSE-066
 */
public class View {
    
    public void printStudents(List<Studentmanager> students) {
        System.out.println("Student List:");
        for (Studentmanager s : students) {
            System.out.println("Name: " + s.getName() + ", CGPA: " + s.getCGPA());
        }
    }
}
