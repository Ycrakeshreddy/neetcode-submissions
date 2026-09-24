
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child
        int j = 0; // cookie
        int c = 0; // satisfied children

        while (i < g.length && j < s.length) {

            if (s[j] >= g[i]) {
                c++;
                i++;
                j++;


            } else {
                j++;
            }
        }

        return c;
    }
}