package Arrays.Assignment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        int n = nums.length;
        if (n < 4) {
            return quadruplets; // Not enough elements for a quadruplet
        }

        Arrays.sort(nums); // Sort the array in ascending order

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first element of the quadruplet
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates for the second element of the quadruplet
                }

                int left = j + 1; // Pointer to the element next to nums[j]
                int right = n - 1; // Pointer to the last element in the array

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        // Found a quadruplet with the target sum
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third and fourth elements of the quadruplet
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++; // Move the left pointer to the next unique element
                        right--; // Move the right pointer to the next unique element
                    } else if (sum < target) {
                        left++; // Move the left pointer to increase the sum
                    } else {
                        right--; // Move the right pointer to decrease the sum
                    }
                }
            }
        }

        return quadruplets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> quadruplets = fourSum(nums, target);
        System.out.println("Quadruplets:");
        for (List<Integer> quadruplet : quadruplets) {
            System.out.println(quadruplet);
        }
        // Output:
        // Quadruplets:
        // [-2, -1, 1, 2]
        // [-2, 0, 0, 2]
        // [-1, 0, 0, 1]
    }
}

