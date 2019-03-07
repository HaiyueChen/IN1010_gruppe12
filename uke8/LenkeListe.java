import java.util.Iterator;

/**
 * Linkedlist
 */
public class LenkeListe<T> implements Iterable<T>{

    private class Node{
        T data;
        Node next = null;
        Node prev = null;

        Node(T data){
            this.data = data;
        }

    }

    private class MyIterator implements Iterator<T>{
        Node itter = null;

        public T next(){
            if(itter == null){
                itter = head;
                return itter.data;
            }
            itter = itter.next;
            return itter.data;
        }

        public boolean hasNext(){
            if(itter == null){
                return head != null;
            }
            return itter.next != null;
        }

    }


    public int size = 0;
    public Node head = null;
    public Node tail = null;

    public void add(T data){
        Node n = new Node(data);
        if(size == 0){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size ++;
    }

    public T get(int index){
        if(index < 0 || index > this.size - 1) throw new RuntimeException(String.format("Index %d not valid", index)); 
        
        Node itter = head;
        for (int i = 0; i < index; i++) {
            itter = itter.next;
        }
        return itter.data;
    }

    public Iterator<T> iterator(){
        return new MyIterator();
    }



}