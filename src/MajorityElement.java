import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                if (map.get(num) + 1 > nums.length / 2){
                    return num;
                }
                map.put(num, map.get(num) + 1);
            }else {
                map.put(num, 1);
                if (map.get(num) > nums.length / 2){
                    return num;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1}));
    }
}
