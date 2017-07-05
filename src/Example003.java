/**
 * Создано Игорь  05.07.2017 в 18:03
 * Проект Java_Teach
 * Пакет ${PACKAGE_NAME}
 * Данный код являетя собственностью Игоря Колачева
 */
public class Example003 {
    public static void main(String[] args){
        int a[] = new int[10];
        for(int i = 0; i < 10; i++) a[i]= 1 << i;
        for(int i = 0; i < 10; i++) System.out.println("a[" + i + "}=" + a[i]);


        double b[] = {3.14159, 2.71, 9.81, 6.67e-11};
        char c[] = {'p', 'e', 'g', 'G'};
        for(int i = 0; i < b.length; i++){
            System.out.println(c[i] +" = " + b[i]);
        }
    }
}
