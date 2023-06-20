import java.util.*;
class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int left = 0; // Pointer for the next position to be filled with a nonzero element

        // Traverse the array with the right pointer
        for (int right = 0; right < nums.length; right++) {
            // If the current element is nonzero, move it to the left pointer position
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        // Fill the remaining positions with zeros
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

