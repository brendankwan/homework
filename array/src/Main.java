public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int count = 0;
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) ((Math.random() * 6) + 1);
            if (numbers[i]==1) {
                count++;
            } System.out.println("index:" + i + " value:" + numbers[i]);
            System.out.println("count:"+count);
        }

        int[] numbers2 = new int[10];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) ((Math.random() * 100) + 1);
            int average = numbers2[i]/numbers2.length;
            System.out.println("Average:"+average);
            System.out.println("index:" + i + " value:" + numbers2[i]);
        }


    }
}
