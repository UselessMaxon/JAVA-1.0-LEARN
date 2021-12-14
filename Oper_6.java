import java.util.Scanner;

public class Oper_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int firstQ = in.nextInt();
        if (firstQ == 1) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int SecondQ = in.nextInt();
            if (SecondQ == 1) {
                System.out.println("Введите число");
                float thirdQ = in.nextFloat();
                if (thirdQ == 10) {
                    System.out.println("Результат:\nМетры: 10\nМили: 0.006\nЯрды: 10.94\nФуты: 32.81");
                }
            }
        }
    }
}
