class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
      for (char c : s.toCharArray()) {
          if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
       }
           return stack.isEmpty();
       
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
               st.push(s.charAt(i));
           }
           else {
               //if(st.isEmpty()) return false;
            if(st.isEmpty() || (st.peek()!='(' && s.charAt(i)==')') || (st.peek()!='{' && s.charAt(i)=='}') || (st.peek()!='[' && s.charAt(i)==']'))
           return false;
               st.pop();
           
       }
       }
           return st.isEmpty();
       
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
               st.push(s.charAt(i));
           }
           else {
               //if(st.isEmpty()) return false;
            if(st.isEmpty() || (st.peek()!='(' && s.charAt(i)==')') || (st.peek()!='{' && s.charAt(i)=='}') || (st.peek()!='[' && s.charAt(i)==']'))
           return false;
               st.pop();
           
       }
       }
           return st.isEmpty();
       
    }
}
