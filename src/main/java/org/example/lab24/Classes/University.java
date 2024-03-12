package org.example.lab24.Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class University {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "University1";

    private HashMap<String, Faculty> _faculties = new HashMap<>();

    public void addFaculty(Faculty faculty){
        if (_faculties.containsKey(faculty.get_name())){
            throw new RuntimeException("Faculty is already present in hashmap");
        }
        else{
            _faculties.put(faculty.get_name(), faculty);
        }
    }

    public int countAllStudents(){
        int res = 0;
        Iterator itr = _faculties.keySet().iterator();
        while(itr.hasNext()){
            res += ((Faculty)itr.next()).countAllStudents();
        }
        return res;
    }

    public String findFacultyWithMostStudents(){
        Faculty res = null;
        Iterator<String> itr = _faculties.keySet().iterator();
        while(itr.hasNext()){
            if (res == null){
                res = _faculties.get(itr.next());
            }
            else{
                Faculty c = _faculties.get(itr.next());
                if (c.countAllStudents() > res.countAllStudents()){
                    res = c;
                }
            }
        }

        if (res == null){
            throw new RuntimeException("University has no faculties");
        }
        return res.get_name();
    }

    public ArrayList<Student> findStudentsWithGrade(){
        ArrayList<Student> res = new ArrayList<>();

        for(String name : _faculties.keySet()){
            res.addAll(_faculties.get(name).findStudentsWithGrade());
        }

        return res;
    }
}
