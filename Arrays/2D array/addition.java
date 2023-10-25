
// addition of 2 D array elements

import java.util.*;
public class addition
{
     public static void main(String ags[])
     {
          Scanner obj=new Scanner(System.in);
          System.out.print("Enter number of rows for 1st matrix: ");
          int row1=obj.nextInt();
          System.out.print("Enter number of cols for 1st matrix: ");
          int col1=obj.nextInt();
          int a[][]=new int[row1][col1];
          //inputting of first marix
          for(int i=0;i<row1;i++)
          {
               for(int j=0;j<col1;j++)
               {
                    a[i][j]=obj.nextInt();
               }
          }
          //for 2nd matrix
          System.out.println("@nd matrix elements");
          int b[][]=new int[row1][col1];
          //inputting of first marix
          for(int i=0;i<row1;i++)
          {
               for(int j=0;j<col1;j++)
               {
                    b[i][j]=obj.nextInt();
               }
          }
          obj.close();
          //printint the sum 
          int c[][]=new int[row1][col1];
          for(int i=0;i<row1;i++)
          {
               for(int j=0;j<col1;j++)
               {
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+" ");
               }
               System.out.println();
          }
     }
}