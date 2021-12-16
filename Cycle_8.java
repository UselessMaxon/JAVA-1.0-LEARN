import java.util.Scanner;

public class Cycle_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        long n = in.nextInt();

        long result = 0L;

        for (long i = 1; i < n; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }

        System.out.println(result);
    }
}
