class Solution {
    public static void solve(int open,int close,List<String> ans,String curr){
        if(close==0 && open==0){
            ans.add(curr);
            return;
        }

          if( open>0){
            solve(open-1,close,ans,curr+'(');

        }
        if(close>open)
            solve(open,close-1,ans,curr+')');
        

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<String>();
         solve(n,n,ans,""); 
         return ans;       
    }
}
      
        
