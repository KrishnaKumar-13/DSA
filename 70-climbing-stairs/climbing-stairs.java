class Solution {
    public int climbStairs(int n) {
        /*if(n <= 1)
        {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2); */

        if(n<=1)return 1;
        int climb1 = 1;
        int climb2 = 2;
        for(int i =3;i<=n;i++)
        {
            int current = climb1 + climb2;
            climb1 = climb2;
            climb2 = current;
        }
        return climb2;
    }
}