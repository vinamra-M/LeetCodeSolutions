class Solution {
    public int[] asteroidCollision(int[] asteroids) {
 Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int currentAsteroid = asteroids[i];

            // Check for collision
            while (!stack.isEmpty() && stack.peek() > 0 && currentAsteroid < 0) {
                int topAsteroid = stack.peek();
                if (Math.abs(currentAsteroid) > topAsteroid) {
                    stack.pop(); 
                } else if (Math.abs(currentAsteroid) == topAsteroid) {
                    stack.pop(); 
                    currentAsteroid = 0; 
                    break;
                } else {
                    currentAsteroid = 0; 
                    break;
                }
            }

            
            if (currentAsteroid != 0) {
                stack.push(currentAsteroid);
            }
        }

        
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
