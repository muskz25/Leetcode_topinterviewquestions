class Solution {
    public int reverse(int x) {
        boolean isSigned=false;
        if(x<0){
        isSigned=true;
        x=-(x);
        }
        int ans=0;
       // -2,147,483,648 to 2,147,483,647.
        while(x>0){
              int modo=x%10;
                if(ans>Integer.MAX_VALUE/10) return 0;
                    ans=ans*10+ modo;
                    x=x/10;
            }
            if(isSigned==true)
            return -(ans);
            else
            return ans;     
    }
}
