/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String[] a1 = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i <a1.length ; i++) {
            for (int j = 0; j <a1.length ; j++) {
                for (int k = 0; k <a1.length ; k++) {
                    System.out.println(a1[i]+a1[j]+a1[k]);
                }

            }
        }
    }
}
