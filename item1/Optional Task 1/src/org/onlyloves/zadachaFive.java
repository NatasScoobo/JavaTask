package org.onlyloves;
import java.util.ArrayList;


public class zadachaFive {
    public zadachaFive(int[] array, int value) {
        String[] chetNecet = new String[value];
        for (int i=0; i<value;i++) chetNecet[i] = String.valueOf(array[i]);
        int chet = 0;
        int nechet = 0;
        int itogChet = 0;
        int dlinna = 0;
        int chislo = 0;
        int ravny=0;

        for (int i =0;i<value;i++){
            dlinna = chetNecet[i].length();
            chislo = Integer.parseInt (chetNecet[i]);
            for (int p =0;p<dlinna;p++){

                int x = chislo % 2;
                if ( x == 0) {
                    chet ++;
                } else {
                    nechet ++;
                    }
                chislo /=10;
            }
            if (chet==nechet){
                ravny++;
            }
            if (nechet == 0){
                itogChet++;
            }
            chet=0;
            nechet=0;


        }
        System.out.println("Количество чисел с одними четными цифрами "+ itogChet);
        System.out.println("Количество чисел в которых четных и нечетных одинаково "+ ravny);
    }
}
