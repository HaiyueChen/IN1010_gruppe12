import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Restaurant
 */
public class Restaurant {

    public static void main(String[] args) {
        LinkedList<Integer> retter = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            retter.add(i);
        }

        Monitor monitor = new Monitor(retter);

        Thread[] servitorer = new Thread[4];
        for (int i = 0; i < 4; i++) {
            servitorer[i] = new Thread(new Servitor(i, monitor));
        }

        for (int i = 0; i < 4; i++) {
            servitorer[i].start();
        }



    }
}


class Monitor{
    private LinkedList<Integer> retter;
    private Lock lock = new ReentrantLock();


    public Monitor(LinkedList<Integer> retter){
        this.retter = retter;
    }

    public Integer hentRett(){
        lock.lock();
        try{
            if(retter.isEmpty()){
                return -1;
            }
            return retter.pop();
            
        }
        finally{
            lock.unlock();
        }
    }
}

class Servitor implements Runnable{
    private Monitor m;
    private int id;

    public Servitor(int id, Monitor m){
        this.m = m;
        this.id = id;
    }

    @Override
    public void run(){
        while (true) {
            Integer rett = m.hentRett();
            if(rett == -1){
                break;
            }
            else{
                System.out.printf("Servitor %d Hentet rett: %d\n", id, rett);
            }
        }

    }
        
}