package org.example.lab24;

import org.example.lab24.Classes.Student;
import org.example.lab24.Classes.University;

import java.util.*;

public class MainService {
    private final static University university;

    static{
        university = new University();
    }

    public static int countAllStudents(){
        return university.countAllStudents();
    }

    public static String findFacultyWithMostStudents(){
        return university.findFacultyWithMostStudents();
    }

    public static ArrayList<Student> findStudentsWithGrade(){
        return university.findStudentsWithGrade();
    }
}
