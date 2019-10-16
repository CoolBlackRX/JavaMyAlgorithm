package Sort;

public class MergeSort {
    /*归并排序

    * 不断地一分为二划分成一个元素组成序列，
    * 一个元素组成的序列也就是有序序列，
    * 然后再将相邻的两个有序序列合并，最终待排序列变成一个有序序列。
    *归并算法采用了分治+递归的思想，先递归分解数列，然后再合并数列。
    */
    public static int[] mergeSort(int[] arr){
        return  mergeSort(arr,0,arr.length-1);
    }

    private static int[] mergeSort(int[] arr,int first,int last){
        if(first == last)
            return new int[]{arr[first]};
        //递归出口，分解成长度只有1的数组
        int mid = (last-first)/2+ first ;
        int[] leftArr = mergeSort(arr, first, mid);
        //左有序数组，递归实现分解
        int[] rightArr = mergeSort(arr, mid+1, last);
        //右有序数组，递归实现分解
        int[] newArr = new int[leftArr.length+rightArr.length];
        //合并成新的有序数组

        int i = 0;
        int j = 0;
        int m = 0;
        //数组的下标

        while(i<leftArr.length && j<rightArr.length){
            newArr[m++] = leftArr[i]<rightArr[j]? leftArr[i++]:rightArr[j++];
            //合并到新数组
        }
        while (i<leftArr.length)
            newArr[m++] = leftArr[i++];
        /*rightArr数组已经全部填入到newaArr数组,
        *把剩余的leftArr数组元素填入到newArr数组*/
        while (j<rightArr.length)
            newArr[m++] = rightArr[j++];
        /*leftArr数组已经全部填入到newaArr数组,
         *把剩余的rightArr数组元素填入到newArr数组*/

        return newArr;
        //返回合并排好的有序数组

    }

    public static void main(String[] args) {
        int[] arr = {13,19,9,5,12,8,7,4,21,2,6,11};
        for (int num: mergeSort(arr)){
            System.out.print(num + " ");
        }
    }
}
