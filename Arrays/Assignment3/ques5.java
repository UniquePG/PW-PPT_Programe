package Arrays.Assignment3;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i]++;
            
            // If the current digit becomes 10, set it to 0 and carry the 1 to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If the current digit is less than 10, no carry is needed, so we can return the digits array
                return digits;
            }
        }
        
        // If we reach this point, it means all digits were 9 and the carry propagated to the most significant digit
        // We need to create a new array with a length n+1 and set the first digit to 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " "); // Output: 1 2 4
        }
        System.out.println();

        digits = new int[]{9, 9, 9};
        result = plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " "); // Output: 1 0 0 0
        }
        System.out.println();
    }
}

