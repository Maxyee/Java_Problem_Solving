package search_position;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = i+1;
        for (i=0;i<n;i++){
            if (nums[i]==target){
                return i;
            }
            else if (target<nums[i]){
                return i;
            }
        }
        return i++;
    }

    public static void main(String[] args){
        int[] nums = {1};
        int target = 2;

        int k = searchInsert(nums, target);

        System.out.print("Search Position: " + k);
    }
}

/*
    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        int j = 1;
        if (target == 0){
            result = 0;
        }
        else{
            for (int i = 0; i < nums.length; i++){
                if (nums[i] != target){
                    if (nums[nums.length-1] < target){
                        if (nums[i] < target && nums[j] > target){
                            result = i + 1;
                            break;
                        }
                        else {
                            result = nums.length;
                            j++;
                        }
                    }
                }
                else {
                    result = i;
                }

            }
        }
        return result;
    }

 */
