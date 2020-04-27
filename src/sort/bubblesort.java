package sort;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,7,8};
        //bubblesort1(arr);
        //bubblesort2(arr);
        bubblesort3(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"_");
    }
   //第二次优化 记录 当前交换最后一次的地方 每次从最后一次交换的地方开始 用于处理 存在成段连续的序列
    private static void bubblesort3(int[] arr) {
        for(int end = arr.length-1;end>0;end--) {
            int index = 1;
            for (int begin = 1; begin <=end; begin++) {
                if (arr[begin] < arr[begin - 1]) {
                    swap(arr[begin], arr[begin - 1]);
                    index = begin;
                }
            }
            end = index;
        }
    }
    //初次优化后的 (当 某一次没有交换时 即排序成功)
    private static void bubblesort2(int[] arr) {
        for(int end = arr.length-1;end>0;end--) {
            int flag = 0;
            for (int begin = 1; begin <=end; begin++) {
                if (arr[begin] < arr[begin - 1]) {
                    swap(arr[begin], arr[begin - 1]);
                    flag = 1;
                }
            }
            if(flag == 0)
                break;;
        }
    }
    //普通的冒泡排序
    private static void bubblesort1(int[] arr) {
        for(int end = arr.length-1;end>0;end--) {
            for (int begin = 1; begin <=end; begin++) {
                if (arr[begin] < arr[begin - 1]) {
                    swap(arr[begin], arr[begin - 1]);
                }
            }
        }
    }
    private static void swap(int a,int b) {
        int temp = a;
        a = b;
        b =temp;
    }
}
