/**
 * Rekursjon
 */
public class Rekursjon {

    public static void main(String[] args) {
        // telleTilFem(0);
        //telleFraFem(0);
        System.out.println(fib(3));
    }


    // public static void telleTilFem(int param){
        // if(param == 5){
            // return;
        // }
        // else{
            // System.out.println(param);
            // telleTilFem(param + 1);
        // }
    // }

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