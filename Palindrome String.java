class Solution {
int isPalindrome(String S) {
        int n=S.length()-1;
        for(int i=0;i<n;i++) {
            if(S.charAt(i) != S.charAt(n)) {
                return 0;
            }
            n--;
        }
        return 1;
    
    }
};
