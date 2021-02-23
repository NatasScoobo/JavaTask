package org.onlyloves;

import java.util.*;

public class zadachaTwo {


    public zadachaTwo(int[] array, int value) {
        String[] ubivanie = new String[value];
        for (int i=0; i<value;i++) ubivanie[i] = String.valueOf(array[i]);
        Arrays.sort(ubivanie);
        for(int i = ubivanie.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами */
                if( ubivanie[j].length() > ubivanie[j+1].length() ){
                    String temp = ubivanie[j];
                    ubivanie[j] = ubivanie[j+1];
                    ubivanie[j+1] = temp;
                }
            }
        }
        System.out.println("По возрастанию");
        for(int i = 0; i < ubivanie.length; i++) System.out.println(ubivanie[i]);
        System.out.println("По убыванию");
        for(int i = value-1; i>-1; i--) System.out.println(ubivanie[i]);
    }

}
