import java.util.*;

class Duplicates {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                res.add(num);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 1};
        Duplicates duplicates = new Duplicates();

        System.out.println(duplicates.findDuplicates(nums));
    }
}