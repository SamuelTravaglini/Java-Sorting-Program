/* Selection Sort Algorithm
** Based on algorithm from Curtin University COMP1002 Lecture
** Author: Samuel Travaglini
** Time complexity: O(N^2)
*/
public class SelectionSort {

    // selection sort
    public void sSorting(int[] sortArray) {
       int temp;

        for (int ii=0; ii< (sortArray.length); ii++) {
            int minID = ii;

            for (int jj=ii+1; jj<(sortArray.length); jj++) {
                if (sortArray[jj] < sortArray[minID])
                    minID = jj;
            }//end for

          temp = sortArray[minID];
          sortArray[minID] = sortArray[ii];
          sortArray[ii] = temp;
        }//end for

    }// end of selectionSort()

}
