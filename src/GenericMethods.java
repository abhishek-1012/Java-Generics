public class GenericMethods {

    public static void main(String[] args){
        GenericMethods gm=new GenericMethods();
        Integer [] nums={12,32,45,56};
        String [] str={"ad","bc","cd","gf"};
        gm.printArray(nums);
        gm.printArray(str);

        display(2);
        display("qwerty");


    }


    public <T> void printArray(T[] array){
        for( T element: array){
            System.out.println( element);
        }
        System.out.println();
    }
    public static void display(Integer element){
        System.out.println("Integer is" + element);
    }
    public static <T> void display(T element){
        System.out.println("Generic type is"+element);
    }
}
