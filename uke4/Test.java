/**
 * Test
 */
public class Test {
    public String id;
    public static String total = "A";


    public Test(){
        this.id = total;
        total = total + "A";
    }
}