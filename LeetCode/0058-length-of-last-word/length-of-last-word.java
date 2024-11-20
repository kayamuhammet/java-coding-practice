class Solution {
    public int lengthOfLastWord(String s) {
        int w_size=0;
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            w_size++;
            i--;
        }

        return w_size;



        /* Method-2 less memory
        int length = 0;
        boolean inWord = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (inWord) break; 
            } else {
                inWord = true;
                length++;
            }
        }

        return length;
        */



        /* Method-3 - short and clear
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
        */
    }
}