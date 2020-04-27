package sort;

public class mergesort extends Sort {
    private  int[] leftArray;
    @Override
    protected void sort() {
        leftArray = new int[array.length >> 1];
        sort(0,array.length);
    }
    private void sort(int begin, int end){
        if (end - begin < 2) return ;
        int mid = (end + begin)>>1;
        sort(begin,mid);
        sort(mid,end);
        merge(begin,mid,end);
    }

    private void merge(int begin, int mid, int end) {
        int li = 0, le =mid - begin;
        int ri  = mid,re =end;
        int ai = begin;
        for(int i= li;i<le;i++){
            leftArray[i] = array[begin + i];
        }
        while(li < le){
            if(ri < re&&cmpele(array[ri],leftArray[li]) <0){
                array[ai++] = array[ri++];
            }else{
                array[ai++] = leftArray[li++];
            }
        }
    }
}
