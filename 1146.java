class SnapshotArray {
    List<Map<Integer, Integer>> arr;

    public SnapshotArray(int length) {
        arr = new ArrayList();
        arr.add(new HashMap());
    }
    
    public void set(int index, int val) {
        int snapId = arr.size()-1;
        arr.get(snapId).put(index, val);
    }
    
    public int snap() {
        arr.add(new HashMap());
        return arr.size() - 2;
    }
    
    public int get(int index, int snap_id) {
        for(int i = snap_id; i >= 0; i--){
            if(arr.get(i).containsKey(index))
            return arr.get(i).get(index);
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
