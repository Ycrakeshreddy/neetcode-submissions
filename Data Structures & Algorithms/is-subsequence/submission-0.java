class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0)
        return true;
        int k = 0;
        for(int i=0;i<t.length() && k<s.length();i++){

            if(s.charAt(k) == t.charAt(i))
            k++;
        }

        return k == s.length();


        
    }
}