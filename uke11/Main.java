/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Thread[] threads = new Thread[8];
        // for (int i = 0; i < 8; i++) {
        //     threads[i] = new Thread(new Worker(i));
        // }

        // for (int i = 0; i < 8; i++) {
        //     threads[i].start();
        // }
        int[] a = new int[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i +1;
        }
        sekvensiel(a);

        Parallel.telleOddetall(a);


    }

    public static void sekvensiel(int[] a){

        int teller = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 1){
                teller ++;
            }
        }
        System.out.printf("Det er %d oddetall her\n", teller);
    }

}