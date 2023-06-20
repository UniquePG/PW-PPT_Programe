class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create an array to store the complement of each number and its index
        int[] demoarr = new int[target + 1];

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Calculate the complement of the current number
            int complement = target - num;

            // Check if the complement exists in the array
            if (demoarr[complement] != 0) {
                // Return the indices of the two numbers
                return new int[]{demoarr[complement] - 1, i};
            }

            // If the complement doesn't exist, store the current number's index + 1 in the array
            demoarr[num] = i + 1;
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int index : result) {
            System.out.print(index + " ");
        }
        
    }
}
