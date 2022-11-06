Check for all palindrome in all the substring.
class Solution {  
  public static boolean isPalindrome(String sub){
        int i=0;
        int j=sub.length()-1;
        
        while(i<j){
        if(sub.charAt(i)!=(sub.charAt(j)))
            return false;
         i++;j--;
        }
         return true;
    }
    public String longestPalindrome(String s) {
        int count=0;
        String sub=null;
        String ans=null;     
        StringBuffer str=new StringBuffer();
        for(int i=0;i<s.length();i++){
            int j=i+1;
           while(j<=s.length()){
             sub=s.substring(i,j);
             if(isPalindrome(sub)){
                // System.out.println(sub); 
                if(count<sub.length()){ 
                     ans=sub;     
                 count=Math.max(count,sub.length());
                }
             }
             j++;
             }
             
           }
         return ans;  
       
    }
}

class Solution {
    public String longestPalindrome(String s) {
        int  n=s.length(); 
        String res="";
        int resLength=0;

        //odd length panlidrome
        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1) > resLength){
                    res=s.substring(l,r+1);
                    resLength=r-l+1;
                }
                l--;
                r++;
            }
            //even length
            l=i;r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1) > resLength){
                    res=s.substring(l,r+1);
                    resLength=r-l+1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
