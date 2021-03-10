public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    private static int studentNum = (int)(Math.random()*12345678);
    private int num;

    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNum += (int)(Math.random()*12345678);
        
    }



}
