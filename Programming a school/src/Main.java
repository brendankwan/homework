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
        System.out.println("Removing 1 teacher from above.");
        System.out.println(windermere.teacherList);
        //Adding 10 students.
        windermere.addingAStudent("Mark","Dam",10);
        windermere.addingAStudent("Steven","Gong",11);
        windermere.addingAStudent("Brian","Le",12);
        windermere.addingAStudent("Jason","Pham",9);
        windermere.addingAStudent("Marcus","Jeh",8);
        windermere.addingAStudent("Dorothy","Zhao",11);
        windermere.addingAStudent("Paige","Book",10);
        windermere.addingAStudent("Plane","Air",12);
        windermere.addingAStudent("John","Ny",8);
        windermere.addingAStudent("Neil","Wario",11);
        //Student list after adding.
        System.out.println(windermere.studentList);
        windermere.remove2Student();
        //Student list after removing 2.
        System.out.println("Removing 2 students from above.");
        System.out.println(windermere.studentList);




    }


}
