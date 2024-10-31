import java.util.Arrays;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

       // return searchRangeHelper(nums, target, 0, nums.length - 1);
        int x = searchRangeHelper(nums, target, 0, nums.length - 1);
        return helper2(nums, target, x);

    }
    public static int searchRangeHelper(int[] nums, int target,int l,int r) {
        int middle = (l + r) / 2;
        if (l == r - 1){
            if (nums[l] == target){
                return l;
            }
            if (nums[r] == target){
                return r;
            }
            return -1;
        }
        if (nums[middle] == target) {
            return middle;
        }
        if (r<=l){
            return -1;
        }

        if (nums[middle] < target) {
            return searchRangeHelper(nums, target, middle+1, r);
        }
        return searchRangeHelper(nums, target, l, middle - 1);

    }
    public static int[] helper2(int[] number,int target, int index) {
        if (index == -1){
            return new int[]{-1,-1};
        }
        int l = index;
        int r = index;

        while (true) {
            if (l == -1){
                break;
            }
            if (number[l] == target) {
                l--;
            }else{
                break;
            }
        }
        while (true) {
            if (r == number.length) {
                break;
            }
            if (number[r] == target) {
                r++;
            }else{
                break;
            }
        }

        return new int[]{l+1,r-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1, 3, 5, 6}, 6)));
    }

}
