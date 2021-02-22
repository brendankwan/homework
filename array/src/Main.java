public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 0; i < 20;i++) {
            numbers[i] = (int) ((Math.random() * 6) + 1);
            System.out.println("index:" + i + " value:" + numbers[i]);
        }
            int[] numbers2 = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers2[i] = (int) ((Math.random() * 100) + 1);
                System.out.println("index:" + i + " value:" + numbers2[i]);



        }

    }
}
