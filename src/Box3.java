public class Box3 {


    public <T> Box3(T value){

    }
    public static void main(String[] args){
        Box3 bx3=new Box3(1);
        Box3 bx1=new Box3("Box3");

        System.out.println(bx1);
    }
}

//Non generic class and generic constructor
