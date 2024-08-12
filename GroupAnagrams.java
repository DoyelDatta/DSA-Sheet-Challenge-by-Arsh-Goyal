class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        Map<String,List<String>> map=new HashMap<>();
        for(String word:str)
        {
            char[] c=word.toCharArray();
            Arrays.sort(c);
            String sw=new String(c);
       
          if(!map.containsKey(sw))
           {
            map.put(sw,new ArrayList<>());
            }
            map.get(sw).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
