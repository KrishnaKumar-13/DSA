class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int org = x;
        int rem;
        if(x<0)
        {
            System.out.println("false");
        }
        while(x>0)
        {
            rem = x%10;
            ans = ans*10+rem;
            x/=10;
        }
        return org == ans;
    }
}