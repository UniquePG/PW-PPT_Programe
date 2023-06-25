package Arrays.Assignment2;

class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target, return its index
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is in the right half, update the left pointer
            } else {
                right = mid - 1; // Target is in the left half, update the right pointer
            }
        }

        return -1; // Target is not found in the array
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = search(nums, target);
        System.out.println("Index of the target: " + index);
        // Output: Index of the target: 4
    }
}
