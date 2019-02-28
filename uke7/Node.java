/**
 * Node
 */
public class Node<T> {

    private T data;
    private Node<T> neste;
    
    public Node(T data){
        this.data = data;
        this.neste = null;
    }

    public T hentData(){
        return this.data;
    }

    public void settNeste(Node<T> neste){
        this.neste = neste;
    }

    public Node<T> getNeste(){
        return this.neste;
    }

}