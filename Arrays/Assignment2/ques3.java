package Arrays.Assignment2;

class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        int[] count = new int[20001];

        // Count frequencies of numbers in nums
        for (int num : nums) {
            count[num]++;
        }

        int longestSubsequenceLength = 0;

        // Iterate through the count array
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] != 0 && count[i + 1] != 0) {
                int currentLength = count[i] + count[i + 1];
                longestSubsequenceLength = Math.max(longestSubsequenceLength, currentLength);
            }
        }

        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLength = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequenceLength);
        // Output: Length of the longest harmonious subsequence: 5
    }
}
