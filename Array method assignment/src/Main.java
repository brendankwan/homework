public class Main {
//parameter for now has to be an positive integer perfect squares
    //if the method doe not find a square root return -1
    //find sqroot of any number
    public static int[] addOn(int[]array, int number){
        int[]newarray = new int [array.length+1];
        //loop thru array
        //copy old array to new array
        //addon the number to last position
        return newarray;
    }






    static double pyth(double a, double b){
        return squareRoot(a*a + b*b);
    }
    static double squareRoot(double num){
        //check algorithm
        //square root of num is equal ans when ans * ans - num
        double epsilon = 0.0001;
        double ans = 0;
        double increment = 0.001;
        int count = 0;
        while (Math.sqrt(ans*ans-num)< epsilon) {
            ans+= increment;
            count ++;
        }
        if(Math.sqrt(ans*ans - num) < epsilon) {
            System.out.println("Found square at count:" + count + "It is: " + ans);
            return ans;
        }
        else
            System.out.println("Failed to find square root.");
            return ans;

    }

    public static void main( String[] args ){
      System.out.println(squareRoot(25));
    }

}
