class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the target is not found, the left pointer represents the index where it should be inserted
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = searchInsert(nums, target);
        System.out.println(index); // Output: 2 (Index where target=5 is found)
        
        // target = 2;
        // index = searchInsert(nums, target);
        // System.out.println(index); // Output: 1 (Index where target=2 would be inserted)

        // target = 7;
        // index = searchInsert(nums, target);
        // System.out.println(index); // Output: 4 (Index where target=7 would be inserted)

        // target = 0;
        // index = searchInsert(nums, target);
        // System.out.println(index); // Output: 0 (Index where target=0 would be inserted)
    }
}
