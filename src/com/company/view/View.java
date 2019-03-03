package com.company.view;

public class View {
    public void printMessage(String... s) {
        for (String s1 : s)
            System.out.print(s1 + " ");
        System.out.println();
    }

    /*public String arrayToString(int[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++)
            s += array[i] + "  ";
        return s;
    }*/
}
