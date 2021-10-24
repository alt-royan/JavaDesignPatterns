package Behavior.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        MyList list =new MyList();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(1);
        list.add(6);
        list.add(0);
        list.add(59);
        Iterator itor = list.getIterator();
        while (itor.hasNext()){
            System.out.println(itor.next());
        }
    }
}
