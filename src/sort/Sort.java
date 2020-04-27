package sort;

public abstract class Sort {
    protected Integer[] array;
    protected int comCount;
    protected int swapCount;

    public void sort(Integer[] array){
        if(array == null && array.length<2) return;
        this.array = array;
        sort();
    }

    protected abstract void sort();


    protected int cmp(int i1, int i2){
        comCount++;
        return array[i1] - array[i2];
    }

    protected int cmpele(Integer v1, Integer v2){
        comCount++;
        return v1 - v2;
    }

    protected void swap(int i1, int i2){
        swapCount++;
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

}
