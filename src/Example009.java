/**
 * Created by Igor on 13.07.2017.
 */

import Examples.Stack;
import java.util.Scanner;

public class Example009 {
    public static  void main (String [] args) {
        Stack myStack = new Stack();
        Scanner in = new Scanner(System.in);
        int x = 1;
        while (x != 0) {
        System.out.println("1)Добавить");
        System.out.println("2)Извлечь");

        x = in.nextInt();

            switch (x) {
                case 1:
                    myStack.push(in.nextInt());
                    break;
                case 2:
                    System.out.println(myStack.pop());
                    break;
            }
        }
    }
}
