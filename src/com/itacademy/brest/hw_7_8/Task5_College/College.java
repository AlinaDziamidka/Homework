package com.itacademy.brest.hw_7_8.Task5_College;

import java.util.Objects;

public class College {

    private Course[] courses;

    private Student[] students;

    public College(Course[] courses, Student[] students) {
        this.courses = courses;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (Objects.isNull(courses[i])) {
                courses[i] = course;
                System.out.println("Course successfully added");
                return;
            }
        }
    }

    public void listCourses() {
        for (Course course : courses) {
            if (Objects.nonNull(course)) {
                System.out.print(course.getName() + ", ");
            }
        }
        System.out.println();
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (Objects.isNull(students[i])) {
                students[i] = student;
                System.out.println("Student successfully added");
                return;
            }
        }
    }

    public void listStudents() {
        for (Student student : students) {
            if (Objects.nonNull(student)) {
                System.out.print(student.getName() + ", ");
            }
        }
        System.out.println();
    }

    public void enrollStudentInCourse(String studentName, String courseName) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (Objects.nonNull(student) && student.getName().equals(studentName)) {
                for (int j = 0; j < courses.length; j++) {
                    Course course = courses[j];
                    if (Objects.nonNull(course) && course.getName().equals(courseName)) {
                        if (course.addStudent(student)) {
                            student.enrollInCourse(course);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void listCoursesForStudent(String studentName) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (Objects.nonNull(student) && student.getName().equals(studentName)) {
                student.listEnrolledCourses();
            }
        }
    }
}
