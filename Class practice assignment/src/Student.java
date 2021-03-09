public class Student {
    private String firstName;
    private static int studentId;
    private String[] courses = new String[8];

    public Student(String firstName, int studentId, String[]courses){
        this.firstName = firstName;
        this.studentId = studentId++;
        this.courses = courses;
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

}
