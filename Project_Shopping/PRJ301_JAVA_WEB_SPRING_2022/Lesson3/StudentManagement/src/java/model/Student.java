/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Le Hong Quan
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private double mark;
    private int classId;
    private String className;

    public Student() {
    }

    public Student(int id, String name, int age, double mark, int classId, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.classId = classId;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", mark=" + mark + ", classId=" + classId + ", className=" + className + '}';
    }

    
    
    
}
