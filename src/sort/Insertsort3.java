package sort;

public class Insertsort3 extends Sort {
    @Override
    protected void sort() {
        for(int begin = 1;begin< array.length;begin++){
            insert(begin,search(begin));
        }
    }

    private void insert(int begin, int dest) {
        int v = array[begin];
        for(int i=begin; i>dest; i--){
            array[i] = array[i-1];
        }
        array[dest] = v;
    }

    private int search(int index) {
        int begin = 0;
        int end = index;
        while(begin < end){
            int mid = (begin+ end)>>1;
            if(cmpele(array[index],array[mid])<0)
                end = mid;
            else {
                begin = mid +1;
            }
        }
        return begin;
    }
}
