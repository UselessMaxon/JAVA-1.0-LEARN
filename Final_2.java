import java.util.Scanner;

public class Final_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String input = in.nextLine();
        if (input.length() !=5) {
            System.out.println("Неверная длина уравнения, запустите программу еще раз");
            return;
        }

        char sign1 = input.charAt(0);
        char oper = input.charAt(1);
        char sign3 = input.charAt(2);
        char eqChar = input.charAt(3);
        char sign5 = input.charAt(4);

        if (eqChar != '=') {
            System.out.println("Четвертый знак должен быть '='");
            return;
        }

        int ans;

        if (sign1 == 'x' | sign1 == 'X') {
            if (oper == '-') {
                ans = Character.getNumericValue(sign5) + Character.getNumericValue(sign3);
            }
            else if (oper == '+') {
                ans = Character.getNumericValue(sign5) - Character.getNumericValue(sign3);
            }
            else {
                System.out.println("Второй символ должен быть \"+\" или \"-\", запустите программу еще раз");
                return;
            }
        }

        else if (sign3 == 'x' | sign3 == 'X') {
            if (oper == '-') {
                ans = Character.getNumericValue(sign1) - Character.getNumericValue(sign5);
            }
            else if (oper == '+') {
                ans = Character.getNumericValue(sign5) - Character.getNumericValue(sign1);
            }
            else {
                System.out.println("Второй символ должен быть \"+\" или \"-\", запустите программу еще раз");
                return;
            }
        }

        else if (sign5 == 'x' | sign5 == 'X') {
            if (oper == '-') {
                ans = Character.getNumericValue(sign1) - Character.getNumericValue(sign3);
            }
            else if (oper == '+') {
                ans = Character.getNumericValue(sign1) + Character.getNumericValue(sign3);
            }
            else {
                System.out.println("Второй символ должен быть '+' или '-', запустите программу еще раз");
                return;
            }
        }

        else {
            System.out.println("В уравнении не присутсвует 'Х' или 'х' , запустите программу еще раз");
            return;
        }

        System.out.println("x=" + ans);
    }
}
/*        if (!(Character.isDigit(sign1)) && Character.isDigit(sign3) && Character.isDigit(sign5)) {
            System.out.println("");
        }
*/
