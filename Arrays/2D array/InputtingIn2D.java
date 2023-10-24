
//Inputting in 2D array

import java.util.*;
public class InputtingIn2D
{
     public static void main(String gags[])
     {
          Scanner obj=new Scanner(System.in);
          System.out.print("Enter the rows: ");
          int rows=obj.nextInt();
          System.out.print("Enter the columns: ");
          int col=obj.nextInt();
          int a[][]=new int[rows][col];
          for(int i=0;i<rows;i++)
          {
               for(int j=0;j<col;j++)
               {
                    a[i][j]=obj.nextInt();
               }
          }
          obj.close(); //not necessary 
          //for printing
          for(int i=0;i<rows;i++)
          {
               for(int j=0;j<col;j++)
               {
                    System.out.print(a[i][j]+"  ");
               }
               System.out.println();
          }
     }
}
