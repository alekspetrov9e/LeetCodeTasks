import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }


    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, false);
            } else {
                return true;
            }
        }

        return false;
    }
}
