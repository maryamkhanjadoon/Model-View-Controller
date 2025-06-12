/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller.Model;
import java.util.ArrayList;
import java.util.List;
import modelviewcontroller.Model.Model;
import modelviewcontroller.controller.Controller;
import modelviewcontroller.view.View;
/**
 *
 * @author SP23-BSE-066
 */
public class Model {
      private List<Studentmanager> students = new ArrayList<>();

    public void addStudent(Studentmanager student) {
        students.add(student);
    }

    public List<Studentmanager> getAllStudents() {
        return students;
    }

    public List<Studentmanager> getBadStudents() {
        List<Studentmanager> badStudents = new ArrayList<>();
        for (Studentmanager s : students) {
            if (s.getCGPA() < 2) { 
                badStudents.add(s);
            }
        }
        return badStudents;
    }
     public List<Studentmanager> getgoodStudents() {
        List<Studentmanager> goodStudents = new ArrayList<>();
        for (Studentmanager s : students) {
            if (s.getCGPA() > 3) { 
                goodStudents.add(s);
            }
        }
        return goodStudents;
    }
}
