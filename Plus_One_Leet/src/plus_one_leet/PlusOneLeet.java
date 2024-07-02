package plus_one_leet;

public class PlusOneLeet {
    public static int[] plusOneLeet(int[] digits){
        int[] arr = digits;
        int n=arr.length;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;

        }
        int[] ne=new int[n+1];
        ne[0]=1;
        return ne;
    }
    public static void main(String[] args){
        int[] digits = {1,9};
        int[] result = plusOneLeet(digits);
        for (int z = 0; z<result.length;z++){
            System.out.println(result[z]);
        }
    }
}
