class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(st.isEmpty())
        return true;
        int left =0;
        int right = st.length()-1;
        while(left<right){
        if(st.charAt(left)!= st.charAt(right))
        {
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
}