package org.onlyloves;

public class zadachaOne {


    public zadachaOne(int[] array, int value) {
        String[] minmax = new String[value];
        for (int i=0; i<value;i++) minmax[i] = String.valueOf(array[i]);
        int idmin = 100;
        int idmax = 0;
        int min = minmax[0].length();
        int max = minmax[0].length();
        for (int i = 0;i<value;i++){
            int arrValue = minmax[i].length();
            if (max<arrValue){
                idmax = i;
                max=arrValue;
                System.out.println("max "+max);
            }
            if (min>arrValue){
                idmin = i;
                min=arrValue;
                System.out.println("min "+min);
            }


        }
        System.out.println("Самое длинное число в " + minmax[idmax].length() + " знаков это " +  minmax[idmax]);
        System.out.println("Самое короткое число в " + minmax[idmin].length() + " знаков это " + minmax[idmin]);
    }


}
