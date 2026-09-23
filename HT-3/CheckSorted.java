import java.util.*;
class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(false);
                return;
            }
        }
        System.out.println("true");
        sc.close();
    }
}