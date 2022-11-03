class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i=0,j=0;
        int n=s.length();
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
          while(j<n){
          char c=s.charAt(j);
          if(map.containsKey(c))
          i = Math.max(map.get(c)+1,i);
               map.put(c,j);
            ans = Math.max(ans, j-i+1);
            j++;
          }
        return ans;
    }
}
 
