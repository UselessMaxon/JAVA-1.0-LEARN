import java.util.Scanner;

public class Oper_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int firstQ = in.nextInt();

        if (firstQ == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт, 4 - пуд");
            int SecondQ = in.nextInt();
            if (SecondQ == 1) {
                System.out.println("Введите число");
                float thirdQ = in.nextFloat();
                System.out.println("Результат:\nКилограммы: "  + thirdQ + "\nУнции: " + (thirdQ * 35.274F));
                System.out.println("Фунты: " + (thirdQ * 2.2046F) + "\nПуды: " + (thirdQ / 16.38F));
            }
        }
        else if (firstQ == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int SecondQ = in.nextInt();
            if (SecondQ == 1) {
                System.out.println("Введите число");
                float thirdQ = in.nextFloat();
                System.out.println("Результат:\nМетры: "  + thirdQ + "\nМили: " + (thirdQ / 1609.34F));
                System.out.println("Ярды: " + (thirdQ * 1.09361F) + "\nФуты: " + (thirdQ * 3.2808F));
            }
        }
    }
}

