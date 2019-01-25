import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * FilInnlesing
 */
public class FilInnlesing {

    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new File("fil.txt")); 
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        
        String[] str_a = new String[4];
        int count = 0;
        while(s.hasNextLine()){
            String line = s.nextLine();
            str_a[count] = line;
            count ++;
        }
        String[] bits = str_a[0].split(" ");
        int[] int_a = new int[3];
        for (int i = 0; i < int_a.length; i++) {
            int value = Integer.valueOf(bits[i]);
            int_a[i] = value;
        }
    }
}