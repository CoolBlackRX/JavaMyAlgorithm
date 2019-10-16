package DivideAndConquer_Strategy;

public class Maximum_Subarray {
    //最大子数组
    /*
    *给定的一个数组A[low..high]，找出最大的非空连续的子数组A[i..j],此时low<=i<=j<=high;
    * 自由当数组包含负数时，最大子数组才有意义。
    * 因为当所有数组元素非负时，
    * 整个数组的和才是最大的，
    * 研究此问题没有意义*/

    /*利用分治思想求解问题
    * 将数组尽可能的划分成两个规模相等的子数组，找到中间位置mid
    * 可以想象，原问题的解分布情况：
    * 1：完全位于子数组A[low..mid]中，low<=i<=j<=mid;
    * 2：完全位于子数组A[mid..high]中，mid<=i<=j<=high;
    * 3：跨越了中点，因此low<=i<=nid<=j<=high;
    * */

    private int find_Max_Crossing_Subarray(int[] arr,int low,int mid,int high){
        int sum = 0;
        int max_left = 0;//找到从mid到左边最大元素和的位置
        int max_right = 0;//找到从mid到右边最大元素和的位置

        int left_sum = arr[mid];
        sum = 0;
        for(int i = mid;i>=low;i--){
            sum += arr[i];
            if (sum > left_sum){
                left_sum = sum;
                //max_left = i;
            }
        }
        //从中间往左找，找到和最大的值和位置
       int right_sum = arr[mid+1];
        sum = 0;
        for(int j = mid+1;j<=high;j++){
            sum += arr[j];
            if(sum > right_sum){
                right_sum = sum;
                //max_right = j;
            }
        }
        //从中间往右找，找到和最大的值和位置

        //return new int[]{max_left,max_right,left_sum+right_sum};
        return (left_sum+right_sum);
    }

    private int find_Maximum_Subarray(int[] arr,int low,int high){
        if (low == high)
            //return new int[]{low,high,arr[low]};
            return arr[low];
        else{
            int mid = (low + high)/ 2;
            //int[] left_max = find_Maximum_Subarray_Details(arr,low,mid);
            int left_max = find_Maximum_Subarray(arr,low,mid);
            //最大子数组完全在划分的左子数组
            //int[] right_max = find_Maximum_Subarray_Details(arr,mid+1,high);
            int right_max = find_Maximum_Subarray(arr,mid+1,high);
            //最大子数组完全在划分的右子数组
            //int[] cross_max = find_Max_Crossing_Subarray(arr,low,mid,high);
            int cross_max = find_Max_Crossing_Subarray(arr,low,mid,high);
            //最大子数组跨过分界点
           /* if (left_max[2]>=right_max[2] && left_max[2]>=cross_max[2])
                return left_max;
            else if (right_max[2]>=left_max[2] && right_max[2]>=cross_max[2])
                return right_max;
            else
                return cross_max;*/
            if (left_max>=right_max && left_max>=cross_max)
                return left_max;
            else if (right_max>=left_max && right_max>=cross_max)
                return right_max;
            else
                return cross_max;
        }
    }

    /*private void find_Maximum_Subarray(int[] arr){
        int[] maximum_subarrray = find_Maximum_Subarray_Details(arr,0,arr.length-1);
        System.out.println(maximum_subarrray);
    }*/

    public static void main(String[] args) {
        int[] arr = new int[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        Maximum_Subarray ms = new Maximum_Subarray();
        System.out.println(ms.find_Maximum_Subarray(arr,0,arr.length-1));

    }

}
