package DZ_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task_8 {
    /*
     * Пусть дан LinkedList с несколькими элементами. 
     * Реализуйте метод, который вернет “перевернутый” список. 
     * Постараться не обращаться к листу по индексам.
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("7");
        list.add("5");
        list.add("3");
        
        System.out.println(inverted(list));  
    }

    static LinkedList<String> inverted(LinkedList<String> list){
        ListIterator<String> listIterator = list.listIterator(list.size());
        LinkedList<String> listinverted = new LinkedList<>();
        while (listIterator.hasPrevious()){
            listinverted.add(listIterator.previous());
        }
        return listinverted;
    }
}
