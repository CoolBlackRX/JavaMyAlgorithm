package Sort;

public class HeapSort {
    /*其中每个结点的关键字都不大于其孩子结点的关键字，这样的堆称为小根堆。
        其中每个结点的关键字都不小于其孩子结点的关键字，这样的堆称为大根堆。
    对于n个元素的序列{R0, R1, ... , Rn}当且仅当满足下列关系之一时，称之为堆：
    Ri <= R2i+1 且 Ri <= R2i+2 (小根堆)
    Ri >= R2i+1 且 Ri >= R2i+2 (大根堆)
    i从0开始
    详细介绍：https://www.cnblogs.com/chengxiao/p/6129630.html
    */

    public static void heapSort(int[] arr){
        //先构建大顶堆
        for (int i = arr.length/2-1;i>=0;i--){
            //i =  arr.length/2-1第一个非叶子子节点，从右往左调整
            adjustHeap(arr,i,arr.length);
        }
        //交换堆顶元素与末尾元素并调整堆结构
        for (int i = arr.length-1;i>0;i--){
            swap(arr,0,i);//交换对顶元素和末尾元素
            adjustHeap(arr,0,i);
            System.out.println("第"+(arr.length-i)+"趟排序");
            for (int num:arr)
                System.out.print(num+" ");
            System.out.println();
        }
    }
    private static void adjustHeap(int[]arr,int parent,int length){
        int temp = arr[parent];//取出当前父节点
        int child = parent*2 +1;//先获得左孩子

        while (child<length){//子节点必须在堆上
            if (child + 1 < length && arr[child] < arr[child+1]) {
                child++;
            }//如果有右孩子节点，并且有孩子节点大于左孩子节点，选择右孩子节点
            if (temp>=arr[child])
                break;
            arr[parent] = arr[child];//把子节点的值赋给父节点
            //选取孩子节点的左子节点，继续向下筛选
            parent = child;
            child = parent*2+1;
        }
        arr[parent] = temp;

    }
    private static void swap(int[]arr,int a,int b){
        //交换数组元素
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 9, 2, 3, 1};
        heapSort(arr);
    }
}
