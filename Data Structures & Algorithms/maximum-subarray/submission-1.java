class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currsum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            max=Math.max(max,currsum);
        }
        return max;
    }

}
