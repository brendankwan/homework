import java.util.ArrayList;

public class Student {
    private String firstName;
    private static int id =0 ;
    private int studentId;
    private ArrayList<Courses> list = new ArrayList<>();


    public Student(String firstName) {
        this.firstName = firstName;
        this.studentId = id++;

    }


    public void addACourse(String subject, int studentGrade) {
        Courses add = new Courses(subject, studentGrade);
        if (list.size() < 8) {
            list.add(add);
        }
    }
    public int averageGrade(){
        int total = 0;
        for(int i = 0; i < list.size();i++){
            total = total + list.get(i).getStudentGrade();
        }
        return total/ list.size();
    }


    public void showMyCourses(){
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }



    public String toString() {
        return "Student id: " + id + "\tStudent name: " + firstName;
    }

    }







