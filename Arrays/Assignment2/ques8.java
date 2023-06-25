package Arrays.Assignment2;
import java.util.Arrays;

class MinScoreAfterOperation {
    public static int minScore(int[] nums, int k) {
        int n = nums.length;

        // Sort the array in non-decreasing order
        Arrays.sort(nums);

        // Initialize the minimum and maximum elements
        int minElement = nums[0];
        int maxElement = nums[n - 1];

        // Initialize the minimum score as the difference between the maximum and minimum elements
        int minScore = maxElement - minElement;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Calculate the potential minimum and maximum elements after changing nums[i]
            int potentialMin = Math.min(minElement + k, nums[i + 1] - k);
            int potentialMax = Math.max(maxElement - k, nums[i] + k);

            // Update the minimum and maximum elements
            minElement = Math.min(minElement, potentialMin);
            maxElement = Math.max(maxElement, potentialMax);

            // Update the minimum score
            minScore = Math.min(minScore, maxElement - minElement);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 5};
        int k = 3;
        int minScore = minScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}

