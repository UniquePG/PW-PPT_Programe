package Arrays.Assignment2;

import java.util.*;


class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Calculate the product of the two smallest numbers and the largest number
        int product1 = nums[0] * nums[1] * nums[n - 1];

        // Calculate the product of the three largest numbers
        int product2 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Return the maximum product
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int maxProduct = maximumProduct(nums);

        System.out.println("Maximum product of three numbers: " + maxProduct);
    }
}
