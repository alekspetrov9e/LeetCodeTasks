import java.util.ArrayList;

public class HappyNumber {
    public boolean isHappy(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int score = n;
        while (true){
            String number = String.valueOf(score);
            int a =0;
            for (int i = 0; i < number.length(); i++){

                int parsedInt = Integer.parseInt(String.valueOf(number.charAt(i)));
                int x = parsedInt * parsedInt;
                a += x;
            }
            if (a == 1){
                return true;
            }else{
                if (list.contains(a)){
                    return false;
                }
                list.add(a);
                score = a;
            }
        }
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(2));
    }
}
