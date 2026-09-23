package CW;

import java.util.*;
public class ConDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
                
            }
            hash.add(nums[i]);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        ConDuplicate obj = new ConDuplicate();
        System.out.println(obj.containsDuplicate(nums));
}
}