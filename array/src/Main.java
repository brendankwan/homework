public class Main {
    public static void main(String[] args) {
        //20 positions, random 1-6,count how many 1s.
        int[] numbers = new int[20];
        int count = 0;
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) ((Math.random() * 6) + 1);
            if (numbers[i] == 1) {
                count++;
            }
            System.out.println("index:" + i + " value:" + numbers[i]);
            System.out.println("count:" + count);
        }
        //10 positions, random 1-100, average
        int[] numbers2 = new int[10];
        int total = 0;
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) ((Math.random() * 100) + 1);
            total = numbers2[i] + total;
            System.out.println("index:" + i + " value:" + numbers2[i]);
        }
        int average = total / numbers2.length;
        System.out.println("Average: " + average);

        //swapping 2 different indexes from last array
        int swap1 = numbers2[1];
        int swap2 = numbers2[2];
        numbers2[1] = swap2;
        numbers2[2] = swap1;
        //reversing the order from last array
        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = numbers2[9-i];
            System.out.println("index:" + i + "\tvalue:" + numbers3[i]);

        }
    }
}
