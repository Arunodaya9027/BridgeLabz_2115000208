import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        int day, month, year;
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;
        System.out.println(d0);
        input.close();
    }
}
