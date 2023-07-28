class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        if(x==1 || y==1)
        {
            if(x==1 && y!=1)
            {
                for(int i=1; x+i<=bound; i*=y)
                {
                    ans.add(i+x);
                }
            }
            else if(x!=1 && y==1)
            {
                for(int i=1; y+i<=bound; i*=x)
                {
                    ans.add(i+y);
                }
            }
            else
            {
                if(x+y <= bound)
                    ans.add(2);
            }
            return ans;
        }
        for(int i=1; i<=bound; i*=x)
        {
            for(int j=1; i+j<=bound; j*=y)
            {
                if((i+j <= bound) && !(hash.containsKey(i+j)))
                {
                    hash.put(i+j, 1);
                    ans.add(i+j);
                }
                else if(i+j > bound) break;
            }
        }
        return ans;    
    }
}
