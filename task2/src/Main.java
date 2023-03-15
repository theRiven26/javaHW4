//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String action;
        while(true){
            action = scanner.next();
            if(action.equals("add")){
                String element = scanner.next();
                Enqueue(ll,element);
                System.out.println(ll);
            } else if (action.equals("del")) {
                Dequeue(ll);
                System.out.println(ll);
            }   else if (action.equals("first")){
                System.out.println(First(ll));
            }else{
                System.exit(0);
                System.out.println(ll);
            }
        }
    }
    public static void Enqueue(LinkedList<String> list,String element){
        list.add(element);
    }
    public static String Dequeue(LinkedList<String> list){
        String first = First(list);
        list.remove();
        return first;
    }
    public static String First(LinkedList<String> list){
        return list.getFirst();
    }
}