package domain;

/**
 * Created by Illya on 22.02.17.
 */
public class MergeSort extends SortAlgorithm {

    private int[] temp;

    public MergeSort(){
        super();
    }

    public MergeSort(int size){
        super(size);
    }


    @Override
    public void sort(){
        doMergeSort(0, size - 1);
    }


    @Override
    public void prepare() {
        super.prepare();
        this.temp = new int[size];
    }


    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }

    }
}
