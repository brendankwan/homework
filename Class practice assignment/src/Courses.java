public class Courses {

    private String subjectName;
    private String studentGrade;

    public Courses(String subjectName,String studentGrade){
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }
    public String toString(){
        return "Subject name: " + subjectName;
    }




}
