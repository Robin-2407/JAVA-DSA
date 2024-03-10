//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = r-1;
        int startCol = 0;
        int endCol = c-1;
        
        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++){
                result.add(matrix[startRow][j]);
            }
            startRow++;
            
            
            
            //right
            for(int i=startRow; i<=endRow; i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;
            
            
            
            //bottom
            if(startRow <= endRow){
                for(int j=endCol; j>=startCol; j--){
                     result.add(matrix[endRow][j]);
                }
                endRow--;
            }

            
            
            
            //right
            if(startCol <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    result.add(matrix[i][startCol]);
                }
                
            }
            startCol++;
        }
        return result;
    }
}
