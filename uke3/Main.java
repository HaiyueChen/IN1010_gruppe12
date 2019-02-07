/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        SubKlasser sub = new SubKlasser("kalss");
        NySubKlasse nysub = new NySubKlasse("subsub");
        SuperKlassen fake = new SubKlasser("fake variabel");


        SuperKlassen[] a = new SuperKlassen[]{sub, nysub};
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof SubKlasser){
                SubKlasser test = (SubKlasser) a[i];
                System.out.println("Funnet subklasse");
                
            }
            else if (a[i] instanceof NySubKlasse){
                NySubKlasse test = (NySubKlasse) a[i];
                System.out.println("Funnet nysubklasse");
            }
        }

    }
}