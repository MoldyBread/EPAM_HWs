package com.company.homework2;


public class Sorts {
    
    private void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }

    private int[] getMillionArray(){
        int[] res = new int[1000000];
        for (int i = 0; i < res.length; i++) {
            res[i]=1+(int)(Math.random()*100);
        }

        return res;
    }

    private void insertionSort(int arr[]) {
        for (int i=1; i<arr.length; ++i) {
            int k = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > k)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = k;
        }
    }

    void selectionSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min = i;

            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;


            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    private void mergeSort(int[] arr, int n) {
        if (n < 2)
            return;

        int[] l = new int[n / 2];
        int[] r = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            l[i] = arr[i];
        }

        for (int i = n / 2; i < n; i++) {
            r[i - n / 2] = arr[i];
        }
        mergeSort(l, n / 2);
        mergeSort(r, n - (n / 2));

        merge(arr, l, r, n / 2, n - n / 2);
    }

    private void merge(int[] arr, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] > r[j]) {
                arr[k++] = r[j++];

            }
            else {
                arr[k++] = l[i++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int base = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }

            while (array[j] > base) {
                j--;
            }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }




    public static void main(String[] args) {
        Sorts sorts = new Sorts();
        int[] array = sorts.getMillionArray();
        int[] tmp = array;

        Stopwatch stopwatch = new Stopwatch();

        sorts.bubbleSort(tmp);
        System.out.println(stopwatch.elapsedTime()); //Very slow

        tmp=array;
        stopwatch=new Stopwatch();
        sorts.insertionSort(tmp);
        System.out.println(stopwatch.elapsedTime()); //A bit better


        tmp=array;
        stopwatch=new Stopwatch();
        sorts.selectionSort(tmp);
        System.out.println(stopwatch.elapsedTime());

        tmp=array;
        stopwatch=new Stopwatch();
        sorts.mergeSort(tmp,tmp.length);
        System.out.println(stopwatch.elapsedTime()); //Much more quicker

        tmp=array;
        stopwatch=new Stopwatch();
        sorts.quickSort(tmp,0,tmp.length-1);
        System.out.println(stopwatch.elapsedTime());  //The quickest

    }

}
class Stopwatch {

    private final long START;
    public Stopwatch() {
        START = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - START) / 1000.0;
    }
}
