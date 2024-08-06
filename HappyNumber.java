class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        int s=0,c=0,rev=1;
        int limit = 100;
        
        while (s != 1 && limit > 0) {
            s = 0;
        for(int i=n;i!=0;i=i/10) {
            int r=i%10;
            s=s+(r*r);
            rev=rev*10+r;
        }
        n = s; 
            limit--; 
        }
        if(s==1) return true;
        else return false;

    }
}
