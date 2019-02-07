/**
 * Rektangel
 */
public class Rektangel {

    protected int lengde;
    protected int bredde;

    public Rektangel(int lengde, int bredde){
        this.lengde = lengde;
        this.bredde = bredde;

    }

    public int areal(){
        return this.lengde * this.bredde;
    }
}