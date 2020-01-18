package geeakbrains.lesson2;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println("Введите операцию");
        out.println("1. Сложение");
        out.println("2. Вычитание");
        out.println("3. Умножение");
        out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        out.println("Введите превое число");
        int a = scanner.nextInt();
        out.println("Введите второе число");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else  {
            result = a / b;
        }
        System.out.println("Результат = " + result);
    }
}
