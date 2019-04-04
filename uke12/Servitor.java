/**
 * Servitor
 */
public class Servitor implements Runnable{

    private int id;
    private Monitor m;

    public Servitor(int id, Monitor m){
        this.id = id;
        this.m = m;
    }

    @Override
    public void run(){
        while (true) {
            int rett = m.hentRett();
            if(rett == -1){
                break;
            }
            System.out.printf("Servitor: %d\t hentet rett: %d\n", id, rett);
        }
        System.out.printf("Servitor: %d avslutter\n", id);
    }
    
}