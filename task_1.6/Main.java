/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Ваш код
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println((num1) *1.15);

    }
}
