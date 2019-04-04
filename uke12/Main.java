import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * Main
 */
public class Main {
    static int NUM_THREAD = 4;


    public static void main(String[] args) {
        // CountDownLatch cdl = new CountDownLatch(NUM_THREAD + 1);
        // Thread[] threads = new Thread[NUM_THREAD];
        // for (int i = 0; i < NUM_THREAD; i++) {
        //     threads[i] = new Thread(new Worker(i, cdl));
        // }
        // for (int i = 0; i < NUM_THREAD; i++) {
        //     threads[i].start();
        // }
        // cdl.countDown();
        // try {
        //     cdl.await();
        // } catch (Exception e) {
        // }
        // System.out.println("Main sluttet");
        CyclicBarrier cb = new CyclicBarrier(NUM_THREAD + 1);
        Thread[] threads = new Thread[NUM_THREAD];
        for (int i = 0; i < NUM_THREAD; i++) {
            threads[i] = new Thread(new Worker2(i, cb));
        }
        for (int i = 0; i < NUM_THREAD; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 2; i++) {
            try {
                cb.await();
                cb.await();
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
        System.out.println("Main sluttet");

    }
}