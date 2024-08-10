class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    int r=matrix.length;
    int c=matrix[0].length;
    int row=0;
    int col=-1;
    int d=1;
    List<Integer> list=new ArrayList<>();
    while(r>0 && c>0)
    {
        for(int i=0;i<c;i++)
    {
        col=col+d;
        list.add(matrix[row][col]);
    }
    r--;
    for(int i=0;i<r;i++)
    {
        row=row+d;
        list.add(matrix[row][col]);
    }
    c--;
     d=d*(-1);
    }
    return list;
    }

}
