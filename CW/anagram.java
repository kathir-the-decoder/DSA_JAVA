import java.util.Arrays;
import java.util.Scanner;
class anagram{
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

         Arrays.sort(arr1);
         Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter the first string: ");
        
        String s1=sc.nextLine();
        
        System.out.print("Enter the second string: ");
        
        String s2=sc.nextLine();
        System.out.print(areAnagrams(s1,s2));
 }
}