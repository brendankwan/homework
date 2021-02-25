public class Main {
//parameter for now has to be an positive integer perfect squares


    public static int[] addOn(int[] array, int value) {
        System.out.println("Add new value to the end of an array");
        int[] newarray = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            newarray[i] = array[i];
            newarray[newarray.length - 1] = value;
        }
        //loop thru array
        //copy old array to new array
        //addon the number to last position
        return newarray;
    }





    public static void main(String[] args) {
        int[]array = {1,2,3,4,5};
        




    }
}
