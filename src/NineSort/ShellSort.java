package NineSort;

public class ShellSort {
    //希尔排序
    public static void shellSort(int[]arr){
        if (arr.length>=2){
            int d = arr.length;//增量
            while(d!=1){
                d = d/2;
                for (int i = 0;i < d;i++){
                   /* 增量相当于把数组分成d个子数组，
                   对子数组进行插入排序，当d=1时，
                   总的数组已经有序*/
                    for (int j = i+d;j<arr.length;j+=d){
                        int temp = arr[j];
                        int k;
                        for (k = j-d;k>=0&&arr[k]>temp;k-=d)
                            arr[k+d] = arr[k];
                        arr[k+d] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        shellSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
    }
}
