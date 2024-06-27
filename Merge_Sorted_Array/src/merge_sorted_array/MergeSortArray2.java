package merge_sorted_array;

public class MergeSortArray2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1)
            System.out.print(num + ", ");
    }


}
