import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        Student joe = new Student( "joe");
        System.out.println(joe);
        joe.addACourse("English",60);
        joe.addACourse("MATH",56);
        joe.addACourse("SOCIAL",89);
        joe.addACourse("PE",70);
        joe.addACourse("ART",60);
        joe.addACourse("BAND",65);
        joe.addACourse("HISTORY",60);
        joe.addACourse("CHEM",75);
        joe.showMyCourses();
        System.out.println("Average: " + joe.averageGrade());


    }
}
