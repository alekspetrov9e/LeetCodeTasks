import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        int cur = 0;
        for (int i = 0; i < sorted.length ; i++) {
            if (sorted[i] != cur){
                return cur;
            }
            cur++;
        }
        return cur;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{0,1}));
    }
}
