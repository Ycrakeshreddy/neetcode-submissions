class Solution {
    public boolean isAnagram(String s, String t) {


        int n = s.length();
        int m = t.length();

        if(n != m)
        return false;

        char[] ar1 = s.toCharArray();
        char[] ar2 = t.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1,ar2))
        return true;

        else
        return false;



    }
}
