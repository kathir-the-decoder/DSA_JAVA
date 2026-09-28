import java.util.*;

class count_vowels_and_consonents{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int con = 0;
        int vol = 0;

        Character[] chh = {'a','e','i','o','u','A','E','I','O','U'};

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Arrays.asList(chh).contains(ch)) {
                vol++;
            } else {
                con++;
            }
        }

        System.out.println("Vowels: " + vol);
        System.out.println("Consonants: " + con);
    }
}