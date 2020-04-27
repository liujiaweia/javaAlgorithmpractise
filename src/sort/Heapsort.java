package sort;

public class Heapsort extends Sort{

    private int heapSize;
    @Override
    protected void sort() {

        heapSize = array.length;
        for(int i= (heapSize>>1)-1;i>=0;i--){
            siftDown(i);
        }
        while(heapSize>1){
            swap(0,--heapSize);
            siftDown(0);
        }
    }

    private void siftDown(int index) {
        Integer ele =  array[index];
        int half = heapSize>>1;
        while(index< half){
            // 默认是左边跟父节点比
            int childindex = (index<<1) +1 ;

            Integer child = array[childindex];

            int rightindex = childindex+1;
            // 右子节点比左子节点大
            if(rightindex < heapSize && cmpele(array[rightindex],child) > 0){
                child = array[childindex = rightindex];
            }
            // 大于等于子节点
            if(cmpele(ele,child)>=0){
                break;
            }
            array[index] = child;
            index = childindex;
        }
        array[index] = ele;
    }
}
