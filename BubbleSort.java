public class BubbleSort{

    public int[] bSorting(int[] sortArray) {
        int n = sortArray.length;
        int temp, ii;
        int pass = 0;
        boolean sorted;
        
        do
        {
            sorted = true;
            for(ii=0; ii < (n-1-pass); ii++)
            {
                if ( sortArray[ii] > sortArray[ii+1])
                {
                    temp = sortArray[ii];
                    sortArray[ii] = sortArray[ii+1];
                    sortArray[ii+1] = temp;
                    sorted = false;
                }
            }
            pass= pass+1;
        }
        while(!sorted);

        return sortArray;
    }

    void printSortedArray(int[] sortArray) {
        for (int ii=0; ii < sortArray.length; ii++) {
            System.out.print(sortArray[ii] + " ");
        }
        System.out.println();
    }
}
