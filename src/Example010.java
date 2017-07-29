/**
 * Created by Igor on 18.07.2017.
 */
public class Example010 {
    public static void print_char_and_int(char c, int ... x){
        for (int i : x){
            System.out.println(c + " " + i);
        }
    }

    public static void main(String[] args){
        print_char_and_int((char)199, 5, 1,3,4,5,6,7,8,9);
    }
}
