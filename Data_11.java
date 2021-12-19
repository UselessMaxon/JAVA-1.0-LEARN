import java.util.Scanner;

public class Data_11 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.println("Введите первое число");
      String firstNum = in.nextLine();

      System.out.println("Введите второе число");
      int secondNum = in.nextInt();

      int max = Math.max(new Integer(firstNum), secondNum);
      System.out.println("Максимальное число: " + max);

      int min = Math.min(new Integer(firstNum), secondNum);
      double minDouble = min;
      System.out.println("Минимальное число: " + minDouble);

    }
}
