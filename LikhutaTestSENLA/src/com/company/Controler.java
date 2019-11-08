package com.company;

public class Controler {
    public static String taskFour(int a, int b) {
        return new NODandNOK().searchNODandNOK(a, b);
    }

    public static String taskFive(String string) {
        return new polindrom().chekPolindrom(string);
    }

    public String taskOne(int variable) {
        return new SimpleNumbers().ListSimpleNumbers(variable).toString();
    }

    public String taskTwo(int variable) {
        return new numberFibonachchi().ListNumberFibonachchi(variable).toString();
    }

    public String taskThree(float[] Koordinati) {
        return new checkPoint().check(Koordinati);
    }

    public String taskSix(String string) {
        return string.replaceAll("\\d","");
    }
}
