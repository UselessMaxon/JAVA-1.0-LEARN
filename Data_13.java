import java.util.Scanner;

public class Data_13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из слов");
        String input = in.nextLine();

        String latinAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] massInput = input.split(" "); // создаю массив из слов

        int counterW = 0;

        boolean check = true;
        System.out.print("Слова, состоящие только из латиницы: ");
        for (int i = 0; i < massInput.length; i++) {

            for (int n = 0, k = 1; n < massInput[i].length(); n++, k++) {
                String upperMas = massInput[i].toUpperCase();
                check = latinAlphabet.contains(upperMas.substring(n, k));
                if (!check) {
                    break;
                }
            }

            if (check) {
                System.out.print(massInput[i] +", ");
                counterW++;
            }
        }
        System.out.println("\nКоличество слов состоящих из латиницы: " + counterW);
    }
}
