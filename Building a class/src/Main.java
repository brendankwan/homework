public class Main {
    public static void main(String[] args) {
        Employee ben = new Employee(22,"Ben","Ng", 22000);
        System.out.println(ben.getId());
        System.out.println(ben.getFirstName());
        System.out.println(ben.getLastName());
        System.out.println(ben.getName());
        System.out.println(ben.getSalary());
        ben.setSalary(22222);
        System.out.println(ben.annualSalary());
        System.out.println(ben.raiseSalary(5));
        System.out.println(ben);
    }
}
