class Solution {
    public int scoreOfString(String s) {

        int n = s.length();

         int score = 0;

        for(int i=0;i<n-1;i++) {

            int as1 = s.charAt(i);
            int as2 = s.charAt(i+1);

           

            score += Math.abs(as1-as2);

        }

        return score;
        
    }
}