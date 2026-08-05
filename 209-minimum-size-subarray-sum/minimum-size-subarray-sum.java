class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int left =0;
        int windowlength = Integer.MAX_VALUE;

        for(int right = 0;right<nums.length;right++)
        {
            sum = sum + nums[right];
            while(sum >= target)
            {
                windowlength = Math.min(windowlength,right-left+1);
                //we are shirnking array
                sum = sum - nums[left];
                left++;
            }
        }
        return (windowlength == Integer.MAX_VALUE)?0:windowlength;
    }
}