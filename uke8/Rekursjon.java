/**
 * Rekursjon
 */
public class Rekursjon {

    public static void main(String[] args) {
        // telleTilFem(0);
        //telleFraFem(0);
        //System.out.println(fib(3));

        LenkeListe<Integer> l = new LenkeListe<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.printListe();

        Node<Integer> hode = l.head;
        //System.out.println(hode.data);
        // printListe_rek(hode);
        System.out.println(finnMax(hode, null).data);
    }

    public static void printListe_rek(Node node){
        if (node.next == null) {
            System.out.println(node.data + "--> ");
        }
        else{
            System.out.print(node.data + "--> ");
            printListe_rek(node.next);
        }
    }

    public static Node finnMax(Node node, Node temp_stoerst){
        if(temp_stoerst == null){
            temp_stoerst = node;
        }
        
        
        if (node.next == null) {
            if ((Integer)node.data > (Integer)temp_stoerst.data) {
                return node;
            }
            return temp_stoerst;
        }
        else {
            if ((Integer)node.data > (Integer)temp_stoerst.data) {
                return finnMax(node.next, node);
            }
            else{
                return finnMax(node.next, temp_stoerst);
            }


        }



    }

    public static void telleTilFem(int param){
        if(param == 5){
            return;
        }
        else{
            System.out.println(param);
            telleTilFem(param + 1);
        }
    }

    public static void telleFraFem(int param){
        if (5 == param) {
            return;
        }
        else{
            telleFraFem(param + 1);
            System.out.println(param);
        }
    }

    public static int fib(int n){
        if(n <= 2){
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }



}