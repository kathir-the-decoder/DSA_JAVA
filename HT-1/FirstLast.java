import java.util.*;

public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int key = sc.nextInt();
            
        int first = -1;
        int last = -1;    
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
                
            if (current == key) {
                if (first == -1) {
                    first = i; 
                }
                    last = i; 
            }
            
        }
        System.out.println(first + " " + last);

        sc.close();
    }
}