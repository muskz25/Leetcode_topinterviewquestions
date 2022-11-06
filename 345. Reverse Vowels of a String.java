class Solution {
      static boolean isVowel(char ch) {
        return
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
        int n=s.length();
        int i=0,j=n-1;
        char[] chars = s.toCharArray();
        while(i<j){
              
            while(i<j && !isVowel(s.charAt(i))) ++i;
            while(i<j && !isVowel(s.charAt(j))) --j;
            System.out.println(s.charAt(i)+""+s.charAt(j));
                 char temp=chars[i];
                 chars[i]=chars[j];
                 chars[j]=temp;
                  i++;j--;
        }
        return new String(chars);
    }
}




class Solution {
      
    public String reverseVowels(String s) {
    if(s == null || s.length()==0) return s;
    String vowels = "aeiouAEIOU";
    char[] chars = s.toCharArray();
    int start = 0;
    int end = s.length()-1;
    while(start<end){
        
        while(start<end && !vowels.contains(chars[start]+"")){
            start++;
        }
        
        while(start<end && !vowels.contains(chars[end]+"")){
            end--;
        }
        
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        
        start++;
        end--;
    }
    return new String(chars);
}

}
