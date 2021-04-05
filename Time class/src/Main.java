public class Main {

    public static void main(String[] args) {
 Time time = new Time(1,59,59);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time);
        System.out.println("Setting a new time.");
        time.setTime(2,59,59);
        System.out.println(time.nextSecond());
        System.out.println("Adding one second");
        System.out.println(time.previousSecond());
        System.out.println("Decreasing one second");
        System.out.println(time);


    }






}
