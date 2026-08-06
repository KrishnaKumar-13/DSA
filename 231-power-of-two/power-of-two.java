class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        int count = 0;
        for(int pos = 0;pos<32;pos++) // 32 bits 
        {
            if((n&(1<<pos))!=0)
            {
                count++;    
            }
            if(count > 1)
            {
                return false;
            }
        }
        return count == 1;
    }
}