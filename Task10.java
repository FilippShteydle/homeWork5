public class Task10 {

    public static void main(String[] args) {

        boolean flag = false;

        for (int i = 2520; i <= 1000000000; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                for (int j = 1; j <= 20; j++) {
                    if (i % j == 0) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            } else flag = false;
            if (flag) {
                System.out.println(i);
                break;
            }
        }
    }
}
