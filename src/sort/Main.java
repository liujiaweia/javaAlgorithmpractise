package sort;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,3,4,2,6,5,8,7};
        //new Heapsort().sort(arr);
        //new BubbleSort01().sort(arr);
        //new SelectSort01().sort(arr);
        //new InsertSort().sort(arr);
        //new InsetSort2().sort(arr);
        //new Insertsort3().sort(arr);
        //new mergesort().sort(arr);
        new quicksort().sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"-");
        }
    }
}
