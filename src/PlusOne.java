import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int naum = 0;
        boolean flag = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i==0 && digits[i]==9 && naum == 1) {
                digits[i] = 0;
                flag = true;
                continue;
            }
            if (naum == 1){
                digits[i] = digits[i] + 1;
                naum = 0;
                if(digits[i] == 10){
                    digits[i] = 0;
                    naum++;
                }
                continue;
            }
            if(i == digits.length - 1){
                digits[i] = digits[i] + 1;
                if(digits[i] == 10){
                    digits[i] = 0;
                    naum++;
                }
            }
        }
        if(flag || naum == 1){
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            for (int i = 1; i < digits2.length; i++) {
                digits2[i] = digits[i-1];
            }
            return digits2;
        }
        return digits;
    }
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(digits));
    }
}
