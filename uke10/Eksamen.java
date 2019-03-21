/**
 * Eksamen
 */
public class Eksamen {

    public static void main(String[] args) {
        
    }

    public static int inneholder(String s, String t){
        for (int i = 0; i < s.length() - t.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                boolean found = true;
                for (int j = 1; j < t.length(); j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;

    }

}