class Solution {
    void selectionSort(int[] a) {
        // code here
        int mini;
        for(int i=0;i<a.length;i++){
            mini=i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[mini]) mini=j;
            }
            int temp=a[mini];
            a[mini]=a[i];
            a[i]=temp;
        }

    }
}