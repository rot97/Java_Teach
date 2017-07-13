package Examples;

/**
 * Created by Igor on 13.07.2017.
 */
public class Stack {
    private int stck[] = new int[10];
    private int tos;

    public Stack(){
        tos = -1;
    }

    public void push(int item){
        if (tos == 9){
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop (){
        if (tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}
