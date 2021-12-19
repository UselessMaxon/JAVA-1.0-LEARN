import java.util.Scanner;

public class Data_12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = in.nextLine();

        boolean checkJava = input.contains("Java");
        boolean checkStart = input.startsWith("I like");
        boolean checkEnd = input.endsWith("!!!");

        if (checkJava & checkStart & checkEnd) {
            System.out.println(input.toUpperCase());
        }

        String output = input.replace('a',  'o');
        System.out.println(output.substring(7 , 11));

    }
}
