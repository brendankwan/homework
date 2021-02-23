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
        int total = 0;
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) ((Math.random() * 100) + 1);
            total = numbers2[0]+numbers2[1]+numbers2[2]+numbers2[3]+numbers2[4]+numbers2[5]+numbers2[6]+numbers2[7]+numbers2[8]+numbers2[9];
            int average = total/numbers2.length;
            System.out.println(total);
            System.out.println("index:" + i + " value:" + numbers2[i]);
        }


    }
}
