public class Task09 {

    public static void main(String[] args) {
        int rezult = 0;

        for (int i = 0; i < 1000; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                rezult += i;
            }
        }
        System.out.println(rezult);
    }

}
