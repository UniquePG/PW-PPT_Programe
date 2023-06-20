import java.util.Arrays;

class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Return the remaining array as a new subarray of length k
        int[] remainingArray = Arrays.copyOfRange(nums, 0, k);
        System.arraycopy(remainingArray, 0, nums, 0, k);

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result); // Output: 2
        // The array after removing all occurrences of 3: [2, 2]
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, result))); 
    }
}
