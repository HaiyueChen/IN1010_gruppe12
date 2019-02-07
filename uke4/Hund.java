/**
 * Hund
 */
public class Hund {
    protected String navn;

    public Hund(String navn){
        this.navn = navn;

    }
    /*
    public void print(){
        System.out.println("Jeg er en vanlig hund");
    }
    */

    @Override
    public String toString(){
        return "Jeg er en vanlig hund";

    }

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        //catch exceptions
        Hund casted = null;
        try {
            casted = (Hund) other;
            
        } catch (ClassCastException e) {
            return false;
        }
        ///
        System.out.println("calling custom equals");
        return this.navn.equals(casted.navn);

    }



}