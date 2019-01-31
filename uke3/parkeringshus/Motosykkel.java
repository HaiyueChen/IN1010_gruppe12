/**
 * Motosykkel
 */
public class Motosykkel extends Sjoretoy{

    public Motosykkel(Sjafor s){
        super(s);
    }

    public Person getSjafor(){
        return this.s;
    }
}