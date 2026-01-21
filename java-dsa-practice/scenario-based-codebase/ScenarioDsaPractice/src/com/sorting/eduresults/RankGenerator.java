package com.sorting.eduresults;
class RankGenerator {

    // Merge Sort
    public static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(Student[] arr, int left, int mid, int right) {
        Student temp[] = new Student[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i < mid+1 && j <= right) {
            if (arr[i].score >= arr[j].score) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < j)
           temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];
        
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }
}
