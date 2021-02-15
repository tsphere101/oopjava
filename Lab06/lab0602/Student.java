package lab0602;

public class Student {

    // Fields
    private int id;
    private String name;
    MyDynamicArray<Course> course_list;





    // Consturctor
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        course_list = new MyDynamicArray<Course>();
    }
    public Student() {
        this("null" , -1);
    }
    // End Constructor






    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public MyDynamicArray<Course> getCourse() {
        return course_list;
    }





    // Method
    public void addCourse(Course course)
    {
        this.course_list.add(course);
        course.addStudent(this);
    }
    public void clearCourse()
    {
        for(int i = 0 ; i < course_list.getSize() ;i++)    
        {
            this.course_list.get(i).dropStudent(this);
        }
    }







    // Logging
    public void log()
    {
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student ID: " + this.getId());
        System.out.println("Enrolled Course:");
        logCourse();
    }

    public void logPersonalInformation()
    {
        System.out.println("Student Name: ");
    }

    public void logCourse()
    {
        for(int i = 0 ; i < this.course_list.getSize(); i++)
        {
            System.out.println(this.course_list.get(i).getCourseName());
        }
    }






}
