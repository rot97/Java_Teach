/**
 * Created by Igor on 18.07.2017.
 */
import Examples.*;

public class Example011 {
    public static void main(String[] args) {
        double w1 = 12;
        double h = 2;
        double d = 2;
        double w2 = 33;
        double m1 = 12;
        double m2 = 14;

        Box box = new Box(w1, h, d);
        System.out.println("Объём коробки " + w1 + " " + h + " " + d + " равен " + box.volum());

        BoxWeight bw1 = new BoxWeight(w1, h, d, m1);
        System.out.println("Плотность коробки " + w1 + " " + h + " " + d + " массой " + m1 + " равена " + bw1.density());

        BoxWeight bw2 = new BoxWeight(w2, m2);
        System.out.println("Плотность коробки " + w2 + " " + w2 + " " + w2 + " массой " + m2 + " равена " + bw2.density()
                + ", а объём " + bw2.volum());
    }
}
