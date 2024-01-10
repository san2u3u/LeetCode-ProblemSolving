class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= target) // Both > and == can be the answer!
                return i;
        }

        return nums.length;
    }
}