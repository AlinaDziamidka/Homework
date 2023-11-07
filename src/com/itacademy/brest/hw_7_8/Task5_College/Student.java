package com.itacademy.brest.hw_7_8.Task5_College;

import java.util.Objects;

public class Student {

    private String name;
    private int yearOfBirthday;

    //usually we have unidirectional relationships. Course contains students
    private String[] courses = new String[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Student(String name, int yearOfBirthday) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
    }

    //we should not use enrollInCourse method in Student since only the college is responsible for managing students and courses.
    public void enrollInCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (Objects.isNull(courses[i])) {
                courses[i] = course.getName();
                System.out.println(name + " successfully register on " + course.getName());
                return;
            }
        }
    }

    //the college is responsible for managing students and courses.
    public void listEnrolledCourses() {
        for (String course : courses) {
            if (Objects.nonNull(course)) {
                System.out.print(course + ", ");
            }
        }
        System.out.println();
    }

    public void getDetails() {
        System.out.print("Name: " + name + ", YearOfBirthday: " + yearOfBirthday + ", Courses: ");
        for (String i : courses) {
            if (Objects.nonNull(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


