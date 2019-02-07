/**
 * FargeHund
 */
public class FargeHund extends Hund{

    private String farge;

    public FargeHund(String navn, String farge){
        super(navn);
        this.farge = farge;
    }

    /*
    @Override
    public void print(){
        System.out.println(String.format("Jeg er en %s hund", this.farge));
    }
    */

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        //catch exceptions
        FargeHund casted = null;
        try {
            casted = (FargeHund) other;
            
        } catch (ClassCastException e) {
            return false;
        }
        ///
        System.out.println("calling custom equals");
        return this.navn.equals(casted.navn) && this.farge.equals(casted.farge);

    }


}