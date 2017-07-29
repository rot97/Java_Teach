package Examples;

/**
 * Created by Igor on 18.07.2017.
 */
public class BoxWeight extends Box {
    protected double weigth;

    public BoxWeight(double w , double h , double d , double  m){
        super(w, h, d);
        weigth = m;
    }

    public BoxWeight(double w, double  m){
        super(w);
        weigth = m;
    }

    public BoxWeight(BoxWeight obj){
        super(obj);
        weigth = obj.weigth;
    }

    public double density(){
        return weigth /super.volum();
    }
}
