public class Task11 {

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            if (i % 15 ==0) System.out.println("hiss");
            else if (i % 3 ==0) System.out.println("fizz");
            else if (i % 5 == 0) System.out.println("buzz");
            else System.out.println(i);
        }
    }
}
