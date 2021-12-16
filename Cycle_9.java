import java.util.Scanner;

public class Cycle_9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        double[] mass = new double[size];

        for (int i = 1; i <= size; i++) {
            System.out.println("Введите элемент №:" + i);
            double element = in.nextDouble();
            mass[i - 1] = element;
        }

        double average = 0;
        for (double checkAverage : mass) {
           average += checkAverage;
        }
        average /= size;

        for (double check : mass) {
            System.out.println(check * average);
        }

    }
}
