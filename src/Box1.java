//Multiple constraints

public class Box1 <T extends Number,String> {

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T x){
        this.value=x;
    }
}
