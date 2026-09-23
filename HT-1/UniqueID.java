import java.util.*;

public class UniqueID {
    public static void main(String[] args) {
        try{
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
        ArrayList<Integer> ids = new ArrayList<>();


        boolean isUnique = true;

        for (int i = 0; i < n; i++) {
            ids.add(scn.nextInt());
        }

        for (int i = 0; i < ids.size(); i++) {
            for (int j = i + 1; j < ids.size(); j++) {
                if (ids.get(i).equals(ids.get(j))) {
                    isUnique = false; 
                    break; 
                }
            }
            if (!isUnique) {
                break; 
            }
        }

        if (isUnique) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scn.close();
    }
    catch(Exception e){
        System.out.print("Invalid");
    }
    }
}