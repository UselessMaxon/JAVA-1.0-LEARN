import java.util.Scanner;

public class Cycle_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количетво строк в матрице");
        int m = in.nextInt();

        System.out.println("Введите количетво столбцов в матрице");
        int n = in.nextInt();

        float[][] mass = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Введите элемент № [" + (i + 1) + "][" + (j + 1) + "]");
                mass[i][j] = in.nextFloat();
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + (mass[i][j] * 3)+ " ");
            }
            System.out.println(); // перенос строки ради визуального сохранения табличной формы
        }

    }
}