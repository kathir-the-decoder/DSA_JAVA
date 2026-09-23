package CW;
import java.util.*;
public class NonRepElem {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        sc.close();

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
       for(int i = 0;i<arr.length;i++){
           hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
           
       }
       for(int i=0;i<arr.length;i++){
           if(hash.get(arr[i])==1){
               System.out.println(arr[i]);
               return;
           }
       }
       System.out.println("No non-repeating element found");
    }
}
