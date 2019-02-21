/**
 * Lenkeliste
 */
public class Lenkeliste<T> implements Liste<T> {

    private Node<T> hode;
    private Node<T> hale;
    private int size;

    public Lenkeliste(){
        this.hode = null;
        this.size = 0;
    }

    public void add(T data){
        Node<T> nyNode = new Node<>(data);
        if(this.hode == null){
            this.hode = new Node<>(data);
            this.hale = this.hode;
        }
        else{
            this.hale.settNeste(nyNode);
            this.hale = this.hale.getNeste();
        }
        this.size ++;
    }

    public T remove(){
        if (this.size() == 1) {
            Node<T> to_remove = this.hode;
            this.hode = null;
            this.hale = null;
            this.size --;
            return to_remove.hentData();
        } else {
            Node<T> itter = this.hode;
            while (itter.getNeste().getNeste() != null) {
                itter = itter.getNeste();
            }
            Node<T> to_remove = itter.getNeste();
            this.hale = itter;
            this.hale.settNeste(null);
            this.size --;
            return to_remove.hentData();
        }
    }

    public int size(){
        return this.size;

    }

    
}