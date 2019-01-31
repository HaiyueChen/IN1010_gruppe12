/**
 * Person
 */
public class Person {
    protected String navn;
    protected int alder;

    public Person(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn(){
        return this.navn;
    }

    public int getAlder(){
        return this.alder;
    }
    
}