package Sort;

import java.util.Scanner;

public class SelectSort {
    /*选择排序

    * 每趟从待排序的记录中选出关键字最小的记录，
    * 顺序放在已排序的记录序列末尾，
    * 直到全部排序结束为止。
    * */
    public static void selectSort(int[] arr){
        //每次从左至右扫描序列，记下最小值的位置。
        int temp;
        int change;
        for (int i = 0;i<arr.length;i++){
            temp = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[temp]>arr[j]){
                    temp = j;//记录最小位置
                }
            }
            change = arr[i];
            arr[i] = arr[temp];
            arr[temp] = change;
        }
    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        selectSort(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
