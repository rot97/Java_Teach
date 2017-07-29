package Examples;

/**
 * Created by Igor on 13.07.2017.
 */
public class Box {
    protected double width;
    protected double heigth;
    protected double depth;

   public double volum(){
        return width * heigth * depth;
    }

    public void setDim (double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }

    public Box (Box obj){
        width = obj.width;
        heigth = obj.heigth;
        depth = obj.depth;
    }

    public Box (double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    public Box (double w) {
        width = heigth = depth = w;
    }

    public Box () {
        width = heigth = depth = -1;
    }

    protected void finalize(){
        System.out.println("Сборшик мусора работает");
    }

    public boolean equals (Box a){
        return a.width == width && a.heigth == heigth && a.depth == depth;
    }
}
