class Solution {
    public boolean validPalindrome(String s) {
        int x=0,r=s.length()-1;
        while(x<r)
        {
            if(s.charAt(x)!=s.charAt(r))
            {
                return ispal(s,x+1,r) || ispal(s,x,r-1);
            }
            x++;
            r--;
        }
        return true;
    }
    private boolean ispal(String s,int x,int r)
    {
        while(x<r)
        {
           if(s.charAt(x)!=s.charAt(r))
           {
            return false;
           } 
           x++;
           r--;
        }
        return true;
    }
}
