class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int j = 0;
        String temp ="";
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i) == t.charAt(j)){
                temp = temp + t.charAt(j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(s.equals(temp))
        {
            return true;
        }
        return false;
    }
}