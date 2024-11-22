class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i>=0; i--){
            
            // increment the last element by 1.
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            // if the number in the digit is 9, make it 0
            digits[i] = 0;
        }

        // if the digits are [9,9,9,9], increase the length by 1.
        int[] numbers = new int[n+1];

        // add 1 at the beginning.
        numbers[0] = 1;


        return numbers;
    }
}