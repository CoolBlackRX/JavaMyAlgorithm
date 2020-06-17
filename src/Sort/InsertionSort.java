package Sort;

public class InsertionSort {

    //插入排序
    /*
     * 重复的将新元素插入到一个排好序的线性表中，直到整个线性表排好序
     *
     * */
    public static void insertSort(int[] arr) {
        if (arr.length >= 2) {
            //控制排序数组长度大于等于2
            int currentElement;
            for (int i = 1; i < arr.length; i++) {
                currentElement = arr[i];
                //取得当前要插入的元素
                int k;
                for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {
                    //在有序数组中找到要插入的位置，把大的数往后移
                    arr[k + 1] = arr[k];
                }
                arr[k + 1] = currentElement;
                //插入
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        insertSort(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }

}
