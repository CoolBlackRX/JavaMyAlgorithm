package NineSort;

public class BubbleSort {
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for (int i = 1;i<arr.length;i++){
            for (int j = 0;j<arr.length-i;j++){
                if (arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        bubbleSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
    }
}
