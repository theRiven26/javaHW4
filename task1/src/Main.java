//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        int maxNum = 100;
        int maxCount = 19;
        Random rand = new Random();
        for(int i = 0; i < maxCount; i++){
            ll.add(rand.nextInt(0, maxNum));
        };
        System.out.println(ll);
        System.out.println(listReverse(ll));
    }
    public static  LinkedList<Integer> listReverse(LinkedList<Integer> ll){
        LinkedList<Integer> newList = new LinkedList<>(){};
        ListIterator<Integer> iterator = ll.listIterator();
            while(iterator.hasNext()){
                newList.addFirst(iterator.next());
        }
            return newList;
    }
}