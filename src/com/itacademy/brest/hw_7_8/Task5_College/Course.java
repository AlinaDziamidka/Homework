package com.itacademy.brest.hw_7_8.Task5_College;

import java.util.Objects;

public class Course {

    private String name;
    private Student[] students = new Student[5];

    private int courseYear;

    public Course(String name, int courseYear) {
        this.name = name;
        this.courseYear = courseYear;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        courseYear = courseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (Objects.isNull(students[i]) && (courseYear - student.getYearOfBirthday()) >= 16) {
                students[i] = student;
                return true;
            } else if (Objects.isNull(students[i]) && (courseYear - student.getYearOfBirthday()) < 16) {
                System.out.println("Student should be older 16 to register for this course");
                return false;
            }
        }
        return false;
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student + " ");
        }
    }

    public void getDetails() {
        System.out.print("Name: " + name + ", Students: ");
        for (Student student : students) {
            if (Objects.nonNull(student)) {
                System.out.print(student.getName() + " ");
            }
        }
        System.out.println();
    }
}
