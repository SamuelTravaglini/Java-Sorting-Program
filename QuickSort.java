/* Quick Sort Algorithm Class
** Based on algorithm from Curtin University COMP1001 Lecture
** Author: Samuel Travaglini
** Time complexity: O(logN)
*/

public class QuickSort {
  /*
    // quickSort - front-end for kick-starting the recursive algorithm
    public void quickSort(int[] sortArray)
    {
        quickSortRecurse(0, nElems-1);
    }//end of quickSort()
    
    private void quickSortRecurse(int leftId, int rightId)
    {
        if (rightId > leftId)
        {
            int pivotId = (leftId+rightId)/2;
            int newPivotId = doPartitioning(leftId, rightId, pivotId);
            
            quickSortRecurse(leftId, newPivotId-1)
            quickSortRecurse(newPivotId+1, rightId)
        }//endIf
        
    }//end of quickSortRecurse()
    private int doPartitioning(int leftId, int rightId, int pivotId)
    {
        int pivotVal = sortArray[pivotId];
        sortArray[pivotId] = sortArray[rightId];
        sortArray[rightId] = pivotVal;
        
        int currId = leftId;
        
        for (int ii = leftId; ii<rightId-1; ii++)
        {
            if (sortArray[ii] < pivotVal) then
            {
                int temp = sortArray[ii];
                sortArray[ii] = sortArray[currId];
                sortArray[currId] = temp;
                currId = currId =1;
            }//endIf
        }//endFor
        
        int newPivotId = currId;
        sortArray[rightId] = sortArray[newPivotId];
        sortArray[newPivotId] = pivotVal;
        
        return pivotVal;
    }//end of doPartitioning
    */
}
