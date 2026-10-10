
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char chLeft = s.charAt(left);
            char chRight = s.charAt(right);

            if (!Character.isLetterOrDigit(chLeft)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(chRight)) {
                right--;
            } 
            else if (chLeft != chRight) {
                return false;
            } 
            else {
                left++;
                right--;
            }
        }

        return true;
    }
}