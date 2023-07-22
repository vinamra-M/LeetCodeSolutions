class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int result = 0;
        // write your code here
        int[] visited = new int[rooms.size()];
        for (int i = 0; i <rooms.get(0).size(); i++) {
            if (visited[rooms.get(0).get(i)] == 0) {
                explore(rooms, i, visited);
                result++;
            }
        }
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == 0) return false;
        }
        return true;
    }

    private static void explore(List<List<Integer>> rooms, int x, int[] visited) {
        visited[x] = 1;
        for (int i = 0; i < rooms.get(x).size(); i++) {
            if (visited[rooms.get(x).get(i)] == 0)
                explore(rooms, rooms.get(x).get(i), visited);
        }
    }
}
