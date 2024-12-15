public class Box<T> {

    private  T value;

    //Generic constructor
    public Box(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }

}

//Here, T allows us to specify a generic type data type.
//Box hence becomes typesafe and the advantage is, we can pass string as well as int in box
//We can use anything in place of T but it should be single alphabet
//Generics gives us type safety at compile time
