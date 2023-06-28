package DZ_1;
/*
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double a = scanner.nextInt();
        System.out.println("Введите второе число ");
        double b = scanner.nextInt();
        System.out.println("Введите действие +,-,*,/: ");
        String sign = scanner.next();
        char operation = sign.charAt(0);
        switch (operation) {
            case '+':
                System.out.print(a + b);
                break;
            case '-':
                System.out.print(a - b);
                break;
            case '*':
                System.out.print( a * b);
                break;
            case '/':
                System.out.print( a / b);
                break;
            default: System.out.println("Введите одну из указанных операций");     
        }
    }
}
