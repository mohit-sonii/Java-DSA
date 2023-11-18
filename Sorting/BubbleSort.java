package Sorting; //ignore it

//bubble sorting in java keypoints
//It compare every adjacent element in an array
// multiple exchange can take place in one pass
// if the element on the top is greater than the item immediately below it, they are exchanged

public class BubbleSort
{
     public static void main(String ags[])
     {
          int array[]={7,8,3,1,2};
          for(int i=0;i<array.length;i++)
          {
               for(int j=0;j<array.length-i-1;j++)
               {
                    if(array[j]>array[j+1])
                    {
                         int temp=array[j];
                         array[j]=array[j+1];
                         array[j+1]=temp;
                    }
               }
          }
          //printing
          for(int i=0;i<array.length;i++)
          {
               System.out.println(array[i]);
          }
     }
}