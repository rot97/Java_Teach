package Examples;

/**
 * Created by Igor on 13.07.2017.
 */
public class Box {
    private double width;
    private double heigth;
    private double depth;

   public double volum(){
        return width * heigth * depth;
    }

    public void setDim (double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }

    public Box (double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    protected void finalize(){
        System.out.println("Сборшик мусора работает");
    }
}
