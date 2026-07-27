class Solution {
    public void nextPermutation(int[] A) {
        int pivot = -1;
        int n = A.length;
        //Step-1: For finding the pivot element
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                pivot = i;
                break;
            }
        }
        
        // if all the elem is reversed ex [5,4,3,2,1]
        if (pivot == -1) {
            int k = 0;
            int l = n - 1;
            while (k < l) {
                int t2 = A[k];
                A[k] = A[l];
                A[l] = t2;
                k++;
                l--;
            }
            return;
        }
        
        // step-2: next larger element
        for(int i=n-1;i>pivot;i--){
            if(A[i]>A[pivot]){
                int t3=A[i];
                A[i]=A[pivot];
                A[pivot]=t3;
                break;
            }

        }

        // reverse array from pivot+1,n-1;
        int i = pivot + 1;
        int j = n - 1;
        while (i < j) {
            int t = A[i];
            A[i] = A[j];
            A[j] = t;
            i++;
            j--;
        }

    }
}