/* Quick Sort Algorithm Class
** Based on algorithm from Curtin University COMP1001 Lecture
** Author: Samuel Travaglini
*/
import java.util.*;
public class SortApp {

    //class SortApp
    public static void main(String[] args)
    {
        int size;
        int count=1;
        
        SortApp sort =new SortApp();
        BubbleSort bub = new BubbleSort();
        InsertionSort ins = new InsertionSort();
        SelectionSort ses = new SelectionSort();
        MergeSort mge = new MergeSort();
        //QuickSort quik = new QuickSort();

        int[] sortArray, unSortArray;
        
        try {
            //Get user input values for size and variables of array
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of Array:");
            size = sc.nextInt();
            sortArray = new int[size];
            unSortArray = new int[size];
            
            for (int ii=0; ii< size; ii++) { 
                System.out.println("Enter Integer "+ count +":");
                sortArray[ii] = sc.nextInt();
                count = count+1;
            }
            
            sc.close();

            //Copy random number array to another to keep unsorted
            for (int ii=0; ii< size; ii++) { 
                unSortArray[ii] = sortArray[ii];
            }

            //Call bubble sort class
            System.out.println("*** Bubble Sort ***");     
            System.out.println("Before Bubble Sort:");
            bub.printSortedArray(sortArray);
            bub.bSorting(sortArray);
            System.out.println("After Bubble Sort:");
            bub.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            System.out.println("*** Insertion Sort ***"); 
            System.out.println("Before Insertion Sort:");
            ins.printSortedArray(sortArray);
            ins.iSorting(sortArray);
            System.out.println("After Insertion Sort:");
            ins.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            System.out.println("*** Selection Sort ***"); 
            System.out.println("Before Selection Sort:");
            ses.printSortedArray(sortArray);
            ses.sSorting(sortArray);
            System.out.println("After Selection Sort:");
            ses.printSortedArray(sortArray);

            //Reset array
            sort.resetArray(sortArray, unSortArray);

            System.out.println("*** Merge Sort ***"); 
            System.out.println("Before Merge Sort:");
            mge.printSortedArray(sortArray);;
            mge.mergeSort(sortArray, 0, sortArray.length-1);
            System.out.println("After Merge Sort:");
            mge.printSortedArray(sortArray);

            /*System.out.println("*** Quick Sort ***"); 
            System.out.println("Before Quick Sort:");
            sortObject.display();
            sortObject.quickSort();
            System.out.println("After Quick Sort:");
            sortObject.display(); */
        
    
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
       }

       return sortArray;
   }

}//end of class


