class Solution {

    static boolean isPalindrome(String s ,int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
    public String longestPalindrome(String s) {
        int size = s.length();
        int l = 0;
        int r = 0;
        int ans =0;

        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(isPalindrome(s,i,j)  && (j-i+1)> ans ){
                    ans = j-i+1;
                    l =i;
                    r =j;
                }
            }
        }
        return s.substring(l,r+1);
    }
}