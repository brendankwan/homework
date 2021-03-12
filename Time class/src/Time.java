public class Time {
    private String zero1;
    private String zero2;
    private String zero3;
    private int hour;
    private int minute;
    private int second;
    private int count;



    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
    public String addZeroToHour(){
        if(hour<9){
            zero1 = "0";
        }
        
    }

    public void setHour(int hour) {

        if(hour >= 24){
            count = (int)(hour/24);
            hour = hour - 24*count;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute >= 60 ){
            count = (int)(minute/60);
            minute = minute - 60*count;
            hour = hour + count;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second >= 60){
            count = (int)(second/60);
            minute = minute + count;
            second = second - 60*count;
        }
        this.second = second;

    }






    public void setTime(int hour, int minute, int second){
        if(second >= 60){
            count = (int)(second/60);
            minute = minute + count;
            second = second - 60*count;
        }
        this.second = second;
        if(minute >= 60 ){
            count = (int)(minute/60);
            minute = minute - 60*count;
            hour = hour + count;
        }
        this.minute = minute;
        if(hour >= 24){
            count = (int)(hour/24);
            hour = hour - 24*count;
        }
        this.hour = hour;

    }
    public String toString(){
        return "" + hour + minute + second;


    }

    //public Time nextSecond(){

    //}
    //public Time previousSecond(){

    //}
}
