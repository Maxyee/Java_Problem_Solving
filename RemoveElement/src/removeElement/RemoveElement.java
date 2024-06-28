package removeElement;

public class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.print("After removed the element array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
