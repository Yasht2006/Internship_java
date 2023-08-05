import java.util.Scanner;

class Pr1 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int size = inp.nextInt();

        int[][] arr = new int[size][size];

        int num = 1;
        int minRow = 0; 
        int maxRow = size - 1;
        int minCol = 0; 
        int maxCol = size - 1; 

        
        while (num <= size * size) 
        {
            for (int j = minCol; j <= maxCol; j++) 
            {
                arr[minRow][j] = num;
                num++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) 
            {
                arr[i][maxCol] = num;
                num++;
            }
            maxCol--;

            for (int j = maxCol; j >= minCol; j--) 
            {
                arr[maxRow][j] = num;
                num++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) 
            {
                arr[i][minCol] = num;
                num++;
            }        
            minCol++; 
        }

        for (int i= 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
