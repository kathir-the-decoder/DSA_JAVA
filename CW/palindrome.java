import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("It is not Palindrome");
                return;
            }
        }
         System.out.println("It is Palindrome");
    }

}