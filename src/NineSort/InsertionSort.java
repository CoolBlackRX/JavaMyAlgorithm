package NineSort;

public class InsertionSort {
    //插入排序
    public static void insertionSort(int[] arr){
       if (arr.length>=2){
           for (int i =1;i<arr.length;i++){
               int temp = arr[i];//获取插入元素
               int k ;
               for (k = i-1;k>=0&&arr[k]>temp;k--)
                   arr[k+1]=arr[k];//把大的数往后移
               arr[k+1] = temp;
           }
       }
    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        insertionSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
    }
}
