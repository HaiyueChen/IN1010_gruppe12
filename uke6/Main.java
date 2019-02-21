import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);

        n1.settNeste(n2);
        n2.settNeste(n3);
        n3.settNeste(n4);
        n4.settNeste(n5);
        n5.settNeste(n6);

        //System.out.println(n1.getNeste().hentData());

        Node itter = n1;
        int count = 0;
        if(itter != null){
            count ++;
            while (itter.getNeste() != null) {
                itter = itter.getNeste();
                count ++;
            }
        }
        System.out.println(count);

    }
}