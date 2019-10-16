package NineSort;

public class QuickSort {
    //快速排序
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    private static void quickSort(int[] arr,int first,int last){
        if (last>first){
            int piovtIndex = partition(arr,first,last);
            quickSort(arr,0,piovtIndex-1);
            quickSort(arr,piovtIndex+1,last);
        }
    }
    private static int partition(int[] arr,int first,int last){
        int piovt = arr[first];//第一个元素作为主元
        int low = first+1;
        int high = last;

        while (low<high){
            while (low<=high && arr[low]<=piovt)
                low++;
            while (low<=high && arr[high]>=piovt)
                high--;

            if (low<high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        while (high>first && arr[high]>piovt)
            high--;

        if (piovt>arr[high]){
            arr[first] = arr[high];
            arr[high] = piovt;
            return high;
        }else return first;
    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        quickSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
    }
}
