class MyHashSet {
    List<Integer> lis;

    public MyHashSet() {
        lis = new ArrayList<>();
        
    }
    
    public void add(int key) {
        if(!lis.contains(key))
            lis.add(key);
        
    }
    
    public void remove(int key) {
        for(int i = 0;i < lis.size(); i++){
            if(lis.get(i) == key)
            lis.remove(i);
        }
    }
    
    public boolean contains(int key) {
        for(int i = 0; i < lis.size(); i++){
            if(lis.get(i) == key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
