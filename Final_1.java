import java.util.Scanner;
import java.util.Arrays;

public class Final_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара :");
        float rate = in.nextFloat();

        System.out.println("Введите количество рублей :");
        float rub = in.nextFloat();

        float usd = rub / rate;
        String stringUSD = Float.toString(usd);
        String[] mass = stringUSD.split("\\.");

        int afterPointUSD = (int)Float.parseFloat(mass[1]);
        int afterPointUSD_2 = (int)Math.rint(afterPointUSD / Math.pow(10F,  mass[1].length()-2));
        String sign2AfterPointUsd = Integer.toString(afterPointUSD_2);

        String roundUSD = mass[0] + "," + sign2AfterPointUsd;
        System.out.println("Итого: " + roundUSD + " долларов");

//      System.out.println("Рассчитанные доллары: " + usd);
//      System.out.println("знаки после запятой: " + afterPointUSD);
//      System.out.println("afterPointUSD_2: " + afterPointUSD_2);
 //     System.out.println("новое значение знаков: " + sign2AfterPointUsd);
    }
}
