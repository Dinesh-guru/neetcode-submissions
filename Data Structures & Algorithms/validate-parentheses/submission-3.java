class Solution {
    public boolean isValid(String s) {
        int i=0;
        Stack<Character> st=new Stack<>();
        Stack<Character> st1=new Stack<>();
        while(i<s.length()){
            if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                if (!st.isEmpty()&&s.charAt(i)==')'&&st.peek()=='('){
                    st.pop();
                }
                else if (!st.isEmpty()&&s.charAt(i)==']'&&st.peek()=='['){
                    st.pop();
                }
                else if (!st.isEmpty()&&s.charAt(i)=='}'&&st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }

        return st.isEmpty();
    }
}
