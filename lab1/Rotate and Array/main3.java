class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || k == 0) return;
        // assuming the length is 5, rotate 3 times= rotate 8 times;
        k %= nums.length;
        // rotate one array first
        reverse(nums, 0, nums.length - 1);
        // Then locally rotate the array in the 0-k-1 range;
        reverse(nums, 0, k - 1);
        // Finally rotate k~len-1;
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}

