package Sort;

public class ShellSort {
    /*先取一个正整数d1<n，
    把所有序号相隔d1的数组元素放一组，
    组内进行直接插入排序；然后取d2<d1，
    重复上述分组和排序操作；
    直至di=1，即所有记录放进一个组中排序为止。
    */
    public static void shellSort(int[] arr){
        int d = arr.length;//增量
        while(d!=1){
            d = d/2;
            for (int i =0;i<d;i++){
                for (int j = i+d;j<arr.length;j = j+d){
                    int temp = arr[j];
                    int k ;
                    for (k = j-d;k>=0&&arr[k]>temp;k = k-d){
                        arr[k+d] = arr[k];
                    }
                    arr[k+d] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        shellSort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
