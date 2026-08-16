class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        StringBuilder sb = new StringBuilder(s);

        String reverse = sb.reverse().toString();
     

        if(s.equals(reverse))
        return true;

        else
        return false;

    }
}
