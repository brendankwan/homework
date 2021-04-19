package sample;

public class Friend {
   private String name;
   private int age;
   private   int grade;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public Friend(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String toString(){
        return name;
    }
}
