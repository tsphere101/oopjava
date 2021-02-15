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

    // Remove Student by ID
    public void dropStudentById(int id) {
        for (int i = 0; i < student_in_couse.getSize(); i++) {
            if (student_in_couse.get(i).getId() == id) {
                student_in_couse.drop(i);
            }
        }
    }

    // Remove all student in the course
    public void clear() {
        for (int i = 0; i < student_in_couse.getSize(); i++) {
            student_in_couse.drop();
        }

    }

    public void addStudent(Student student) {
        student_in_couse.add(student);
    }

}
