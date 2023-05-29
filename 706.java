class MyHashMap {
    ArrayList<Integer> keyL;
    ArrayList<Integer> valL;

    public MyHashMap() {
        keyL = new ArrayList<>();
        valL = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keyL.contains(key))
        {
            int in = keyL.indexOf(key);
            valL.set(in,value);
        }
        else
        {
            keyL.add(key);
            valL.add(value);
        }
        
        
    }
    
    public int get(int key) {
        if(!keyL.contains(key))
        {
            return -1;
        }
        else
        {
            int in = keyL.indexOf(key);
            return valL.get(in);
        }
        
    }
    
    public void remove(int key) {
        if(keyL.contains(key))
        {
            int in = keyL.indexOf(key);
            keyL.remove(in);
            valL.remove(in);
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
