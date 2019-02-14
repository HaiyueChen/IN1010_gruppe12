/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Bil bil = new Bil();
        Sykkel sykkel = new Sykkel();

        System.out.println("Bil kan kjores: " + bil.kjor());
        System.out.println("Sykkel kan kjores:" + sykkel.kjor());

        Kjorbar[] mangeTing = new Kjorbar[] {bil, sykkel};

        for (Kjorbar ting : mangeTing) {
            
        }


    }
}