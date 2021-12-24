import java.util.Scanner;

public class Final_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество строк");
        int n = in.nextInt();
        in.nextLine(); // очистка сканера

        String[] mass = new String[n]; // Создание массива длиной введенной юзером

        // ввод в массив 'mass' строк со сканера
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку " + (i + 1) + " из " + n);
            mass[i] = in.nextLine();
        }


 //       String[] massU = new String[mass.length]; // Создание массива 'massU' с уникальными символами
        int[] counter = new int[mass.length]; // Массив со счетчиком уникальных символов

        for (int m = 0; m < mass.length; m++) {
            String checkString = mass[m];
            char[] unique = new char[checkString.length()]; // создал массив CHAR с уникальными символами для строк

            for (int i = 0; i < checkString.length(); i++) {
                char CharInString = checkString.charAt(i);
                for (int j = 0; j < unique.length; j++) {

                    if (CharInString == unique[j]) {
                        //System.out.println("massCHar " + CharInString);
                        break;
                    }
                    //System.out.println("После проверки на уникальность " + CharInString + "  " + unique[j]);

                    if ((int) unique[j] == 0) {
                        unique[j] = CharInString;
                        //System.out.println("Уник_J " + unique[j]);
                        counter[m]++;
                        break;

                    }
                }
                // System.out.println("конец цикла " + CharInString);
            }
//            massU[m] = new String(unique);
            //System.out.println(massU[m]);
        }

//      for (int z = 0; z < massU.length; System.out.print(" " + massU[z]), z++ );


//        System.out.println("\nПроверка длины до правки " + massU[1].length());

//        System.out.println("\nПроверка через коунтер " + counter[0]);


        int maxN = counter[0];
        int numberMax = 0;
        for (int i = 1; i < counter.length; i++) {
            if (counter[i] > maxN) {
                maxN = counter[i];
                numberMax = i;
            }
        }


        System.out.println("Строка, с максимальным количеством различных символов: " + mass[numberMax]);

    }
}