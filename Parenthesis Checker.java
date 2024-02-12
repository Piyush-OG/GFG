class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        if(x.length()==1) return false;
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0;i<x.length();i++){
            if(list.size()==0 && (x.charAt(i)==']' || x.charAt(i)=='}' || x.charAt(i)==')')) return false;
            if(x.charAt(i)=='[' || x.charAt(i)=='{' || x.charAt(i)=='('){
                list.add(x.charAt(i));
            }
            if(x.charAt(i)==']'){
                if(list.get(list.size()-1)=='['){
                    list.remove(list.size()-1);
                }else{
                     return false;
                }
            }
            if(x.charAt(i)=='}'){
                if(list.get(list.size()-1)=='{'){
                    list.remove(list.size()-1);
                }else{
                     return false;
                }
            }
            if(x.charAt(i)==')'){
                if(list.get(list.size()-1)=='('){
                    list.remove(list.size()-1);
                }else{
                    return false;
                }
            }
        }
        
        if(list.size()>0){
            return false;
        }
        
        return true;
        
        
    }

}
