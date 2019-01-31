/**
 * Bil
 */
public class Bil extends Sjoretoy{
    private Person[] passengers;
    static int count;
    public int id;
    
    public Bil(Sjafor s, int max_passengers){
        super(s);
        this.passengers = new Person[max_passengers];
        this.passengers[0] = s;
        this.id = count ++;
    }

    public void add_passenger(Person p) throws FullBilException{
        for (int i = 1; i < this.passengers.length; i++) {
            if(passengers[i] == null){
                passengers[i] = p;
                return;
            }
        }
        
        throw FullBilException(String.format("Bil med id: %d er fult", this.id));
    }

    public Person getSjafor(){
        return this.s;
    }


}