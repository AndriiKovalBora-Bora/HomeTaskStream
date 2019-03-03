package com.company.controller;

import com.company.model.Model;
import com.company.view.View;
import com.company.view.ViewConstants;

import java.util.Arrays;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void proccesUser() {
        int SIZE = 10;
        int NUMBER = 8;
        int intArray[] = new int[SIZE];
        initializeArray(intArray);
        view.printMessage(ViewConstants.INITIAL_ARRAY, Arrays.toString(intArray));

        model.setArray(intArray);

        view.printMessage(ViewConstants.AVERAGE_VALUE, Double.toString(model.averageValue()));

        view.printMessage(ViewConstants.MIN_VALUE, Integer.toString(model.minValue()), ViewConstants.MIN_VALUE_INDEX, Integer.toString(model.minValueIndex()));

        view.printMessage(ViewConstants.MUNBER_OF_ZERO_ELEMENTS, Integer.toString(model.numberOfZeroElements()));

        view.printMessage(ViewConstants.NUMBER_OF_ELEMENTS_ABOVE_ZERO, Integer.toString(model.numberOfElementsAboveZero()));

        view.printMessage(ViewConstants.ARRAY_AFTER_MULTIPLY, Arrays.toString(model.multiple(NUMBER)), ViewConstants.NUMBER, Integer.toString(NUMBER));
    }

    private void initializeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 101);
        }
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
