package climbing_stars;

public class Climb {
    public static int climbStairs(int n){
        if( n == 1){
            return 1;
        }
        if( n == 2){
            return 2;
        }

        int a = 1; int b = 2;
        for(int i = 3; i<=n ; i++){
            int temp = a+b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args){
        int number = 4;
        int result = climbStairs(number);
        System.out.println(result);
    }
}
