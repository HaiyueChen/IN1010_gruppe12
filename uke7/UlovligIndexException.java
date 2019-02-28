/**
 * UlovligIndexException
 */
public class UlovligIndexException extends RuntimeException{

    public UlovligIndexException(int index){
        super(String.format("Ulovlig index %d", index));
    }    
}