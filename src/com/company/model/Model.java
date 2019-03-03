package com.company.model;

import com.company.view.View;

import java.util.Arrays;
import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class Model {
    private int[] array;

    public double averageValue(){
        return Arrays.stream(array).average().getAsDouble();
    }

    public int minValue(){
        return Arrays.stream(array).min().getAsInt();
    }

    public int minValueIndex(){
        int min = Arrays.stream(array).min().getAsInt();
        final int min1 = min;
        return (int) Arrays.stream(array).takeWhile(x -> x != min1).count();
    }

    public int numberOfZeroElements(){
        return (int) Arrays.stream(array).filter(x -> x==0).count();
    }

    public int numberOfElementsAboveZero(){
        return (int) Arrays.stream(array).filter(x -> x>0).count();
    }

    public int[] multiple(int num){
        return Arrays.stream(array).map(x -> x*num).toArray();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
