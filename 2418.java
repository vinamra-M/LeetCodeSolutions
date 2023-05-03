class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Object[][] mergedArray = new Object[heights.length][2];
        for (int i = 0; i < heights.length; i++) {
            mergedArray[i][0] = heights[i];
            mergedArray[i][1] = names[i];
        }
        Arrays.sort(mergedArray, new Comparator<Object[]>() {
            
          @Override              
          public int compare(Object[] o1, Object[] o2) {
            if ((Integer)o1[0] > (Integer)o2[0])
                return -1;
            else
                return 1;
          }
        });
        String[] ans = new String[heights.length];
        for (int i = 0; i < mergedArray.length; i++) {
            ans[i] = (String) mergedArray[i][1];
        }
        
        return ans;
    }
}
