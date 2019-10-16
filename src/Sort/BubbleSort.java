package Sort;

import java.util.Scanner;

public class BubbleSort {
    /*
    * 冒泡排序多次遍历数组，
    * 在每次遍历中连续比较相邻的元素，
    * 如果没按顺序排列，就交换它们的值。
      较小的值逐渐浮向顶部，
      而较大的值沉向底部。第一次遍历后最后一个元素是数组中的最大值，
      第二次遍历后，倒数第二个元素是数组中第二大的数。
      这个过程持续到所有元素都排好序。
    *
    * */
    public static void bubbleSort(int[] arr){
        for (int i = 1;i<arr.length;i++){
            //外循环控制循环的趟数，即表示有多少个数需要重新排序
            for (int j = 0;j<arr.length-i;j++){
                //内循环找到当前数的正确位置
                if (arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i< a.length;i++) a[i] = Integer.parseInt(scanner.next());
        scanner.close();
        /*BubbleSort bubble =  new BubbleSort();
        bubble.bubbleSort(a);
        IDEA可以直接引用本类中的方法,不像eclipse里面还要先创建实体对象
        上面的代码可以直接写成*/
        bubbleSort(a);
        for(int num:a){
            System.out.println(num);
        }
    }
}
