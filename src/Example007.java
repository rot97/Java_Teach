/**
 * Created by Igor on 12.07.2017.
 */
public class Example007 {
    public static  void main (String [] args){
        int i, j = 0,k = 0,a = 0;
        print_k:for (i = 0; i < 10; i++)
            for (j = 0; j < i*i; j++)
                for (k = 0; k < j*j; k++, a++)
                    if ( a == 2048)
                        break print_k;
         System.out.println("i = " + i + " j = " + j + " k = " + k + " a = " + a);
    }
}
