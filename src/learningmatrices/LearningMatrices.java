package learningmatrices;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 22, 2013 8:28:47 AM 
 */
public class LearningMatrices {

    public static void main(String[] args)
    {
        int[] anArray = {5, 4, 3, 2, 1};
        int[][] matrix = { 
            {1, 2, 3, 4},
            {2, 4, 5, 7},
            {1, 4, 6, 8}
        };
        int I = 0;  // iterator
        int row = 0;
        int col = 0;
        
        System.out.println("anArray : ");
        for(I = 0; I <anArray.length; I++ )
        {
            System.out.print(anArray[I] + "\t");
        }
        
        System.out.println("\nmatrix : ");
        for(row = 0; row <3; row++)
        {
            for(col = 0; col < 4; col++)
            {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nmatrix * 2  : ");
        for(row = 0; row <3; row++)
        {
            for(col = 0; col < 4; col++)
            {
                int value = matrix[row][col] << 1;
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
