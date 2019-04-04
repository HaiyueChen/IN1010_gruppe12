/**
 * Restaurant
 */
public class Restaurant {
    static int NUM_KOK = 2;
    static int NUM_SERVITOR = 4;
    static int ANTRETTER = 5;

    public static void main(String[] args) {
        Monitor m = new Monitor(NUM_KOK);

        Thread[] koker = new Thread[NUM_KOK];
        Thread[] servitorer = new Thread[NUM_SERVITOR];
        for (int i = 0; i < NUM_KOK; i++) {
            koker[i] = new Thread(new Kok(i, ANTRETTER, m));
        }
        for (int i = 0; i < NUM_SERVITOR; i++) {
            servitorer[i] = new Thread(new Servitor(i, m));
        }

        for (int i = 0; i < NUM_KOK; i++) {
            koker[i].start();
        }
        for (int i = 0; i < NUM_SERVITOR; i++) {
            servitorer[i].start();
        }
        

    }
}