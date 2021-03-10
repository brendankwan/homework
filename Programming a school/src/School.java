import java.util.ArrayList;

public class School {
    //Fields of my choosing.
    private String location;
    private String name;
    private int age;
    //ArrayList of Student and Teacher.
    ArrayList <Teacher> teacherList = new ArrayList<>();
    ArrayList <Student> studentList = new ArrayList<>();
    //School constructor.
    public School(String location,String name, int age) {
        this.location = location;
        this.name = name;
        this.age= age;
    }
    //Adding 3 new teachers in teacher arraylist.
    public void addingATeacher(String teacherFirstName,String teacherLastName, String subject){
    Teacher hired = new Teacher(teacherFirstName,teacherLastName,subject);
    if(teacherList.size()<3){
        teacherList.add(hired);
    }
    }
    //Adding 10 new students to student arraylist.
    public void addingAStudent(String studentFirstName, String studentLastName, int grade){
        Student junior = new Student(studentFirstName,studentLastName,grade);
        if (studentList.size()<10){
            studentList.add(junior);
        }
    }
    //Removing 1 teacher at start of teacher list.
    public void removeATeacher(){
        teacherList.remove(0);
    }
    //Removing 2 students at start of student list.
    public void remove2Student(){
        studentList.remove(0);
        studentList.remove(1);
    }
    //Showing teacher list.
    public void showingTeachers(){
        for(int i = 0; i < teacherList.size(); i++){
            System.out.println(teacherList.get(i));
        }
    }
    //Showing student list.
    public void showingStudents(){
        for(int i =0; i <studentList.size(); i ++){
            System.out.println(studentList.get(i));
        }
    }







    //setters and getters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //When School object is printed, shows location, name and age.
    public String toString(){
        return "Location: " + location + "\tName: " + name + "\tAge: " + age;

    }


}
