class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        s = s.toLowerCase();

        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                if (l >= r) {
                    return true;
                }
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            
            if (l == r) {
                return true;
            }

            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else{
                return false;
            }

           
        }

        return true;
    }
}
