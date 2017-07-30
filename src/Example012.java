/**
 * Created by Igor on 30.07.2017.
 */
abstract class Figure{
    protected double dim1, dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Четырёхугольник");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Треугольник");
        return dim1 * dim2 / 2;
    }
}


public class Example012 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle (9,5);
        Triangle t = new Triangle (10, 8 );
        Figure figref;

        figref = r;
        System.out.println( " Плoщaдь равна " + figref.area());
        figref = t;
        System.out.println( " Плoщaдь равна " + figref.area());
    }
}
