package plus_one;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        int digitLength = digits.length - 1;
        int i = 0;
        int[] result = new int[digits.length];
        int largeInteger = 0;
        while (i<digitLength){
            if (digits[i] < digits[i+1]){
                largeInteger = digits[i+1];
            }
            i++;
        }
        for (int j = 0; j < digitLength+1; j++){
            if (digits[j] != largeInteger) {
                result[j] = digits[j];
            }
            else {
                result[j] = largeInteger+1;
            }

        }
        return result;
    }
    public static void main(String[] args){
        int[] digits = {1,3,2};
        int[] result = plusOne(digits);
        for (int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
