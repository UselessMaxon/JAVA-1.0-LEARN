import java.util.Scanner;

public class Final_4 {
    public static void main(String[] args) {

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = "Заархивированный вирус";
        Scanner in = new Scanner(System.in);

        boolean checkHelp = false;

        for (int i = 1; i <= 3; i++) {
            String input = in.nextLine();

            if (input.equalsIgnoreCase("Подсказка")) {
                if (i==1){
                    System.out.println("trojan.zip");
                    checkHelp = true;
                    input = in.nextLine();
                }
                else {
                    System.out.println("Подсказка уже недоступна");
                    input = in.nextLine();
                }
            }

            if (input.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                return;
            }
            else {
                if (checkHelp) {
                    System.out.println("Обидно, приходи в другой раз");
                    return;
                }
                else if (i ==3) {
                    System.out.println("Обидно, приходи в другой раз");
                    return;
                }

                else {
                    System.out.println("Подумай еще!");
                }
            }
        }
    }
}
