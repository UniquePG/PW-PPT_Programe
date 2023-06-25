package MockTest1;
import java.util.*;

class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                insertPos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
    }

    
}


