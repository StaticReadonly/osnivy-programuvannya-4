package org.example.lab24.Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Faculty {
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    private String _name;
    private ArrayList<Student> _students = new ArrayList<>();

    public void addStudent(Student s){
        _students.add(s);
    }

    public int countAllStudents(){
        int res = 0;
        Iterator itr = _students.iterator();
        while(itr.hasNext()){
            res++;
            itr.next();
        }
        return res;
    }

    public ArrayList<Student> findStudentsWithGrade(){
        ArrayList<Student> res = new ArrayList<>();

        for(Student s : _students){
            int g = s.getGrade();
            if (g >= 95 && g <= 100){
                res.add(s);
            }
        }

        return res;
    }
}
