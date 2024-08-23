import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите количество километров, которые спортсмен пробежал в первый день");
        double x = scanner.nextDouble();
        System.out.println("Введите желаемое количество километров");
        double y = scanner.nextDouble();
        int count = 1;

        while (x <= y) {
            x = x / 0.9d;
            count++;
        }
        System.out.println("На " + count + " день спортсмен пробежит желаемые " + y + " километры");

    }

}
