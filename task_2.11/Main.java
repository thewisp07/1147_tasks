
/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] a1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a1.length; i++) {
            sum += a1[i];
            //int sum1 = (sum/10);
            //System.out.println(sum1);
        }
        if (sum > 10) {
            System.out.println("Чтобы в сумме получилось больше 10-ти нужно сложить " + sum/5 +" раз(а).");
        }
    }
}
