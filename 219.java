class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(result.containsKey(nums[i])){
                int index = result.get(nums[i]);
                System.out.println(index);
                if(i - index <= k) {

                    return true;
                }         
            }
                result.put(nums[i],i);
            
        }
        return false;
        
    }
}

// We have to update the new index everytime hence
// no else is used and put is done in every iteration.
