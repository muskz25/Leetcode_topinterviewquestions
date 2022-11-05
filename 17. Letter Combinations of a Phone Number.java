
//Iterative
public class Solution {
    public List<String> letterCombinations(String digits) {
    	List<String> list = new ArrayList<String>();
    	if(digits.length() == 0) return list;
    	HashMap<Character, String[]> map = new HashMap<>();
    	map.put('0', new String[]{" "});
    	map.put('2', new String[]{"a", "b", "c"});
    	map.put('3', new String[]{"d", "e", "f"});
    	map.put('4', new String[]{"g", "h", "i"});
    	map.put('5', new String[]{"j", "k", "l"});
    	map.put('6', new String[]{"m", "n", "o"});
    	map.put('7', new String[]{"p", "q", "r", "s"});
    	map.put('8', new String[]{"t", "u", "v"});
    	map.put('9', new String[]{"w", "x", "y", "z"});
    	for(String s : map.get(digits.charAt(0))) 	list.add(s);
        	for(int i = 1; i < digits.length(); i++){
        	    List<String> newList = new ArrayList<String>();
        	    char c = digits.charAt(i);
    		    for(String s : map.get(c)){
    			    for(String inlist : list) newList.add(inlist + s);
                }
                list = newList;
            }
        return list;
    }
}


lass Solution {
    public List<String> letterCombinations(String digits) {
       List<String> res = new ArrayList<>();   
        if(digits==null || digits==""){
            return res;
        }
       Map<Character,String[]> map = new HashMap<>();
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y","z"});
        
            
        solve(map,digits,0,"",res);
        
        return res;
    }
    public static void solve(Map<Character,String[]> map,String digits,int ind,String str,List<String> res){
         if(ind==digits.length()){
            if(str!=""){
                res.add(str);
            }
            return;
        }
         
            char a =digits.charAt(ind);
            String[] s=map.get(a);
            for(int i=0;i<s.length;i++){    
                System.out.println(str + s[i]);   
            solve(map,digits,ind+1,str+s[i],res);
            
        }
        
        }
    
}
       
