package DZ_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task_10 {
    /*
     * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
     * Используйте итератор
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(3);
        System.out.println(list);

        System.out.println(sum(list)); 
    }

    static int sum (LinkedList<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator();
        int sum = 0;
        while (listIterator.hasNext()){
            sum = sum + listIterator.next();
        }           
        return sum;
    }
    
}
