package org.example;

import org.example.controller.StudentController;
import org.example.entitiy.StudentsEntity;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        StudentController sc = new StudentController();

        String menu;

        do {
            menu = JOptionPane.showInputDialog("""
                    Welcome to RiwiAcademy: \n
                    1.Manage students \n
                    2.Manage courses \n
                    3.Manage grades \n
                    4.Manage registrations
                    """);

            switch (menu){
                case "1" -> {
                    String menu1;
                    do {
                        menu1 = JOptionPane.showInputDialog("""
                                1.Create student
                                """);
                        switch (menu1){
                            case "1" -> {

                                int noi = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of identification of the student"));

                                String name = JOptionPane.showInputDialog("Please insert the name of the student");

                                String lastName = JOptionPane.showInputDialog("Please insert the last name of the student");

                                String email = JOptionPane.showInputDialog("Please insert the email of the student");

                                int course = Integer.parseInt(JOptionPane.showInputDialog("Please insert the id  of the course"));

                                String status = JOptionPane.showInputDialog("Please insert the status of the student");

                                StudentController result = sc.create(noi,name,lastName,email,course,status);

                                JOptionPane.showMessageDialog(null, result.toString());

                            }
                        }
                    }

                    while (!menu1.equals("2"));
                }
            }
        }while (!menu.equals("5"));
    }
}