package sort;

public class Selectsort {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,2,8,7};
        selectsort(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+ "_");
        }

    }

    private static void selectsort(int[] arr) {
        for (int end = arr.length-1; end >0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                if (arr[maxIndex] <= arr[begin]) {
                    maxIndex = begin;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[end];
            arr[end] = temp;
        }


    }


}
