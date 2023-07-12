package DZ_4;

import java.util.LinkedList;

public class Task_9 {
    /*
     * Реализуйте очередь с помощью LinkedList со следующими методами: 
     * enqueue() - помещает элемент в конец очереди, 
     * dequeue() - возвращает первый элемент из очереди и удаляет его, 
     * first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("1");
        queue.enqueue("7");
        queue.enqueue("3");
        queue.enqueue("4");
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }
    
    
}
