/**
 * Strenger
 */
public class Strenger {

    public static void main(String[] args) {
        String s = "first string";
        String s2 = " second string";
        // char[] charArray = new char[]{'b', 'l'};
        // charArray[0] --;
        // String newString = s.concat(s2);
        // s += s2;
        // System.out.println(s);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        // sb.append(s2);
        // System.out.println(sb.toString().substring(13, 19));
        System.out.println(finnesSecond(sb.toString()));

    }

    public static boolean finnesSecond(String s){
        // for (int i = 0; i < s.length() - "second".length(); i++) {
        //     String sub = s.substring(i, i + "second".length());
        //     if (sub.equals("second")) {
        //         return true;
        //     }
        // }
        // return false;
        // int stringIndex = 0;
        // while (stringIndex < s.length() - "second".length()) {
        //     if (s.charAt(stringIndex) == 's') {
        //         String sub = s.substring(stringIndex, stringIndex + "second".length());
        //         if (sub.equals("second")) {
        //             return true;
        //         }
        //     }
        //     stringIndex ++;
        // }
        // return false;
        String second = "second";
        for (int i = 0; i < s.length() - second.length(); i++) {
            if (s.charAt(i) == 's') {
                boolean found = true;
                for (int j = 1; j < second.length(); j++) {
                    if (s.charAt(i + j) != second.charAt(j)) {
                        found = false;
                    }
                }
                if(found){
                    return true;
                }
                // String sub = s.substring(i, i + "second".length());
                // if (sub.equals("second")) {
                //     return true;
                // }
            }
        }
        return false;


    }

}