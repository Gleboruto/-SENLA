package com.company;

import java.util.ArrayList;

public class numberFibonachchi {

    ArrayList<Integer> ListNumberFibonachchi(float variable) {
        ArrayList<Integer> NumberFibonachchi = new ArrayList<>();
        NumberFibonachchi.add(0);
        NumberFibonachchi.add(1);
        variable = (float) ((Math.pow(((1 + Math.sqrt(5)) / 2), variable) - Math.pow(((1 - Math.sqrt(5)) / 2), variable)) / (Math.sqrt(5)));
        Fibonachchi(NumberFibonachchi, variable);
        return NumberFibonachchi;
    }

    private ArrayList<Integer> Fibonachchi(ArrayList<Integer> NumberFibonachchi, float variable) {
        int summLustNumberf = NumberFibonachchi.get(NumberFibonachchi.size() - 1) + NumberFibonachchi.get(NumberFibonachchi.size() - 2);
        if (summLustNumberf <= variable) {
            NumberFibonachchi.add(summLustNumberf);
            return Fibonachchi(NumberFibonachchi, variable);
        }
        NumberFibonachchi.remove(0);
        return NumberFibonachchi;
    }
}