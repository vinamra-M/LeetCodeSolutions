class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int res = 1;
        while(!stack.isEmpty() && stack.peek()[1] <= price){
            res += stack.pop()[0];
        }
        stack.push(new int[]{res,price});
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
