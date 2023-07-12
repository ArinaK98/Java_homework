package DZ_4;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue <String> queue = new LinkedList<>();

     
    // Помещает элемент в конец очереди
    void enqueue (String item){
        queue.add(item);
    }

    // dequeue() - возвращает первый элемент из очереди и удаляет его
    String dequeue(){
        if (queue.isEmpty()){
            return null;
        }   
        return queue.remove();
    }

    // first() - возвращает первый элемент из очереди, не удаляя.
    String first(){
        if (queue.isEmpty()){
            return null;
        }   
        return queue.peek();
    }

}
