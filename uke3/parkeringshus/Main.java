/**
 * Main
 */
public class Main {

    public static void main(String[] args){
        Sjafor s = null;
        try {
            s = Sjafor.makeSjafor("Chen", 20);
            
        } catch (ForLavAlderException e) {
            System.out.println("Lagde ikke Sjafor");
        }

        if(s != null){

            System.out.println("Sjafor :" + s.getNavn() + " alder: " + s.getAlder() + " ble laget");
        }
        
    }
}