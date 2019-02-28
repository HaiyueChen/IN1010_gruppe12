/**
 * IntNode
 */
public class IntNode{
    private int data;
    private IntNode neste;

    public IntNode(int data){
        this.data = data;
        this.neste = null;
    }

    public int hentData(){
        return this.data;
    }

    public IntNode hentNeste(){
        return this.neste;
    }

    public void settNeste(IntNode neste){
        this.neste = neste;
    }

    public int compareTo(Object other) throws CanNotCompareException{
        if(other instanceof IntNode){
            IntNode andre = (IntNode) other;
            if(this.data == andre.hentData()){
                return 0;
            }
            else if(this.data > andre.hentData()){
                return 1;
            }
            return -1;
        }
        throw new CanNotCompareException("Kan ikke sammenligne IntNode med noe annet");
    }

}