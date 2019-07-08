import java.util.Arrays;
import java.util.Collections;
public class Arraysort {
    static void reverse(Integer ba[]) 
    { 
        Collections.reverse(Arrays.asList(ba)); 
        // System.out.println(Arrays.asList(a)); 
    } 
    public static void main(String[] args) {
        

        Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        // Arrays.sort(arr);
    reverse(arr);
        System.out.println(Arrays.toString(arr));
       
}
}