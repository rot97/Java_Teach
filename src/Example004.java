/**
 * Создано Игорь  05.07.2017 в 18:31
 * Проект Java_Teach
 * Пакет PACKAGE_NAME
 * Данный код являетя собственностью Игоря Колачева
 */
public class Example004 {
    public static void main(String[] args){
        int a[][] = new int[3][3];
        for(int i = 0; i <3; i++ )
            for (int j = 0; j < 3; j++)
                a[i][j] = (int)(100*Math.random());


        int b[][] = new int[11][];
        for (int i = 0; i < 11; i++)
            b[i] = new int[i+1];

        for(int i = 0; i <11; i++ )
            for (int j = 0; j <= i; j++)
                b[i][j] = i * j;

        for(int i = 1; i <11; i++ ) {
            for (int j = 1; j <= i; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
    }
}
