public class InsertionSort {
    
    // insertion sort
    public void iSorting(int[] sortArray)
    {
        int temp;
        int n = sortArray.length;

        for (int jj=1; jj < n; jj++)
        {
            int ii=jj;
            temp = sortArray[ii];

            while ((ii > 0) && (sortArray[ii-1] > temp))
            {
                sortArray[ii] = sortArray[ii-1]; 
                ii=ii-1;
            }//endWhile
           sortArray[ii] = temp;
        }//endFor

    }// end of insertionSort()

    
    void printSortedArray(int[] sortArray) {
        for (int i=0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
    }
    
}
