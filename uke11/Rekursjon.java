/**
 * Rekursjon
 */
public class Rekursjon {

    public static void main(String[] args) {
        int[][] kart = new int[10][10];
        kart[3][4] = 999;
        System.out.println(finnSkatt(kart)); 


    }

    public static String finnSkatt(int[][] kart){
        return gaa(kart, 0, 0);
    }

    public static String gaa(int[][] kart, int x, int y){
        if(x < 0 || y < 0){
            return null;
        }
        if(x > kart.length - 1 || y > kart[0].length - 1){
            return null;
        }

        if(kart[x][y] == 1){
            return null;
        }
        
        if(kart[x][y] == 999){
            return String.valueOf(x) + " " + String.valueOf(y);
        }
        
        kart[x][y] = 1;

        String koordinaterNord = gaa(kart, x - 1, y);
        if(koordinaterNord != null){
            return koordinaterNord;
        }
        String koordinaterSor = gaa(kart, x + 1, y);
        if(koordinaterSor != null){
            return koordinaterSor;
        }

        String koordinaterVest = gaa(kart, x, y - 1);
        if(koordinaterVest != null){
            return koordinaterVest;
        }

        String koordinaterOst = gaa(kart, x, y + 1);
        if(koordinaterOst != null){
            return koordinaterOst;
        }

        return null;
    }

    
}