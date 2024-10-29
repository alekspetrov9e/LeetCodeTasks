public class AddDigits {

    public int addDigits(int num) {
        int current = num;
        while (true){
            String number = String.valueOf(current);
            int a =0;
            for (int i = 0; i < number.length(); i++){

                int parsedInt = Integer.parseInt(String.valueOf(number.charAt(i)));
                a += parsedInt;
            }
            if (a <= 9){
                return a;
            }else{
                current = a;
            }
        }
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(38));
    }
}
