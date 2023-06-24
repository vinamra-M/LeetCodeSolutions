class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char First = s.charAt(start);
        	char Last = s.charAt(last);
        	if (!Character.isLetterOrDigit(First )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(Last)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(First) != Character.toLowerCase(Last)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}
