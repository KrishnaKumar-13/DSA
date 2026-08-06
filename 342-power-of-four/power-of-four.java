class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        int count = 0;
        int position = -1;
        for(int pos = 0;pos<32;pos++) // 32 bits 
        {
            if((n&(1<<pos))!=0)
            {
                count++;
                position = pos;   
            }
            if(count > 1)
            {
                return false;
            }
        }
        return count == 1 && position%2 == 0;
    }
}