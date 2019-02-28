import java.util.Arrays;;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        IntNode n1 = new IntNode(1);
        IntNode n2 = new IntNode(2);
        
        try {
            n1.hentNeste().hentData();
        } catch (NullPointerException e) {
            System.out.println("Refferert til en null pointer");
        }


        String s1 = "balbalbal";

        int compare_value = n1.compareTo(s1); 

        if (compare_value == 0) {
            System.out.println("Like store");
            
        }
        else if(compare_value > 0){
            System.out.println("n1 stoerre");
        }
         else {
            System.out.println("n2 stoerre");
        }
        /*
        IntNode[] array = new IntNode[2];
        array[0] = n2;
        array[1] = n1; 
        Arrays.sort(array);
        System.out.println(array[0].hentData());
        */

        

    }
}