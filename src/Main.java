import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input minutes: ");
        int min = s.nextInt();
        System.out.print("Input seconds: ");
        int sec = s.nextInt();
        TimerThread t = new TimerThread(min,sec);
        t.start();
    }
}
