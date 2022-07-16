import java.io.*;
import java.util.*;
class lower_upper_traingular_matrix
    {
        public void main()
        {
            int i ,j;
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int arr[][] = new int [m][m];
            
            for(i = 0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            //traingle
            for(i = 0;i<m;i++)
            {
                for(j = 0;j<=i;j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
            
    
            //traingle
            for(i = 0;i<m;i++)
            {
                for(j=i;j<m;j++)           
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
        }
    }
 