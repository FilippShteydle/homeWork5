import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;

        for (int i = 1, j = 1; j < x; i++) {
           j = (int)Math.pow(2, i);
            count++;
        }
        for (int i = count; i > 0; i--) {

            if (x >= Math.pow(2, i-1)) {
                System.out.print("1");
                x = (int) (x - Math.pow(2, i-1));
            }
            else System.out.print("0");
        }
    }
}
