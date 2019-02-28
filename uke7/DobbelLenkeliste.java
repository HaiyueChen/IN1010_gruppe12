/**
 * Lenkeliste
 */
public class Lenkeliste<T> implements Liste<T> {

    private DobbelNode<T> hode;
    private DobbelNode<T> hale;
    private int size;

    public Lenkeliste(){
        this.hode = null;
        this.size = 0;
    }

    /*
    public void add(T data){
        DobbelNode<T> nyDobbelNode = new DobbelNode<>(data);
        if(this.hode == null){
            this.hode = new DobbelNode<>(data);
            this.hale = this.hode;
        }
        else{
            this.hale.settNeste(nyDobbelNode);
            this.hale = this.hale.getNeste();
        }
        this.size ++;
    }
    */

    public T get(int index){
        if(index > this.size - 1 || index < 0){
            throw new UlovligIndexException(index);
        }
        DobbelNode itter = hode;
        for (int i = 0; i < index; i++) {
            itter = itter.getNeste();
        }
        return itter.hentData();
    }

    /*
    public T remove(){
        if (this.size() == 1) {
            DobbelNode<T> to_remove = this.hode;
            this.hode = null;
            this.hale = null;
            this.size --;
            return to_remove.hentData();
        } else {
            DobbelNode<T> itter = this.hode;
            while (itter.getNeste().getNeste() != null) {
                itter = itter.getNeste();
            }
            DobbelNode<T> to_remove = itter.getNeste();
            this.hale = itter;
            this.hale.settNeste(null);
            this.size --;
            return to_remove.hentData();
        }
    }
    */

    public int size(){
        return this.size;

    }

    public T pop_LIFO(){
        T data = this.hale.data;
        DobbelNode nyHale = this.hale.forrige;
        if(nyHale == null){
            this.hale = null;
            this.hode = null;
            size --;
            return data;
        }
        nyHale.neste = null;
        this.hale = nyHale;
        size --;
        return data;
    }

    public void push_LIFO(T data){
        DobbelNode ny = new DobbelNode(data);
        if(size == 0){
            this.hode = ny;
            this.hale = ny;
            size ++;
        }
        else{
            this.hale.neste = ny;
            ny.forrige = this.hale;
            this.hale = ny;
            size ++;
        }
    }


    /*
    public T pop_FIFO(){
        if(this.size = 0){
            return null;
        }
        T data = hode.hentData();
        hode = hode.getNeste();
        this.size --;
        return data;
    }

    public void push_FIFO(T data){
        DobbelNode ny = new DobbelNode(data);
        this.hale.settNeste(ny);
        this.hale = ny;
        size ++; 
    }
    */

    

    
}