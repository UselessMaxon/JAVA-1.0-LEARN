import java.util.Scanner;

public class Oper_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float X,Y,Z,average;
        System.out.println("Введите число №1");
        X = in.nextInt();
        System.out.println("Введите число №2");
        Y = in.nextInt();
        System.out.println("Введите число №3");
        Z = in.nextInt();
        average = (X + Y + Z)/3 ;
        System.out.println(average);

        float halfAverage = average/2; // деление на 2 среднеарифметического
        int round = (int)halfAverage; // округление в меньшую сторону
        if (round > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
