public class MergeSort {
    
    public void mergeSort(int[] sortArray, int leftId, int rightId)
    { 
        if (leftId < rightId)
        {
            int midId = (leftId+rightId)/2;
            
            mergeSort(sortArray, leftId, midId);
            
            mergeSort(sortArray, midId+1, rightId);
 
            merge(sortArray, leftId, midId+1, rightId);
        }//endIf
        
    }// end of mergeSort()
    
    public void merge(int[] sortArray, int leftId, int midId, int rightId)
    {
        int[] tempArray = new int[rightId-leftId+1];
        int ii=leftId;
        int jj = midId-1;
        int kk = 0;
        //int n = rightId - ii+1;

        System.out.println()
        while ((ii <= midId) && (jj <= rightId)) {
            if (sortArray[ii] <= sortArray[jj]) {
                tempArray[kk] = sortArray[ii];
                ii = ii+1;
            }
            else {
                tempArray[kk] = sortArray[jj];
                jj = jj+1;
            }
            kk = kk+1;
        }

        for (int yy=ii; yy<midId; yy++) {
            tempArray[kk] = sortArray[yy];
            kk = kk+1;
        }

        for (int yy=jj; yy<rightId; yy++) {
            tempArray[kk] = sortArray[yy];
            kk = kk+1;
        }

        for (kk=leftId; kk < rightId; kk++) {
            sortArray[kk] = tempArray[kk-leftId];
        }
        
        /*
        //Code based on textbook 

        //Start while
        while ((left<=jj) && (midId <= rightId))
        {
            if (sortArray[left] < sortArray[midId])
            {
                tempArr[kk++] = sortArray[left++];
            }
            else
            {
                tempArr[kk++] = sortArray[midId++];
            }//endIf    
        }//endWhile
       
        while (left <= jj)
              tempArr[kk++] = sortArray[left++];

        while (midId <= rightId)
              tempArr[kk++]= sortArray[midId++];

        for (kk=0; kk<n; kk++)
            sortArray[ii+kk] = tempArr[kk]; 
       
        // lecture code not working. ArrayOutOfBounds error  
        /*
        for (ii=ii; ii <= midId; ii++)
        {
            tempArr[kk]= sortArray[jj];
            kk=kk+1;
        }//endFor
        
        for (jj=jj; jj <= rightId; jj++)
        {
            tempArr[kk] = sortArray[jj];
            kk=kk+1;
        }//endFor
        
        for (kk=leftId; kk <= rightId; kk++)
        {
            sortArray[kk] = tempArr[kk-leftId];
        }//endFor
        */
    } //end of merge()

    void printSortedArray(int[] sortArray) {
        for (int i=0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
    }
}
