package sort;

public class BubbleSort01 extends Sort {
    @Override
    protected void sort() {
        for(int end = array.length-1;end>0;end--) {
            int index = 1;
            for (int begin = 1; begin <=end; begin++) {
                //if (array[begin] < array[begin - 1]) {
                if(cmp(begin,begin-1)< 0) {
                    swap(begin,begin - 1);
                    index = begin;
                    //}
                }
            }
            end = index;
        }
    }
}
