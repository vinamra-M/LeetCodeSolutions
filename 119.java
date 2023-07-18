class Solution {
    public List<Integer> getRow(int rowIndex) {
                    List<List<Integer>> triangle = new ArrayList<>();
        
        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            // First element of the row is always 1
            currentRow.add(1);
            
            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(sum);
            }
            
            // Last element of the row is always 1
            currentRow.add(1);
            
            triangle.add(currentRow);
        }
        int n = triangle.size();
        return triangle.get(n-1);
        
    }
}
