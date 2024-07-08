package sqrt_x;

public class SqrtX {
    public static int mySqrt(int x){
        if (x == 0) return 0;
        int i = 1, right = x, result = 0;

        while (i <= right){
            int mid = i + (right - i) / 2;
            if (mid <= x / mid){
                result = mid;
                i = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int x = 1;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
