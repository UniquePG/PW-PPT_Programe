class FindErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];

        // Mark the presence of numbers
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] < 0) {
                result[0] = num; // Duplicate number
            } else {
                nums[num - 1] = -nums[num - 1];
            }
        }

        // Find the missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1; // Missing number
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate number: " + result[0]); 
        System.out.println("Missing number: " + result[1]); 
    }
}

