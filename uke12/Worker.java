import java.util.concurrent.CountDownLatch;

/**
 * Worker
 */
public class Worker implements Runnable {
    public int id;
    public CountDownLatch cdl;

    public Worker(int id, CountDownLatch cdl){
        this.id = id;
        this.cdl = cdl;
    }

    @Override
    public void run(){
        System.out.printf("Thread: %d\t  222\n", id);
        cdl.countDown();
        try {cdl.await();} catch (Exception e) {}
        
        
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.printf("Thread: %d\t  aaa\n", id);







    }



}