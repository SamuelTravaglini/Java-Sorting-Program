/* Quick Sort Algorithm Class
** Based on algorithm from Curtin University COMP1001 Lecture
** Author: Samuel Travaglini
** Time complexity: O(NlogN)
*/

public class MergeSort {
    
    public void mergeSort(int[] sortArray, int leftId, int rightId)
    { 
        if (leftId < rightId)
        {
            int midId = (leftId+rightId)/2;
            
            mergeSort(sortArray, leftId, midId);
            
            mergeSort(sortArray, midId+1, rightId);

            merge(sortArray, leftId, midId, rightId);
        }//endIf
        return;
    }// end of mergeSort()
    
    public void merge(int[] sortArray, int leftId, int midId, int rightId)
    {
        int[] leftArray = new int[midId-leftId+1];
        int[] rightArray = new int[rightId-leftId];
        int la = leftArray.length;
        int ra = rightArray.length;
        int leftIndex = 0;
        int rightIndex = 0;

        //Copy sortArray into temporary arrays
        for (int yy=0; yy < la; yy++) {
            leftArray[yy] = sortArray[leftId + yy];
        }

        for (int yy=0; yy < ra; yy++) {
            rightArray[yy] = sortArray[midId + yy + 1];
        }

        for (int yy = leftId; yy < rightId+1; yy++) {
            if (leftIndex < la && rightIndex < ra) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    sortArray[yy] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    sortArray[yy] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < la) {
                sortArray[yy] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < ra) {
                sortArray[yy] = rightArray[rightIndex];
                rightIndex++;
            }
        }

        /*
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

        System.out.println(ii);
        System.out.println(jj);
        System.out.println(leftId);
        System.out.println(midId);
        System.out.println(rightId);

        for (int yy=ii; yy<midId; yy++) {
            System.out.println("1: "+yy);
            tempArray[kk] = sortArray[yy];
            kk = kk+1;
        }

        for (int yy=jj; yy<rightId; yy++) {
            System.out.println("2: "+yy);
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
