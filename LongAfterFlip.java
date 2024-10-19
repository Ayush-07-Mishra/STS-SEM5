public class LongAfterFlip {
    public static int longestConsecutiveOnes(int n) {
        String binary = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;
        int previousLength = 0;
        boolean zeroFound = false;
        
        // Traverse the binary representation
        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                currentLength++;  // Increment for consecutive 1's
            } else {
                maxLength = Math.max(maxLength, currentLength + previousLength + 1);  // Check if flipping a 0
                previousLength = currentLength;  // Store current length before resetting
                currentLength = 0;  // Reset current length after encountering a 0
                zeroFound = true;   // Indicates that a 0 has been flipped
            }
        }

        // In case the loop ends with 1's, compare the lengths again
        maxLength = Math.max(maxLength, currentLength + previousLength + (zeroFound ? 1 : 0));

        return maxLength;
    }

    public static void main(String[] args) {
        int n = 0b111011110;  // Input number in binary
        System.out.println("Longest Consecutive Ones after one flip: " + longestConsecutiveOnes(n));  // Output: 8
    }
}
