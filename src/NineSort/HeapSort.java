package NineSort;

public class HeapSort {
    //堆排序
    public static void heapSort(int[] arr){
        for (int i = arr.length/2-1;i>=0;i--){
            //构建大顶堆
            adjustHeap(arr,i,arr.length);
        }

        for (int i = arr.length-1;i>=0;i--){
            //交换堆顶元素和末尾元素，并调整堆
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }

    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void adjustHeap(int[]arr ,int parent,int length){
        int temp = arr[parent];//记录当前父节点
        int child = parent*2+1;
        while (child<length){
            if (child+1<length && arr[child+1]>arr[child])
                child++;
            //判断该父节点是否有右孩子节点，并找到两个孩子中较大的那个
            if (temp>=arr[child])
                break;
            arr[parent] = arr[child];
            //把子节点的值付给父节点，并向下继续判断
            parent = child;
            child = parent*2+1;
        }
        arr[parent] = temp;//找到初始父节点的正确位置，赋值
    }

    public static void main(String[] args) {
        int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,1};
        heapSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
    }

}
