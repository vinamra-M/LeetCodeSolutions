class MedianFinder {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(max.size() < min.size())
           max.offer(min.poll());
    }
    
    public double findMedian() {
        if(max.size() == min.size()) return (min.peek() + max.peek()) / 2.0;
        else return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
