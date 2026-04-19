class MinStack {
    Stack<Integer> st;
    int min;
    public MinStack() {
        st=new Stack();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        st.push(val);
        min=Math.min(val,min);
    }
    
    public void pop() {
        int top=st.pop();
        if(top==min){
            min=Integer.MAX_VALUE;
            for(Integer num :st){
                min=Math.min(min,num);
            }
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       
        return min;
    }
}
