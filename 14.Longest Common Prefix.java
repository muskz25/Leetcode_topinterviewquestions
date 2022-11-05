class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuffer str=new StringBuffer();
        for(int i=0;i<strs[0].length();i++){
            char a=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(a!=(strs[j].charAt(i)))
                {
                   return str.toString();
                }
               
            }
             str.append(a);
        }
        return str.toString();
    }
}
TC: O(S) , where S is the sum of all characters in all strings
SC: O(1)
