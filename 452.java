class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        boolean[] array = new boolean[points.length];
        for(int i = 0; i < points.length; i++)
            array[i] = false;
        return sign(points, array);
        
    }
     public static int sign(int[][] rods, boolean[] array) {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < rods.length; i++) {
            if (array[i] == false) {
                count++;
                arr.add(rods[i][1]);
                array[i] = true;
                for (int j = i + 1; j < rods.length; j++) {
                    if (rods[i][1] >= rods[j][0] && rods[i][1] <= rods[j][1] && array[j] == false) {
                        array[j] = true;
                    }
                }
            }
        }
        return count;
        }

    }
