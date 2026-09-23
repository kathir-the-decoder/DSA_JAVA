import java.util.ArrayList;
import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> p_el = new ArrayList<>();
        ArrayList<Integer> n_el = new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){
            int val=arr.get(i);
            if(val>=0){
                p_el.add(val);
            }
            else{
                n_el.add(val);
            }
        }
        arr.clear();
        int p=0,neg=0;
        while(p<p_el.size()||neg<n_el.size()){
            if(p<p_el.size()){
                arr.add(p_el.get(p));
                p++;
            }
            if(neg<n_el.size()){
                arr.add(n_el.get(neg));
                neg++;
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}