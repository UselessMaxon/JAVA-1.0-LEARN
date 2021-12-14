import java.util.Scanner;

public class Oper_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float X,Y;
        String operation;
        X = in.nextInt();
        Y = in.nextInt();
        in.nextLine(); //очистка сканера

        operation = in.nextLine();
        switch (operation) {
            case "+": System.out.println(X+Y);
                break;
            case "-": System.out.println(X-Y);
                break;
            case "*": System.out.println(X*Y);
                break;
            case "/": System.out.println(X/Y);
                break;
            default:;
                break;
        }
    }
}
