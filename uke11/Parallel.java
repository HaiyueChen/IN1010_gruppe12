import java.util.concurrent.atomic.AtomicInteger;
/**
 * Parallel
 */
public class Parallel {
    
    public static void telleOddetall(int[] a){
        int NUM_THREADS = 2;
        
        AtomicInteger[] resultBucket = new AtomicInteger[]{new AtomicInteger(0)};
        int start = 0;
        int segment = a.length / NUM_THREADS;
        Thread[] threads = new Thread[NUM_THREADS];
        
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(
                                new OddetallTeller(i, a, 
                                        start, start + segment, resultBucket));

            start += segment;
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();                
            } catch (InterruptedException e) {
            }
        }
        System.out.printf("Result bucket: %d\n", resultBucket[0].get());

    }

}

class OddetallTeller implements Runnable{
    int id;
    int[] a;
    int start;
    int slutt;
    AtomicInteger[] resultBucket;

    public OddetallTeller(int id, int[] a, int start, int slutt, AtomicInteger[] resultBucket){
        this.id = id;
        this.a = a;
        this.start = start;
        this.slutt = slutt;
        this.resultBucket = resultBucket;
    }

    @Override
    public void run(){
        int teller = 0;

        for (int i = this.start; i < this.slutt; i++) {
            if(this.a[i] % 2 == 1){
                teller ++;
                resultBucket[0].getAndIncrement();
            }
        }

        System.out.printf("Thread %d fant %d oddetall\n", this.id, teller);
    }


}