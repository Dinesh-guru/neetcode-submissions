class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int operand2=st.pop();
                int operand1=st.pop();
                ans=operand1+operand2;
                st.push(ans);
            }
            else if(tokens[i].equals("-")){
                int operand1=st.pop();
                int operand2=st.pop();
                ans=operand2-operand1;
                st.push(ans);
            }
            else if(tokens[i].equals("*")){
                int operand2=st.pop();
                int operand1=st.pop();
                ans=operand2*operand1;
                st.push(ans);
            }
            else if(tokens[i].equals("/")){
                int operand1=st.pop();
                int operand2=st.pop();
                ans=operand2/operand1;
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}