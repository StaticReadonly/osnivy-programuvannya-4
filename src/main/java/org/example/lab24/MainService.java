package org.example.lab24;

import org.example.lab24.Classes.Faculty;
import org.example.lab24.Classes.Student;
import org.example.lab24.Classes.University;

import java.util.*;

public class MainService {
    private final static University university;

    static{
        Student s1 = new Student("name1", "surname1", 1, 90);
        Student s2 = new Student("name2", "surname2", 2, 20);
        Student s3 = new Student("name3", "surname3", 3, 30);
        Student s4 = new Student("name4", "surname4", 4, 40);
        Student s5 = new Student("name5", "surname5", 5, 50);
        Student s6 = new Student("name6", "surname6", 6, 60);
        Student s7 = new Student("name7", "surname7", 7, 70);
        Student s8 = new Student("name8", "surname8", 8, 80);
        Student s9 = new Student("name9", "surname9", 9, 95);
        Student s10 = new Student("name10", "surname10", 10, 100);
        Student s11 = new Student("name11", "surname11", 11, 98);
        Student s12 = new Student("name12", "surname12", 12, 50);
        Student s13 = new Student("name13", "surname13", 13, 50);

        ArrayList<Student> l1 = new ArrayList<>();
        ArrayList<Student> l2 = new ArrayList<>();
        ArrayList<Student> l3 = new ArrayList<>();
        ArrayList<Student> l4 = new ArrayList<>();
        ArrayList<Student> l5 = new ArrayList<>();

        l1.add(s1); l1.add(s3); l1.add(s4); l1.add(s8);
        l2.add(s10); l2.add(s5);
        l3.add(s13); l3.add(s2); l3.add(s7); l3.add(s9); l3.add(s11);
        l5.add(s6); l5.add(s12);

        Faculty f1 = new Faculty("Faculty1", l1);
        Faculty f2 = new Faculty("Faculty2", l2);
        Faculty f3 = new Faculty("Faculty3", l3);
        Faculty f4 = new Faculty("Faculty4", l4);
        Faculty f5 = new Faculty("Faculty5", l5);

        HashMap<String, Faculty> faculties = new HashMap<>();

        faculties.put(f1.get_name(), f1);
        faculties.put(f2.get_name(), f2);
        faculties.put(f3.get_name(), f3);
        faculties.put(f4.get_name(), f4);
        faculties.put(f5.get_name(), f5);

        university = new University("University1", faculties);
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
