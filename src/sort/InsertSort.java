package sort;

public class InsertSort extends Sort {
    @Override
    protected void sort() {
       for(int begin = 1;begin< array.length;begin++){
           int cur = begin;
           while(cur>0&&cmp(cur, cur-1)<0){
               swap(cur,cur-1);
               cur--;
           }

       }
    }
}
