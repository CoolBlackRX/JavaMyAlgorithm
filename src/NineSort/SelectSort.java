package NineSort;

public class SelectSort {
    //简单选择排序
    public static void selectSort(int[] arr){
        for (int i =0;i<arr.length;i++){
            int temp = i;//当前插入元素的位置
            for (int j = i+1;j<arr.length;j++){
                if (arr[temp]>arr[j])
                    temp = j;
            }//在后面无序的数组中选择最小的一个元素插入到前面有序数组的末尾
            int exchange = arr[i];
            arr[i] = arr[temp];
            arr[temp] = exchange;
        }
    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        selectSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
    }
}
