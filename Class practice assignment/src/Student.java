public class Student {
    private String firstName;
    private static int studentId;
    private String[] courses = new String[8];

    public Student(String firstName, int studentId){
        this.firstName = firstName;
        this.studentId = studentId;
        studentId++;
    }

    public String getFirstName() {
        return firstName;
    }

    public static int getStudentId() {
        return studentId;
    }

    public String[] getCourses() {
        return courses;
    }
    public String toString(){
        return "Student id: " + studentId + "\tStudent name: " + firstName;
    }

<<<<<<< HEAD
=======

>>>>>>> 81a6d75631a90daed49ee199f41fee8e5d2b54d9
}
