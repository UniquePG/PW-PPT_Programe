package Arrays.Assignment3;
import java.lang.String;
import java.util.*;

class MissingRanges {
    public static String[] findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        
        // Helper function to format the range
        // If start == end, it represents a single missing number
        // Otherwise, it represents a range of missing numbers
        String formatRange(int start, int end) {
            return start == end ? String.valueOf(start) : start + "->" + end;
        }
        
        // Handle the case where nums is empty
        if (nums.length == 0) {
            return new String[]{formatRange(lower, upper)};
        }
        
        // Check if there are missing numbers before the first element
        if (nums[0] > lower) {
            result.add(formatRange(lower, nums[0] - 1));
        }
        
        // Check for missing numbers between elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                result.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }
        
        // Check if there are missing numbers after the last element
        if (nums[nums.length - 1] < upper) {
            result.add(formatRange(nums[nums.length - 1] + 1, upper));
        }
        
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        String[] result = findMissingRanges(nums, lower, upper);
        for (String range : result) {
            System.out.println(range);
        }
    }
}


