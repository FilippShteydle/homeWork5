public class Task08 {

    public static void main(String[] args) {

        int hour1;
        int hour2;
        int minutes1;
        int minutes2;
        int count = 0;

        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                hour1 = 0;
                hour2 = i;
            }
            else {
                hour1 = i / 10;
                hour2 = i % 10;
            }
            for (int j = 0; j < 60; j++) {
                if (j < 10) {
                    minutes1 = 0;
                    minutes2 = j;
                }
                else {
                    minutes1 = j / 10;
                    minutes2 = j % 10;
                }
                if (hour1 == minutes2 && hour2 == minutes1) {
                    System.out.println(hour1 + "" + hour2 + ":" + minutes1 + "" + minutes2);
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
