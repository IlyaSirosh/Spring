package domain;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Illya on 22.02.17.
 */
public class SortAlgorithm implements Algorithm {
    protected int size;
    protected int[] array;

    public SortAlgorithm(){
        this(100);
    }

    public SortAlgorithm(int size){
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void prepare() {

        if( array == null || array.length!=size)
            array = new int[size];

        Random r = new Random(System.currentTimeMillis());

        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(size);
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void execute() {
        sort();
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int x: array){
            sb.append(x);
            sb.append(" ");
        }
        return sb.toString();
    }
}
