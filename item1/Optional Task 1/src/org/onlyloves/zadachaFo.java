package org.onlyloves;
import java.io.*;

public class zadachaFo {
    public zadachaFo(int[] array, int value) {
        String pereliv1;
        String pereliv2;
        int lengtLine;
        String zamena = "";
        int zamena2;
        int pereliv3;
        int min=0;
        int max=0;

        String[] temper = new String[value];
        for (int i=0; i<value;i++) temper[i] = String.valueOf(array[i]);
            String[] manySymbol = new String[value];
                for (int i =0; i<value;i++){
          manySymbol[i] = Character.toString(temper[i].charAt(0));
                    pereliv1 = temper[i];
                    lengtLine = temper[i].length();
                    for (int m = 1; m < lengtLine;m++) {
                        pereliv2 = Character.toString(temper[i].charAt(m));
                        pereliv3 = pereliv1.indexOf(pereliv2);

                        if (m==1) {
                            zamena = pereliv1.replace(pereliv2, "");
                            zamena = pereliv2 + zamena;
                        }
                        else{
                            zamena = zamena.replace(pereliv2, "");
                            zamena = pereliv2 + zamena;
                        }
                        lengtLine = zamena.length();
                        temper[i] = zamena;
                    }


                }
        int mill = temper[0].length();
        int mall = temper[0].length();
        for (int s = 0; s<value; s++){
            zamena2 = temper[s].length();
            // temper[s] = zamena2;
            if(mill>zamena2) min = s;
            if(mall<zamena2) max = s;
        }
        if (min == max){
            System.out.println("Количество разных цифр в числах одинаково  и составляет " + temper[min].length());
        }
        if (min != max){
            System.out.println("Минимальное количество разных цифр в числе  " + array[min] + " Всего разных цифр " + temper[min].length());
            System.out.println("Максимальное количество разных цифр в числе "  + array[max] + " Всего разных цифр " + temper[max].length());

        }
    }

}
