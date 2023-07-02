package DZ_1;
import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */
public class Task {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        Integer n = scanner.nextInt();
        int triangle_number =  (n*(n+1))/2;
        System.out.println(n + "-ое" + " треугольное число " + triangle_number);
        int factorial = 1;
        if (n == 1){
            System.out.println(factorial + "- является факториалом числа  " + n);
        } 
        else{
            for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial + "- является факториалом числа " + n);
        }
        
    }

    
}
