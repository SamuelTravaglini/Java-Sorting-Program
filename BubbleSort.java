/* Bubble Sort Algorithm
** Based on algorithm from Curtin University COMP1002 Lecture
** Author: Samuel Travaglini
** Time complexity: O(N^2)
*/
public class BubbleSort{

    public void bSorting(int[] sortArray) {
        int n = sortArray.length;
        int temp, ii;
        int pass = 0;
        boolean sorted;
        
        do {
            sorted = true;
            for(ii=0; ii < (n-1-pass); ii++) {
                if ( sortArray[ii] > sortArray[ii+1]) {
                    temp = sortArray[ii];
                    sortArray[ii] = sortArray[ii+1];
                    sortArray[ii+1] = temp;
                    sorted = false;
                }//end if
            }//end for
            pass= pass+1;
        }
        while(!sorted); //end while

    }//end bSorting()

}
