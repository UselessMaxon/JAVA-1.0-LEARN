import java.util.Scanner;

public class Сycle_7 {
    public static void main(String[] args) {

        float x, y, z;
        x = 6.41F;
        y = 81F;
        z = 3F;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        float[] mass = new float[size];

        for (int i = 1; i <= size; i++) {
            System.out.println("Введите элемент №:" + i);
            float element = in.nextFloat();
            mass[i - 1] = element;
        }

        for (float check : mass) {
            if (check == x || check == y || check == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}