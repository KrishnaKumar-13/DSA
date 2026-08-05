class Solution {
    public boolean detectCapitalUse(String word) {
        int lowercase = 0;
        int uppercase = 0;

        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uppercase++;
            }else{
            lowercase++;
            }
        }
        if(uppercase == word.length())
        {
            return true;
        }
        if(lowercase == word.length())
        {
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && lowercase == word.length()-1)
        {
            return true;
        }
        return false;
    }
}