/**
 * Kok
 */
public class Kok implements Runnable{
    public int id;
    private int antRetter;
    private Monitor m;

    public Kok(int id, int antRetter, Monitor m){
        this.id = id;
        this.antRetter = antRetter;
        this.m = m;
    }

    @Override
    public void run(){
        for (int i = 0; i < antRetter; i++) {
            m.leggTilRett(id);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
        m.leggTilRett(-1);
    }
    
}