public class SelectionSort {

    // selection sort
    public void sSorting(int[] sortArray)
    {
       int temp;

        for (int ii=0; ii< (sortArray.length); ii++)
        {
            int minID = ii;

            for (int jj=ii+1; jj<(sortArray.length); jj++)
            {
                if (sortArray[jj] < sortArray[minID])
                    minID = jj;
            }

          temp = sortArray[minID];
          sortArray[minID] = sortArray[ii];
          sortArray[ii] = temp;
        }

    }// end of selectionSort()


    void printSortedArray(int[] sortArray) {
        for (int i=0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
    }

}
