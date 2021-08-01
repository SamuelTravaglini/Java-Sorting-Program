/*  Sorting Program
** Author: Samuel Travaglini
*/

import java.util.*;

public class SortApp {

    //class SortApp
    public static void main(String[] args) {
        int size;
        int count=1;
        
        SortApp sort =new SortApp();
        BubbleSort bub = new BubbleSort();
        InsertionSort ins = new InsertionSort();
        SelectionSort ses = new SelectionSort();
        MergeSort mge = new MergeSort();
        QuickSort quik = new QuickSort();

        int[] sortArray, unSortArray;
        
        try {
            //Get user input values for size and variables of array
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of Array:");
            size = sc.nextInt();
            sortArray = new int[size];
            unSortArray = new int[size];
            
            //Enter array values
            for (int ii=0; ii< size; ii++) { 
                System.out.println("Enter Integer "+ count +":");
                sortArray[ii] = sc.nextInt();
                count = count+1;
            }//end for
            
            sc.close();

            //Copy unsorted array to another to keep unsorted
            for (int ii=0; ii< size; ii++) { 
                unSortArray[ii] = sortArray[ii];
            }//end for

            //Call bubble sort class
            System.out.println("\n*** Bubble Sort ***");     
            System.out.println("Before Bubble Sort:");
            sort.printSortedArray(sortArray);
            bub.bSorting(sortArray);
            System.out.println("After Bubble Sort:");
            sort.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            //Call insertion sort class
            System.out.println("\n*** Insertion Sort ***"); 
            System.out.println("Before Insertion Sort:");
            sort.printSortedArray(sortArray);
            ins.iSorting(sortArray);
            System.out.println("After Insertion Sort:");
            sort.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            //Call selection sort class
            System.out.println("\n*** Selection Sort ***"); 
            System.out.println("Before Selection Sort:");
            sort.printSortedArray(sortArray);
            ses.sSorting(sortArray);
            System.out.println("After Selection Sort:");
            sort.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            //Call merge sort class
            System.out.println("\n*** Merge Sort ***"); 
            System.out.println("Before Merge Sort:");
            sort.printSortedArray(sortArray);
            mge.mergeSort(sortArray, 0, sortArray.length-1);
            System.out.println("After Merge Sort:");
            sort.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            //Call quick sort class
            System.out.println("\n*** Quick Sort ***"); 
            System.out.println("Before Quick Sort:");
            sort.printSortedArray(sortArray);
            quik.quickSort(sortArray, 0, sortArray.length-1);
            System.out.println("After Quick Sort:");
            sort.printSortedArray(sortArray);
       }//end Try
       catch(Exception e)
       {
           System.out.println("Error:"+ e.getMessage());
       }//end Catch
       finally
       {
           System.exit(0);
       }//end Finally
     
   }//end of main


   public int[] resetArray(int[] sortArray, int[] unSortArray) {  
       for (int ii=0; ii< sortArray.length; ii++) { 
           sortArray[ii] = unSortArray[ii];
       }//end for
       return sortArray;
   }

   public void printSortedArray(int[] sortArray) {
    for (int i=0; i < sortArray.length; i++) {
        System.out.print(sortArray[i] + " ");
    }
    System.out.println();
   }//end for

}//end of class


