class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        recursion(list,0,0,"",n);
        return list;
    }
    public void recursion(List<String> list,int left,int right, String s, int n)
    {
        if(s.length()==n*2)
        {
            list.add(s);
            return;
        }
        if(left<n)
        {
            recursion(list,left+1,right,s+"(",n);
        }
        if(right<left)
        {
            recursion(list,left,right+1,s+")",n);
        }
    }
}
