import java.util.Scanner;

public class Oper_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float X,Y,Z,average;
        X = in.nextInt();
        Y = in.nextInt();
        Z = in.nextInt();
        average = (X + Y + Z)/3 ;
        System.out.println(average);

        int round = (int)average;
        if (round > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
