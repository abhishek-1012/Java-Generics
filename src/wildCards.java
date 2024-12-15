import java.util.*;
//Wild cards can only be used for read types
//Wild card can be used when we are not returning anhthing
public class wildCards {

    public static void main(String[] args) {

        int[] nums = {12, 12, 43, 78, 78};
        ArrayList<Integer>arrnums=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            arrnums.add(nums[i]);
        }
        display(arrnums);
    }

    public static void display(ArrayList<?> element) {
        for (int i = 0; i < element.size(); i++) {
            System.out.println(element.get(i));
        }
    }

//    public void copy(ArrayList<?>source, ArrayList<?>Destination){
//        for(Object x: source){
//            Destination.add(x); //We also cannot modify anything, when using wild card
//        }
//    }

    public static double sum(ArrayList<? extends Number>sum) {
        double x = 0;
        for (Number o : sum) {
            x = x+o.doubleValue();
        }
        return x;
    }
}
