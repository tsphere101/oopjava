package lab0602;

public class Course {

    // Fields
    private MyDynamicArray<Student> student_in_couse;
    private String course_name;

    // Constructor
    public Course() {
        this("No Name", 0);
    }

    public Course(String name) // Constructor for Course name defined
    {
        this(name, 0);
    }

    public Course(String name, int student_amount) {
        this.course_name = name;
        student_in_couse = new MyDynamicArray<Student>(student_amount);
    }
    // End Constructors

    // Data field config
    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }

    // Getters ======================

    // Get Course Name
    public String getCourseName() {
        return course_name;
    }

    // Get Student in couse amount
    public int getStudentAmount() {
        return student_in_couse.getSize();
    }

    // Method ================

    // Remove Student by Index
    public void dropStudent(int index) {
        student_in_couse.drop(index);
    }

    public void dropStudent(Student student)
    {
        for(int i = 0 ; i < student_in_couse.getSize();i++)
        {
            if(student_in_couse.get(i).equals(student))
            {
                student_in_couse.drop(i);
            }
        }
    }

    // Remove Student by ID
    public void dropStudentById(int id) {
        for (int i = 0; i < student_in_couse.getSize(); i++) {
            if (student_in_couse.get(i).getId() == id) {
                student_in_couse.drop(i);
            }
        }
    }

    // Remove Student by Name
    public void dropStudentByName(String name)
    {
        boolean check_if_exist = false;
        for (int i = 0 ; i < student_in_couse.getSize(); i++) {
            if(student_in_couse.get(i).getName().equals(name))
            {
                student_in_couse.drop(i);
                check_if_exist = true;
            }
        }
        if (check_if_exist == false)
        {
            System.out.println("There's no student named "+ name + " enrolled in " + this.getCourseName());
        }
    }

    // Remove all student in the course
    public void clear() {
        student_in_couse.clear();
    }

    public void addStudent(Student student) {
        student_in_couse.add(student);
    }



    // Log
    public void log()
    {
        System.out.println("Course Name::" + this.getCourseName());
        System.out.println("Student Amount::"+ this.getStudentAmount());
    }

    public void logStudentList()
    {
        System.out.println("=== " + this.getCourseName() + " Student List ===");
        for(int i = 0 ; i < student_in_couse.getSize(); i++)
        {
            System.out.println(student_in_couse.get(i).getName());
        }
    }

}
