/**
 * Flytype
 */
public class Flytype {
    private String type;
    private String seteinfo;

    public Flytype(String type, String seteinfo){
        this.type = type;
        this.seteinfo = seteinfo;
    }

    public Flygning opprettFlygning(){
        return new Flygning(this.seteinfo);
    }

}

class Flygning{
    private Seterad rader;
    public Flygning(String seteinfo){
        String[] conf = seteinfo.split("|");
        this.rader = new Seterad[conf.length];
        for (int i = 0; i < rader.length; i++) {
            this.rader[i] = new Seterad(conf[i]);
        } 
    }

    public boolean book(Passasjer pas){
        for (int i = 0; i < this.rader.length; i++) {
            if(rader[i].book(pas)){
                return true;
            }
        }
        return false;
    }
    public boolean book(Passasjer pas, boolean vindu, boolean midtgang){
        for (int i = 0; i < this.rader.length; i++) {
            if(rader[i].book(pas, vindu, midtgang)){
                return true;
            }
        }
        return false;
    }
    
    public boolean book(Passasjer pas1, Passasjer pas2){
        for (int i = 0; i < this.rader.length; i++) {
            if(rader[i].book(pas1, pas2)){
                return true;
            }
        }
        return false;
    }


}

class Seterad{
    private int nr;
    private Sete[] seter;

    public Seterad(String conf){
        String[] info = conf.split(":");
        this.nr = Integer.valueOf(info[0]);
        this.init(info[1]);
    }

    private void init(String seteConf){
        //Splitte string
        //opprett seter-array
        //Initialisere Sete-objekter
    }
}