package lab0602;

import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Construct Students with (name and ID)
        Student A = new Student("A", 1);
        Student B = new Student("B", 2);
        Student C = new Student("C", 3);

        // Construct Courses with (course_name)
        Course oop = new Course("Object Oriented Programming");
        Course discreteStructure = new Course("Discrete Structure");
        Course cal2 = new Course("Calculus II");


        // Student add course to their course_list
        A.addCourse(oop);
        A.addCourse(discreteStructure);
        A.addCourse(cal2);

        B.addCourse(oop);
        B.addCourse(cal2);

        C.addCourse(oop);
        C.addCourse(discreteStructure);



        // Logging each Course status
        oop.logStudentList();
        discreteStructure.logStudentList();
        cal2.logStudentList();
        


        System.out.println();

        // ========Custom Command========

        oop.dropStudent(A); // Drop student by Student Object
        cal2.dropStudentByName("C"); // Drop student by student's name
        B.clearCourse(); // B is clearing all course he has.

        System.out.println("==== Student removed =====");        

        oop.log(); // Log amount
        discreteStructure.log(); // Log amount
        cal2.log(); // Log amount

        oop.logStudentList(); 
        discreteStructure.logStudentList();
        cal2.logStudentList();

    }
}