class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean fcol=false;
        boolean frow=false;
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]==0) 
            {fcol=true; 
            break;}
        }
        for(int i=0;i<col;i++)
        {
            if(matrix[0][i]==0) 
            {frow=true;
            break;}
        }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(matrix[i][j]==0){
                matrix[0][j]=0;
                matrix[i][0]=0;}
            }
        }
        for(int i=1;i<row;i++)
        {
            if(matrix[i][0]==0){
             //Arrays.fill(matrix[i],0);
             for(int j=1;j<col;j++)
               { matrix[i][j]=0;
               }
            }
        }
        for(int j=1;j<col;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=1;i<row;i++)
                {matrix[i][j]=0;}
            }
        
        }
        if(fcol) 
        {
            for(int i=0;i<row;i++)
            {matrix[i][0]=0;}
        }
        if(frow)
         {
            //Arrays.fill(matrix[0],0);
            for(int i=0;i<col;i++)
            {matrix[0][i]=0;}
         }
        
    }
}
