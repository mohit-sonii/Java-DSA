package Sorting;
//Selection sorting in java

//in this we have to find the smallest number from the whole list and put it in the first place
//then we find the second smallest number and put it in the 2nd place.
//first we  will consider that the first element is the smallest one then we store it in the variable
//and we will adjacently check whether smaller than preious number is available or not. If yes,
//then we do swapping of previous and new element and if not, that means the selected element is the 
//smallest in whole

public class SelectionSort {

     public static void main(String sag[]) {
          int array[] = { 7, 8, 3, 1, 2 };
          for (int i = 0; i < array.length; i++) {
               int smallest = i;
               for (int j = i + 1; j < array.length; j++)

               {
                    if (array[smallest] > array[j]) {
                         smallest = j;
                    }
               }
               int temp = array[smallest];
               array[smallest] = array[i];
               array[i] = temp;

          }
          for (int i = 0; i < array.length; i++) {
               System.out.println(array[i]);
          }
     }
}
