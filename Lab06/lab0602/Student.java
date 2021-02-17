package lab0602;

/**
 * The class contains the student's basic management and data. 
 * Use with Course class.
 * 
 * @author TSphere
 */

public class Student {

    /**
     * The student id.
     */
    private int id;

    /**
     * The student name.
     */
    private String name;

    /**
     * The course taken by the student.
     */
    MyDynamicArray<Course> course_list;

    /**
     * Construct student with specifying name and id.
     * 
     * @param name Name of the student
     * @param id   ID of the student
     */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        course_list = new MyDynamicArray<Course>();
    }

    /**
     * Construct a student without specifying name and id.
     */
    public Student() {
        this("null", -1);
    }

    /**
     * Get student's ID.
     * 
     * @return ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Get student's name.
     * 
     * @return Name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Get course taken by the student.
     * @return Array of courses those the student take.
     */
    public MyDynamicArray<Course> getCourse() {
        return course_list;
    }

    /**
     * Add course to the course array that student take.
     * @param course
     */
    public void addCourse(Course course) {
        this.course_list.add(course);
        course.addStudent(this);
    }

    /**
     * Remove all courses the student took.
     */
    public void clearCourse() {
        for (int i = 0; i < course_list.getSize(); i++) {
            this.course_list.get(i).dropStudent(this);
        }
    }

    /**
     * Log the student's informations.
     */
    public void log() {
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student ID: " + this.getId());
        System.out.println("Enrolled Course:");
        logCourse();
    }

    /**
     * Log the student's personal informations.
     */
    public void logPersonalInformation() {
        System.out.println("Student Name: ");
    }

    /**
     * Log the courses taken by student.
     */
    public void logCourse() {
        for (int i = 0; i < this.course_list.getSize(); i++) {
            System.out.println(this.course_list.get(i).getCourseName());
        }
    }

}
