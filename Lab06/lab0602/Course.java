package lab0602;

/**
 * The class contains course's basic management, using in SchoolObjectExperiment project.
 * 
 * @author TSphere
 * 
 */

public class Course {

    /**
     * Dynamic array that store students in the course.
     */
    private MyDynamicArray<Student> student_in_couse;

    /**
     * Course name.
     */
    private String course_name;

    /**
     * Construct a course without course'name.
     */
    public Course() {
        this("No Name", 0);
    }

    /**
     * Construct a course with specify the name of the course.
     * @param name name of the course
     */
    public Course(String name) 
    {
        this(name, 0);
    }

    /**
     * Construct a couse with sprcifying course's name and course's student amount.
     * @param name name of the course
     * @param student_amount amount of student think will be in the course
     */
    public Course(String name, int student_amount) {
        this.course_name = name;
        student_in_couse = new MyDynamicArray<Student>(student_amount);
    }

    /**
     * Set the name of the course.
     * @param course_name the name of the course
     */
    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }


    /**
     * Get the name of the course.
     * @return course's name
     */
    public String getCourseName() {
        return course_name;
    }

    /**
     * Get the amount of the student in course.
     * @return amount of the student in course
     */
    public int getStudentAmount() {
        return student_in_couse.getSize();
    }

    /**
     * Remove a student in course by index.
     * @param index the index of the student stored in the array
     */
    public void dropStudent(int index) {
        student_in_couse.drop(index);
    }

    /**
     * Remove a student in course by the student's object.
     * @param student Student object
     */
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

    /**
     * Remove a student in course by specifying student's id.
     * @param id ID of the student
     */
    public void dropStudentById(int id) {
        for (int i = 0; i < student_in_couse.getSize(); i++) {
            if (student_in_couse.get(i).getId() == id) {
                student_in_couse.drop(i);
            }
        }
    }

    /**
     * Remove a student in course by specifying student's name.
     * @param name name of the student.
     */
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

    /**
     * Remove all students in course.
     */
    public void clear() {
        student_in_couse.clear();
    }

    /**
     * Add a student in course.
     * @param student student's object
     */
    public void addStudent(Student student) {
        student_in_couse.add(student);
    }



    /**
     * Log to console the course's informations.
     */
    public void log()
    {
        System.out.println("Course Name::" + this.getCourseName());
        System.out.println("Student Amount::"+ this.getStudentAmount());
    }

    /**
     * Log to console the list of students in the course.
     */
    public void logStudentList()
    {
        System.out.println("=== " + this.getCourseName() + " Student List ===");
        for(int i = 0 ; i < student_in_couse.getSize(); i++)
        {
            System.out.println(student_in_couse.get(i).getName());
        }
    }

}
