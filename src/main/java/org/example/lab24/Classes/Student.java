package org.example.lab24.Classes;

public class Student {
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public int get_number() {
        return _number;
    }

    public void set_number(int _number) {
        this._number = _number;
    }

    public int get_grade() {
        return _grade;
    }

    public void set_grade(int _grade) {
        this._grade = _grade;
    }

    private String _name;
    private String _surname;
    private int _number;
    private int _grade;

    public Student(String name, String surname, int number, int grade){
        this._name = name;
        this._surname = surname;
        this._number = number;
        this._grade = grade;
    }
}
