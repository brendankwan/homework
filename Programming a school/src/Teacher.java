public class Teacher {

    //fields of the teacher class.
    private String firstName;
    private String lastName;
    private String subject;

    //Teacher constructor with first name, last name, subject.
    public Teacher(String firstName,String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    //setters and getters.
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //When Teacher object is printed, shows name and subject.
    public String toString(){
        return "Name: " + firstName + lastName + "\tSubject: " + subject;
    }
}
