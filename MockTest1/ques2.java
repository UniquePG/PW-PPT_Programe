package MockTest1;

class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] frequency = new int[26];

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s = "leetcode";

        int index = firstUniqChar(s);

        if (index != -1) {
            System.out.println("The first non-repeating character is '" + s.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}


