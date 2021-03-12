public class Time {
    private int hour;
    private int minute;
    private int second;
    private int count;



    public Time(int hour, int minute, int second){
        if(second >= 60){
            count = (int)(second/60);
            minute = minute + count;
            second = second - 60*count;
        }
        if(minute >= 60 ){
            count = (int)(minute/60);
            minute = minute - 60*count;
            hour = hour + count;
        }
        if(hour >= 24){
            count = (int)(hour/24);
            hour = 

        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){

    }
    public String toString(){

    }

    public Time nextSecond(){

    }
    public Time previousSecond(){

    }
}
