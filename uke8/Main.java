/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        LenkeListe<Integer> l = new LenkeListe<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        // for (int i = 0; i < 4; i++) {
        //     System.out.println(l.get(i));
        // }

        for (Integer var : l) {
            System.out.println(var);
        }

    }
}