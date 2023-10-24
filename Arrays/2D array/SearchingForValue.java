
// take a matrix as input from user. search for a given number x and print the indices at twhich it 
// occur

import java.util.*;
public class SearchingForValue
{
     public static void main(String ags[])
     {
          Scanner obj=new Scanner(System.in);
          System.out.print("Enter the number of rows: ");
          int rows=obj.nextInt();
          System.out.print("Enter the number of cols: ");
          int cols=obj.nextInt();
          int a[][]=new int[rows][cols];
          //inputting of array
          for(int i=0;i<rows;i++)
          {
               for(int j=0;j<cols;j++)
               {
                    a[i][j]=obj.nextInt();
               }
          }
          System.out.print("Enter the number you want ot find: ");
          int num=obj.nextInt();
          obj.close();
          System.out.println("Index are: ");
          //searching
          for(int i=0;i<rows;i++)
          {
               for(int j=0;j<cols;j++)
               {
                    if(a[i][j]==num)
                    {
                         System.out.print(i+"  "+j);
                    }
               }
               System.out.println();
          }

     }
}