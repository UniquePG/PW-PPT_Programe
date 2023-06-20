import java.util.Arrays;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Sort the array in non-decreasing order
        Arrays.sort(nums);

        // Check for adjacent elements that are equal
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));
    }
}

