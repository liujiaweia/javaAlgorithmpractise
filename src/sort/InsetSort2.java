package sort;

public class InsetSort2 extends Sort {
    @Override
    protected void sort() {
        for(int begin = 1; begin < array.length;begin++){
            int cur = begin;
            int v = array[cur];
            while(cur>0 && cmpele(v,array[cur-1])<0)
            {
                array[cur] = array[cur-1];
                cur--;
            }
            array[cur]= v;
        }
    }
}
