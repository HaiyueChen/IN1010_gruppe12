/**
 * Sjafor
 */
public class Sjafor extends Person{

    
    private Sjafor(String navn, int alder){
        super(navn, alder); 
    }
    
    public static Sjafor makeSjafor(String navn, int alder) throws ForLavAlderException{
        if(alder < 18){
            throw new ForLavAlderException(String.format("Alder for lav: %d",alder));
            //return null;
        }
        else{
            return new Sjafor(navn, alder);
        }
    }
    

}