class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols= new ArrayList<>();
        
        for(int i =0 ; i<matrix.length;i++)
        {
            for(int j= 0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        int idx=0;
        while(idx<rows.size() && idx<cols.size())
        {
            for(int i=0 ;i<matrix.length;i++)
            {
               matrix[i][cols.get(idx)]=0;
            }
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[rows.get(idx)][i]=0;
            }
            idx++;
        }
        
    }
}