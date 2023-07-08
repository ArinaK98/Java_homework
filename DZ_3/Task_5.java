package DZ_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task_5 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 2, 7, 8, 4, 5, 9, 6};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 ==0){
                list.remove(i);
            }
        } 
        System.out.println(list);   
           
    }    
    
}

