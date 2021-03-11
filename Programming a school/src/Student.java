public class Student {

    //Fields of the Student class.
    private String firstName;
    private String lastName;
    private int grade;
    private static int studentNum = (int)(Math.random()*12345678);
    private int num;


    //Making the student number unique by creating a random number and adding it to another random number.
    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNum += (int)(Math.random()*12345678);

    }
    //Setters and getters.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getStudentNum() {
        return studentNum;
    }

    public static void setStudentNum(int studentNum) {
        Student.studentNum = studentNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }




    //When student object is printed, shows name and grade.
    public String toString(){

        return "Student name: " + firstName + lastName +"|"+ "\tGrade: " + grade+ "|";
    }
}
