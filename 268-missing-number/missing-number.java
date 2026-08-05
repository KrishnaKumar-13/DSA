class Solution {
    public int missingNumber(int[] nums) {
        // i am using the cycle sort [o,n]
       /* int i =0;
        while(i<nums.length)
        {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        // to find the missing number
            for(int index = 0;index <nums.length;index++)
            {
                if(nums[index]!= index)
                {
                   return index;
                }
            } 
            return nums.length;*/
// lets us do with bit manipulation 

        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}