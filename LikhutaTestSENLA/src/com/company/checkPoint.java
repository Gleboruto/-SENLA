package com.company;

public class checkPoint {
    private float x1, x2, y1, y2, a1, a2, b2, b1;
    private float v1, v2, v3, v4;
    public String check(float[] Koordinati) {
        x1 = Koordinati[0];
        y1 = Koordinati[1];
        x2 = Koordinati[2];
        y2 = Koordinati[3];
        a1 = Koordinati[4];
        b1 = Koordinati[5];
        a2 = Koordinati[6];
        b2 = Koordinati[7];
        return peresechenie();
    }

    private String peresechenie() {
        v1 = vektornoeProizvedenie(a2-a1,b2-b1,x1-a1,y1-b1);
        v2 = vektornoeProizvedenie(a2-a1,b2-b1,x2-a1,y2-b1);
        v3 = vektornoeProizvedenie(x2-x1,y2-y1,a1-x1,a1-y1);
        v4 = vektornoeProizvedenie(x2-x1,y2-y1,a2-x1,a2-y1);
        if ((v1 * v2 < 0) && (v3 * v4 < 0)){
            System.out.println("Пересекаются");
        }else{
            System.out.println("Не пересекаются");
        }
        return null;
    }

    private float vektornoeProizvedenie(float ax, float ay, float bx, float by) {
        float vektrPoizved = ax * by - bx * ay;
        return vektrPoizved;
    }
}
