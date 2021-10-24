package Behavior.Iterator;


import java.util.Arrays;

public class MyList implements MyCollection {

    private int[] arr;

    public MyList() {
        arr=new int[0];
    }

    public void add(int item){
        arr=Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1]=item;
    }

    @Override
    public Iterator getIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index< arr.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()){
                return arr[index++];
            }
            return null;
        }
    }
}
