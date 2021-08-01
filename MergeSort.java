/* Merge Sort Algorithm
** Based on algorithm from Curtin University COMP1002 Lecture
** Author: Samuel Travaglini
** Time complexity: O(NlogN)
*/

public class MergeSort {
    
    public void mergeSort(int[] sortArray, int leftId, int rightId)
    { 
        if (leftId < rightId)
        {
            //Find middle
            int midId = (leftId+rightId)/2;

            //Recursively split the array
            mergeSort(sortArray, leftId, midId);
            mergeSort(sortArray, midId+1, rightId);

            //Merge havles and sort
            merge(sortArray, leftId, midId, rightId);
        }//endIf
    }// end of mergeSort()
    
    public void merge(int[] sortArray, int leftId, int midId, int rightId)
    {
        //Initialise temp array to copy variables
        int[] tempArray = new int[rightId-leftId+1];
        int ii = leftId;
        int jj = midId+1;
        int kk = 0;

        //Sort array
        while ((ii <= midId) && (jj <= rightId)) {
            if (sortArray[ii] <= sortArray[jj]) {
                tempArray[kk] = sortArray[ii];
                ii ++;
            }
            else {
                tempArray[kk] = sortArray[jj];
                jj ++;
            }
            kk = kk+1;
        }

        //Flush remainder from left
        for (int yy=ii; yy<=midId; yy++) {
            tempArray[kk] = sortArray[yy];
            kk ++;
        }

        //Flush remainder from right
        for (int yy=jj; yy<=rightId; yy++) {
            tempArray[kk] = sortArray[yy];
            kk = kk+1;
        }

        //Copy sorted array back to actual array
        for (kk=leftId; kk <=rightId; kk++) {
            sortArray[kk] = tempArray[kk-leftId];
        }
        
    } //end of merge()

    void printSortedArray(int[] sortArray) {
        for (int i=0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
    }
}
