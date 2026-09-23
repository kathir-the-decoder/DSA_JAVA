import java.util.*;
class Flast {
    public static void main(String[] args) 
    {
        //find the first and last occurance using single loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int first = -1,last = -1;
        int left = 0 , right = arr.length-1;

        while(left <= right){
            if(key == arr[left] && first == -1){
                first = arr[left];
            }
            else if(key == arr[right] && last == -1){
                last = arr[right];
                
            }
            left++;
            right--;
            
        }
        sc.close();
    }
}
        
   