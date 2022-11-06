class Solution {
    public int myAtoi(String s) {
        int ans=0;
        boolean isSigned=false;
        int index=0;
        while(index<s.length() && s.charAt(index)==' ')
        index++;

        if(index<s.length() && s.charAt(index)=='-'){
        isSigned = true;
        index++;
        }
        else if(index<s.length() && s.charAt(index)=='+'){
        index++;
        }
        
        for(int i=index;i<s.length();i++){
         char a=s.charAt(i);
         if(a-'0'>=0 && a-'0'<=9){
               
                
                System.out.println(ans); 
               if(ans>Integer.MAX_VALUE/10 || (ans == (Integer.MAX_VALUE / 10) && a-'0' > 7)) {
                return isSigned ? Integer.MIN_VALUE : Integer.MAX_VALUE;
               }
               ans=ans*10+ a - '0'; 
         
          }
          else{
              break;
          }
        }
         System.out.println(ans);
        if(isSigned==true)
        return -(ans);
        else
        return ans;
    }
}
