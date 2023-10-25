
//transpose of a 2d matrix

import java.util.*;
public class transpose
{
     public static void main(String ags[])
     {
          Scanner obj=new Scanner(System.in);
          System.out.print("Enter the number of rows: ");
          int rows=obj.nextInt();
          System.out.print("Enter the number of cols: ");
          int col=obj.nextInt();
          int a[][]=new int[rows][col];
          //inputting
          for(int i=0;i<rows;i++)
          {
               for(int j=0;j<col;j++)
               {
                    a[i][j]=obj.nextInt();
               }
          }
          System.out.println("Matrix representation is: ");
          //printing
          for(int i=0;i<rows;i++)
          {
               for(int j=0;j<col;j++)
               {
                    System.out.print(a[i][j]+ " ");
               }
               System.out.println();
          }
          System.out.println("Transpose is");
          //transpose
          for(int i=0;i<col;i++)
          {
               for(int j=0;j<rows;j++)
               {
                    System.out.print(a[j][i]+ " ");
               }
               System.out.println();
          }
     }
}