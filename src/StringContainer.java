import java.util.ArrayList;

public class StringContainer implements container<String>{
    ArrayList<String>arr=new ArrayList<>();


    @Override
    public void add(String value) {
        arr.add("Hello");
    }

    @Override
    public String get() {
        return arr.remove(0);
    }
}
