class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        double sum =0;
        double avg =Double.NEGATIVE_INFINITY;;
        for(int right =0;right<nums.length;right++)
        {
            sum = sum+nums[right];
            if(right -left+1 == k)
            {
                avg = Math.max(avg,sum/k);
                sum = sum - nums[left];
                left++;
            }
        }
        return avg;
    }
}