class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> r = new HashMap<>();

        for(String s : strs) {

            char ca[] = s.toCharArray();
            Arrays.sort(ca);

            String ss = new String(ca);

            r.putIfAbsent(ss,new ArrayList<>());

            r.get(ss).add(s);

         }
         return new ArrayList<>(r.values());
        
    }
}
