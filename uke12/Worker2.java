import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * Worker
 */
public class Worker2 implements Runnable {
    public int id;
    public CyclicBarrier cb;

    public Worker2(int id, CyclicBarrier cb){
        this.id = id;
        this.cb = cb;
    }

    @Override
    public void run(){
        for (int i = 0; i < 2; i++) {
            System.out.printf("Thread: %d\t  222\n", id);
            try {cb.await();} catch (Exception e) {}
            
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.printf("Thread: %d\t  aaa\n", id);
            try {
                cb.await();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

    }



}