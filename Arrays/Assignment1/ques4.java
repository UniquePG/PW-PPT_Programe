import java.util.*;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i]++;

            // Check if there is no carry, we can stop iterating
            if (digits[i] < 10) {
                return digits;
            }

            // If there is a carry, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If all digits are 9 and we still have a carry, create a new array with an additional digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 4]

    }
}

