package sort;

public class BubbleSort02 extends Sort {
    @Override
    protected void sort() {
        for(int end = array.length-1;end>0;end--) {
            int flag = 0;
            for (int begin = 1; begin <=end; begin++) {
                if (cmp(begin,begin-1)< 0) {
                    swap(begin,begin - 1);
                    flag = 1;
                }
            }
            if(flag == 0)
                break;;
        }
    }
}
