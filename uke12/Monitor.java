import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Monitor
 */
public class Monitor {
    private Lock lock = new ReentrantLock();
    private Condition ikkeTom = lock.newCondition();
    private LinkedList<Integer> retter = new LinkedList<>();
    private boolean ferdig = false;
    private int num_kok;
    
    public Monitor(int num_kok){
        this.num_kok = num_kok;
    }

    public void leggTilRett(int rett){
        try{
            lock.lock();
            if (rett == -1) {
                num_kok --;
                if (num_kok == 0) {
                    ferdig = true;
                    ikkeTom.signalAll();
                    return;
                }
            }
            else{
                retter.add(rett);
                ikkeTom.signal();
            }
            
        }
        finally{
            lock.unlock();
        }
    }

    public int hentRett(){
        try{
            lock.lock();
            if (retter.isEmpty()) {
                try {
                    ikkeTom.await();
                } catch (Exception e) {}
                if (ferdig) {
                    return -1;
                }
                return retter.pop();
            }
            else{
                return retter.pop();
            }
        }
        finally{
            lock.unlock();
        }
    }



}