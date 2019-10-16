package Sort;

public class QuickSort {
    /*快速排序

    * 该算法在数组中选择一个元素称为主元，
    * 并将数组分为两部分，
    * 使得前半部的元素都小于或等于主元，
    * 后半部的元素都大于主元
    * 对第一部分递归地应用快速排序算法，
    * 然后对第二部分递归地应用快速排序算法。
    * */
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    private static  void quickSort(int[] arr,int first,int last){
        if(last>first){
            int pivotIndex = partition(arr,first,last);
            quickSort(arr,0,pivotIndex-1);
            quickSort(arr,pivotIndex+1,last);
        }
    }

    private static  int partition(int[] arr,int first,int last){
        int pivot = arr[first];//以数组第一个元素作为主元
        int low = first+1;
        int high = last;

        while(high>low){
            while(low<=high && arr[low]<=pivot)
                low++;//从左往右找比主元大的值,找到后跳出循环
            while(high>=low && arr[high]>=pivot)
                high--;//从右往左找比主元小的值,找到后跳出循环

            if(high>low){
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
                //交换上面找到的两个值
            }
        }//循环结束左面是比主元小的值,右面是比主元大的值;

        while(high>first && arr[high]>pivot)
            high--;
        /*此时high==low,这个循环的目的主要是找到主元的正确插入位置*/
        if (pivot>arr[high]){
            arr[first] = arr[high];
            arr[high] = pivot;
            //交换值
            return high;//返回主元已经正确插入的位置
        }else return first;//出错的情况下，重新递归快速排序
    }

    public static void main(String[] args) {
        int[] arr = {13,19,9,5,12,8,7,4,21,2,6,11};
        quickSort(arr);
        for (int num:arr){
            System.out.println(num);
        }
    }
}
