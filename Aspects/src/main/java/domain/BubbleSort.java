package domain;

import java.util.Random;

/**
 * Created by Illya on 21.02.17.
 */
public class BubbleSort  extends  SortAlgorithm {


    public BubbleSort(){
        super();
    }

    public BubbleSort(int size){
        super(size);
    }

    @Override
    public void sort() {

        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }

        }
    }

}
