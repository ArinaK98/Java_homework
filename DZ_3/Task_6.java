package DZ_3;
/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное 
 * и среднее арифметическое из этого списка. 
 * Collections.max()
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 2, 7, 8, 4, 5, 9, 6, 1};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        System.out.println("Максимальное значение " + Collections.max(list));
        System.out.println("Минимальное значение " + Collections.min(list));
        
        double summa = 0;
        for(double i : list){
           summa += i;
        }
        System.out.println("Среднее арифметическое " + summa/list.size());
        
    }
}
