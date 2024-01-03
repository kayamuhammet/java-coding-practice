class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        
        int number = x;
        int reversed = 0;
        
        while(number != 0){
            int remaining = number % 10;
            reversed = reversed * 10 + remaining;
            number = number / 10;
        }
        
        return reversed == x;
    }
}