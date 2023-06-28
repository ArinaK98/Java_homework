package DZ_1;
/*
 * Вывести все простые числа от 1 до 1000
 */

import java.util.Scanner;

public class Task_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон, где найти просыте числа, от 0 до  ");
        int n = scanner.nextInt();
        boolean number = true;
        for (int simp = 2; simp <= n; simp++) {
            for (int i = 2; i < simp; i++) {
                if (simp % i == 0) {
                    number = false;
                    break;
                }
            }
            if (number) System.out.println(simp);
            else number = true;
        }
    }
} 