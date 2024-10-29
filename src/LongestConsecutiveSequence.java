import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int[]sorted_nums =  Arrays.stream(nums).sorted().distinct().toArray();
        int max_seq = 1;
        int cur_seq = 1;
        int j = sorted_nums[0];
        for(int i=0;i<sorted_nums.length;i++){
            if (sorted_nums[i]==j+1){
                cur_seq++;
                j++;
            }else{
                cur_seq = 1;
                j = sorted_nums[i];
            }
            if(cur_seq>max_seq){
                max_seq = cur_seq;
            }
        }
        return max_seq;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

}
