package Arrays.Assignment2;


class MaxCandies {
    public static int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxLimit = n / 2;

        boolean[] uniqueCandies = new boolean[200001];

        for (int candy : candyType) {
            uniqueCandies[candy] = true;
        }

        int uniqueCount = 0;
        for (boolean isUnique : uniqueCandies) {
            if (isUnique) {
                uniqueCount++;
            }
        }

        return Math.min(uniqueCount, maxLimit);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxCandies = maxCandies(candyType);
        System.out.println("Maximum number of different candies Alice can eat: " + maxCandies);
        // Output: Maximum number of different candies Alice can eat: 3
    }
}
