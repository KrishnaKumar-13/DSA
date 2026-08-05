class Solution {
    public int maxSubArray(int[] nums) {
        // to find how many subarrays we use n*(n+1)/2;

        /*int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            int sum = 0;
            for(int j = i;j<nums.length;j++)
            {
                sum = sum + nums[j];
                max = Math.max(max,sum);
            }
        }
        return max; */

        //  we use Kadane's algorithm (O(n)) to manaege negative integers
        int maxSum = nums[0];
        int currentSum = 0;

        for(int num : nums) {

            currentSum += num;

            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}