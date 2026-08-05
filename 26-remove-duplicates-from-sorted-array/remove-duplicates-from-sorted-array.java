class Solution {
    public int removeDuplicates(int[] nums) {
       int i =0;
       // we only iterate j because i stay at first position so it is not a dupilcate number 
       //if i == j then it is duplicate
       //so we check  nums[i]!=nums[j] if it is true then we place j element 
       // i+1 postion and iterate i so,then i is at last position so we return i+1= because i start from 0 so return i+1;
        for(int j =1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;   
    }
}