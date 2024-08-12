class Solution {
    public String convertToTitle(int col) {
        StringBuilder str=new StringBuilder();
        while(col>0)
        {
            col--;
            char c=(char) (col%26+'A');
            col=col/26;
            str.append(c);
        }
        str.reverse();
        return str.toString();
    }
}
