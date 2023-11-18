package Sorting;

//Insertion sorting in java
//In this a list is divided into two parts one is sorted and other one is unsorted.
//We suppose the first element is already sorted and we have to sort unsorted array. in this
//we start loop with +1 value considering that the first element is sorted but we still check 
//every unsorted element and compare to every sorted element. If unsorted element is smallest than
//the previous sorted element then every sorted element will be shift to the next position and it will
//coontinue to move until the element found its perfect place to rest. 


public class InsertionSort {
     public static void main(String ags[])
     {
          int array[]={7,8,3,1,2};
          for(int i=1;i<array.length;i++)
          {
               int current=array[i];
               int j=i-1;
               while(j>=0 && current<array[j])
               {
                    array[j+1]=array[j];
                    j--;
               }
               array[j+1]=current;

          }
          for(int i=0;i<array.length;i++)
          {
               System.out.println(array[i]);
          }
     }
     
}
