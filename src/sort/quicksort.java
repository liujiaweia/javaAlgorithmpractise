package sort;

public class quicksort extends Sort {
    @Override
    protected void sort() {
        sort(0,array.length);
    }
    //找每个点的轴点
    private void sort(int begin, int end) {
        if(end - begin < 2) return ;
        int mid = getindex(begin,end);
        sort(begin,mid);
        sort(mid+1,end);
    }
    //这个点在这个数组的左大右小的地方
    private int getindex(int begin, int end) {
         int t =  array[begin];
         end --;
         while(begin<end){
             while(begin<end) {
                 if (t < array[end]) {
                     end--;
                 } else {
                     array[begin++] = array[end];
                     break;
                 }
             }
             while(begin<end) {
                 if (t > array[begin]) {
                     begin++;
                 } else {
                     array[end--] = array[begin];
                     break;
                 }
             }
         }
         array[begin] = t;
         return begin;
    }
}
