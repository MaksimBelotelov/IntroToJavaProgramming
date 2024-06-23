package org.example.ch13;

/*
(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.
 */

import java.util.Arrays;

public class Ex13_13 {
    public static void main(String[] args) {
        Course course1 = new Course("Course");
        course1.addStudent("Ivan");
        course1.addStudent("Maksim");

        Course course2 = (Course)(course1.clone());
        course1.addStudent("Nataliya");
        course2.addStudent("Petr");

        System.out.println(course1.getNumberOfStudents());
        System.out.println(Arrays.toString(course1.getStudents()));
        System.out.println(course2.getNumberOfStudents());
        System.out.println(Arrays.toString(course2.getStudents()));
    }
}

class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Exercise 9.9
    }

    @Override
    public Object clone() {
        try {
            Course courseClone = (Course) super.clone();
            courseClone.students = students.clone();
            return courseClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
