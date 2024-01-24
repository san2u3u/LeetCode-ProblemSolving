class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        res = nums[nums.length / 2]; // center of the Array is always answer number
        return res;
    }
}