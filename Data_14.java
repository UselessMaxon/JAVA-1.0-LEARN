import java.util.Arrays;

public class Data_14 {
    public static void main(String[] args) {

        double[] mass = new double[15];

        int counter = 0;
        while (counter < 15) {
            double rnd = Math.random() * 40 -20;
            mass[counter] = rnd;
            counter++;
        }

//      System.out.println(Arrays.toString(mass));

        double minN = mass[0];
        double maxN = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > maxN) {
                maxN = mass[i];
            }
            else if (mass[i] < minN) {
                minN = mass[i];
            }
        }

        double maxAbs = Math.max(Math.abs(maxN), Math.abs(minN));

        System.out.println("Максимальный элемент массива: " + maxN);
        System.out.println("Минимальный элемент массива: " + minN);
        System.out.println("Максимальный элемент массива по модулю: " + maxAbs);
    }
}
