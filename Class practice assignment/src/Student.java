public class Student {
    private String firstName;
    private static int studentId;
    private String[] courses = new String[8];

    public Student(String firstName, int studentId, String[]courses){
        this.firstName = firstName;
        this.studentId = studentId++;
        this.courses = courses;
    }




}
