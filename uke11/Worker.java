/**
 * Worker
 */
public class Worker implements Runnable {
    private int id;

    public Worker(int id){
        this.id = id;

    }   

    @Override
    public void run(){
        System.out.printf("Hei fra thread: %d\n", this.id);
    }

}