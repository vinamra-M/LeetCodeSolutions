class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int minCapacity = getMaxWeight(weights);
        int maxCapacity = getSumWeight(weights);

        while (minCapacity < maxCapacity) {
            int midCapacity = minCapacity + (maxCapacity - minCapacity) / 2;
            int requiredDays = calculateRequiredDays(weights, midCapacity);

            if (requiredDays > days) {
                // The weight capacity is too low, increase the minimum capacity
                minCapacity = midCapacity + 1;
            } else {
                // The weight capacity is sufficient or too high, decrease the maximum capacity
                maxCapacity = midCapacity;
            }
        }

        return minCapacity;
    }

    // Helper method to calculate the maximum weight in the weights array
    private int getMaxWeight(int[] weights) {
        int maxWeight = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
        }
        return maxWeight;
    }

    // Helper method to calculate the sum of weights in the weights array
    private int getSumWeight(int[] weights) {
        int sumWeight = 0;
        for (int weight : weights) {
            sumWeight += weight;
        }
        return sumWeight;
    }

    // Helper method to calculate the number of days required to ship all packages
    private int calculateRequiredDays(int[] weights, int capacity) {
        int days = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                // The current package cannot be added to the current day, move to the next day
                days++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }

        return days;
    }
}
