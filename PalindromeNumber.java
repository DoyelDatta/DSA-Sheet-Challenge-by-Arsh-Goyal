class Solution {
    public boolean isPalindrome(int x) {
        int r,rev=0;
        int t=x;
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        return(rev==t);
    }
}
