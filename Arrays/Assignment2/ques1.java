package Arrays.Assignment2;
import java.util.*;
class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int sum = 0;

        // Pair the consecutive elements and sum the minimum elements in each pair
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        int maxSum = arrayPairSum(nums);
        System.out.println("Maximized sum: " + maxSum);
    }
}
