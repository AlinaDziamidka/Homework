package com.itacademy.brest.hw_7_8.Task5_College;

public class TestTask5 {
    public static void main(String[] args) {

        College college = new College(new Course[10], new Student[10]);


        Student student1 = new Student("Alina", 1998);
        Student student2 = new Student("Denis", 1996);
        Student student3 = new Student("Ihar", 2000);
        Student student4 = new Student("Alice", 2010);

        Course course1 = new Course("Math", 2023);
        Course course2 = new Course("English", 2023);
        Course course3 = new Course("Law", 2023);
        Course course4 = new Course("Physics", 2023);

        college.addCourse(course1);
        college.addCourse(course2);
        college.addCourse(course3);
        college.addCourse(course4);

        System.out.println();

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
        college.addStudent(student4);

        System.out.println();

        college.listCourses();
        college.listStudents();

        System.out.println();

        college.enrollStudentInCourse("Alina", "Law");
        college.enrollStudentInCourse("Alina", "Physics");
        college.enrollStudentInCourse("Alina", "English");
        college.enrollStudentInCourse("Denis", "English");
        college.enrollStudentInCourse("Denis", "Math");
        college.enrollStudentInCourse("Ihar", "Physics");
        college.enrollStudentInCourse("Ihar", "Math");
        college.enrollStudentInCourse("Ihar", "Law");
        college.enrollStudentInCourse("Alice", "Physics");
        college.enrollStudentInCourse("Alice", "Law");

        System.out.println();

        college.listCoursesForStudent("Alina");
        college.listCoursesForStudent("Denis");
        college.listCoursesForStudent("Ihar");
        college.listCoursesForStudent("Alice");

        System.out.println();

        student1.getDetails();
        student2.getDetails();
        student3.getDetails();
        student4.getDetails();

        System.out.println();

        course1.getDetails();
        course2.getDetails();
        course3.getDetails();
        course4.getDetails();
    }
}
