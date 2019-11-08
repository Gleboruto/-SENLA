package com.company;

public class polindrom {
    public String chekPolindrom(String string) {
        string = string.replaceAll("\\s+","");
        String check = "Нет";
        char[] stringChar = string.toLowerCase().toCharArray();
        char[] reversstringChar = new StringBuilder(string.toLowerCase()).reverse().toString().toCharArray();
        for(int i = 0; i < string.length(); i++){
            if(stringChar[i] == reversstringChar[i]){
                check = "Да";
            }else{
                check = "Нет";
                break;
            }
        }
        return check;
    }
}
