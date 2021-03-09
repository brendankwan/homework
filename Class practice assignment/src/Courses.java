public class Courses {

    private String subjectName;
    private int studentGrade;

    public Courses(String subjectName,int studentGrade){
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }
    public String toString(){
        return "Subject name: " + subjectName + "\tGrade" + studentGrade;
    }




}
