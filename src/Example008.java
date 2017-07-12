/**
 * Created by Igor on 13.07.2017.
 */
import Examples.Box;
public class Example008 {
    public static void main (String [] args){
        Box mybox = new Box(3, 4,5);
        System.out.println(mybox.volum());

        mybox.setDim(5,6,7);
        System.out.println(mybox.volum());
    }
}
