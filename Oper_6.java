import java.util.Scanner;

public class Oper_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int firstQ = in.nextInt();

        if (firstQ == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт, 4 - пуд");
            int secondQ = in.nextInt();
            if (secondQ == 1 | secondQ == 2 | secondQ == 3 | secondQ == 4) {
                System.out.println("Введите число");
                float thirdQ = in.nextFloat();
                switch (secondQ) {
                    case 1:
                        System.out.println("Результат:\nКилограммы: " + thirdQ + "\nУнции: " + (thirdQ * 35.274F));
                        System.out.println("Фунты: " + (thirdQ * 2.2046F) + "\nПуды: " + (thirdQ / 16.38F));
                        break;
                    case 2:
                        System.out.println("Результат:\nКилограммы: " + (thirdQ / 35.274F) + "\nУнции: " + thirdQ);
                        System.out.println("Фунты: " + (thirdQ / 16.0002F) + "\nПуды: " + (thirdQ / 577.788F));
                        break;
                    case 3:
                        System.out.println("Результат:\nКилограммы: " + (thirdQ / 2.2046F) + "\nУнции: " + (thirdQ * 16.0002F));
                        System.out.println("Фунты: " + thirdQ + "\nПуды: " + (thirdQ / 36.111F));
                        break;
                    case 4:
                        System.out.println("Результат:\nКилограммы: " + (thirdQ * 16.38F) + "\nУнции: " + (thirdQ * 577.788F));
                        System.out.println("Фунты: " + (thirdQ * 36.111F) + "\nПуды: " + thirdQ);
                        break;
                    default:
                        break;
                }
            }
            else {
                System.out.println("Единица измерения массы не найдена");
            }
        }

        else if (firstQ == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int secondQ = in.nextInt();
            if (secondQ == 1 | secondQ == 2 | secondQ == 3 | secondQ == 4) {
                System.out.println("Введите число");
                float thirdQ = in.nextFloat();
                switch (secondQ) {
                    case 1:
                        System.out.println("Результат:\nМетры: "  + thirdQ + "\nМили: " + (thirdQ / 1609.34F));
                        System.out.println("Ярды: " + (thirdQ * 1.09361F) + "\nФуты: " + (thirdQ * 3.2808F));
                        break;
                    case 2:
                        System.out.println("Результат:\nМетры: "  + (thirdQ * 1609.34F) + "\nМили: " + thirdQ);
                        System.out.println("Ярды: " + (thirdQ * 1759.9903F) + "\nФуты: " + (thirdQ * 5279.9226F));
                        break;
                   case 3:
                        System.out.println("Результат:\nМетры: "  + (thirdQ / 1.09361F) + "\nМили: " + (thirdQ / 1759.9903F));
                        System.out.println("Ярды: " + thirdQ + "\nФуты: " + (thirdQ * 3));
                        break;
                     case 4:
                        System.out.println("Результат:\nМетры: "  + (thirdQ / 3.2808F) + "\nМили: " + (thirdQ / 5279.9226F));
                        System.out.println("Ярды: " + (thirdQ / 3F) + "\nФуты: " + thirdQ );
                        break;
                    default:
                        break;
                }
            }
            else {
                System.out.println("Еденица измерения расстояния не найдена");
            }
        }

        else {
            System.out.println("Физическая величина не найдена");
        }

    }
}
