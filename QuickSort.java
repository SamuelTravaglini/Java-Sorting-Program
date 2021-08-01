/* Quick Sort Algorithm
** Based on algorithm from Curtin University COMP1002 Lecture
** Author: Samuel Travaglini
** Time complexity: O(NlogN)
*/

public class QuickSort {

    public void quickSort(int[] sortArray, int leftId, int rightId) {
        if (rightId > leftId)
        {
            //pivot strategy, middle element
            int pivotId = (leftId+rightId)/2;
            int newPivotId = doPartitioning(sortArray, leftId, rightId, pivotId);

            //Recurse sort left partition
            quickSort(sortArray, leftId, newPivotId-1);
            //Recurse sort right partition
            quickSort(sortArray, newPivotId+1, rightId);
        }//endIf
    }//end of quickSortRecurse()

    private int doPartitioning(int[] sortArray, int leftId, int rightId, int pivotId)
    {
        int pivotVal = sortArray[pivotId];
        sortArray[pivotId] = sortArray[rightId];
        sortArray[rightId] = pivotVal;

        int currId = leftId;
        
        /* Find all values that are smaller than the pivot and transfer
        ** them to the left hand side of the array.
         */
        for (int ii = leftId; ii <= (rightId-1); ii++) {
            if (sortArray[ii] < pivotVal) {
                int temp = sortArray[ii];
                sortArray[ii] = sortArray[currId];
                sortArray[currId] = temp;
                currId ++;
            }//endIf
        }//endFor

        //Put pivot value into place
        int newPivotId = currId;
        sortArray[rightId] = sortArray[newPivotId];
        sortArray[newPivotId] = pivotVal;
    
        return newPivotId;
    }//end of doPartitioning

}
