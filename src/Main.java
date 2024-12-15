public class Main {
    public static void main(String[] args) {

        Box<String>box=new Box<>("12");
        Box1<Integer,String>box1=new Box1<>();
        box.setValue("qwerty");
        System.out.println(box.getValue());

        Box<Integer>b1=new Box<>(23);

        b1.setValue(1);
        System.out.println(b1.getValue());

        pair<String, Integer>p1=new pair<>("String",30);
        pair<String,String>p2=new pair<>("Hello","World");

        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());
        System.out.println(p2.getKey());

    }
}