import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        //Create a School object.
    School windermere = new School("Vancouver","Windermere", 60);
    //Display location,name and age.
        System.out.println(windermere);
        //Add 3 teachers.
        windermere.addingATeacher("Ben","Dover","MATH");
        windermere.addingATeacher("Joe","Mama","ENGLISH");
        windermere.addingATeacher("Mike","Hawk","PHYSICS");
        //Teacher list after adding.
        System.out.println(windermere.teacherList);
        windermere.removeATeacher();
        //Teacher list after removing 1.
        System.out.println(windermere.teacherList);
        //Adding 10 students.
        windermere.addingAStudent("Mark","Dam",10);
        windermere.addingAStudent("Steven","Gong",10);
        windermere.addingAStudent("Brian","Le",10);
        windermere.addingAStudent("Jason","Pham",10);
        windermere.addingAStudent("Marcus","Jeh",10);
        windermere.addingAStudent("Dorothy","Zhao",10);
        windermere.addingAStudent("Paige","Book",10);
        windermere.addingAStudent("Plane","Air",10);
        windermere.addingAStudent("John","Ny",10);
        windermere.addingAStudent("Neil","Wario",10);
        //Student list after adding.
        System.out.println(windermere.studentList);
        windermere.remove2Student();
        //Student list after removing 2.
        System.out.println(windermere.studentList);




    }


}
