public class Main {
//parameter for now has to be an positive integer perfect squares


    public static int[] addOn(int[] array, int value) {

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
    public static int[] delete(int[]array){
       int [] newarray2 = new int [array.length-1];
        for (int i = 0; i< newarray2.length; i++){
            newarray2[i] = array[i];
        }
        return newarray2;
    }
    public static int[] insert(int[]array,int value){
        int [] newarray3 = new int [array.length +1];

        for (int i = 0; i < array.length; i++){
            newarray3[i] = array[i];

        }
        newarray3[] = value;
        return newarray3;
    }



    public static void main(String[] args) {
    int[]array = new int [5];
    for(int i = 0; i< array.length; i++){
     array[i] = i+1;
        System.out.println("index:" + i + "value:" + array[i]);
    }
    int[]addNumberTo = addOn(array, 1);
    for(int number : addNumberTo){
        System.out.println(number);
    }
    int [] array2 = new int[5];
    for (int i = 0;i < array.length;i++){
        array2[i] = i+1;
        System.out.println("index:" + i + "value:" + array2[i]);
    }
    int[] delete = delete(array2);
        System.out.println();
        for (int i = 0;i < delete.length;i++){
            array2[i] = i+1;
            System.out.println("index:" + i + "value:" + delete[i]);
        }
        int[] array3 = new int[5];
        for (int i = 0; i < array3.length; i ++){
            array3[i] = i + 1 ;
            System.out.println("index:" + i + "value:" + array3[i]);
        }
        int[]insert = insert(array3,3);
        for(int i = 0; i< insert.length; i++){
            array3[i] = i + 1;
            System.out.println("index:" + i + "value:" + insert[i]);
        }










    }
}
