/**
 * Created by Igor on 11.07.2017.
 */

import java.util.Scanner;


public class Example005 {
    public static void main (String[] args){
        System.out.println("Swtitch test");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        String M;
        switch (m){
            case 1 :
                M = "Январь";
                break;
            case 2 :
                M = "Февраль";
                break;
            case 3 :
                M = "Март";
                break;
            case 4 :
                M = "Апрель";
                break;
            case 5 :
                M = "Май";
                break;
            case 6 :
                M = "Июнь";
                break;
            case 7 :
                M = "Июль";
                break;
            case 8 :
                M = "Август";
                break;
            case 9 :
                M = "Сентябрь";
                break;
            case 10 :
                M = "Октябрь";
                break;
            case 11 :
                M = "Ноябрь";
                break;
            case 12 :
                M = "Декабрь";
                break;
            default:
                M = "Неопределенно";
        }

        System.out.println(m + " - " + M);
    }
}
