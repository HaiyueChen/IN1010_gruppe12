/**
 * DobbelDobbelNode
 */
public class DobbelNode<T> {
    public DobbelNode forrige = null;
    public DobbelNode neste = null;
    public T data;

    public DobbelNode(T data){
        this.data = data;
    }
    
    /*
    public T hentData(){
        return this.data;
    }

    public void settNeste(DobbelNode<T> neste){
        this.neste = neste;
    }

    public DobbelNode<T> getNeste(){
        return this.neste;
    }
    */
}