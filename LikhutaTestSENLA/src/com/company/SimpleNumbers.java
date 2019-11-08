package com.company;

import java.util.ArrayList;

public class SimpleNumbers {
    ArrayList<Integer> ListSimpleNumbers(int variable) {
        ArrayList<Integer> SimpleNumbers = new ArrayList<>();
        int divider;
        for (int i = 2; i <= variable; i++) {
            divider = 0;
            for (int p = 1; p <= i; p++) {
                if (i % p == 0) {
                    divider++;
                }
            }
            if(divider <= 2) {
                SimpleNumbers.add(i);
            }
        }
        return SimpleNumbers;
    }
}
