public class twoDArray
{
        public static void main(String agrs[])
    {
            int nums[][]  = { {2, 4, 1, 3},
                          {3, 6, 1, 2},
                          { 4, 7, 1, 8} };
        
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col<nums[0].length; col++)
                System.out.print( nums[row][col]);
            System.out.println();
            }
        
       
    
    } 
    public static int[] sumRows(int[][] nums){
        int [] total = {0, 0, 0};
    
        for (int i = 0; i< nums.length; i++) {
            for(int j = 0; j< nums[0].length; j++){
                total[i] += nums[i][j];
            }
        }
        System.out.println("\n sum of rows: ");
        for (int i = 0; i < total.length; i++){
            System.out.print(total[i] + " ");
        }
        return total;
    } 
    public static int[] sumCols(int [][] nums){
        int [] total = {0, 0, 0, 0};
    
        for (int i = 0; i< nums.length; i++) {
            for(int j = 0; j< nums[0].length; j++){
                total[j] += nums[i][j];
            }
        }
        System.out.println("\n sum of columns: ");
        for (int i = 0; i < total.length; i++){
            System.out.print(total[i] + " ");
        }
        return total;
    }
    public static int[] largestInRows(int[][] nums){
        int [] largest = {0, 0, 0};
        
        for(int i = 0; i < nums.length; i++){
            int largNum = nums[i][0];
            for (int j = 0; j< nums[0].length; j++){
                if(nums[i][j] > largNum){
                    largNum = nums[i][j];
                }
            }
            largest[i] = largNum;
        }
        
        System.out.println("\n largest in rows: ");
        for (int i = 0; i < largest.length; i++){
            System.out.print(largest[i] + " ");
        }
        return largest; 
    }
    public static int[] largestInCols(int[][] nums){
        int[] largest = {0,0,0,0};
        
        for (int i = 0; i < nums[0].length; i++){
            int largNum = nums[0][i];
            for(int j = 1; j < nums.length; j++){
                if(nums[j][i] > largNum){
                    largNum = nums[j][i];
                }
            }
            largest[i] = largNum; 
        }
        System.out.println("\nlargest in columns: ");
        
        for(int i = 0; i < largest.length; i++){
            System.out.print(largest[i] + " ");
        }
        
        return largest;
    }
}

     //totalRows(nums);
        //totalCols(nums);
        //largestinRows(nums);
        //largestinCols(num);