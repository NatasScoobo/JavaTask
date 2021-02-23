package org.onlyloves;

public class zadachaThree {


    public zadachaThree(int[] array, int value) {
        String[] srednee = new String[value];
        for (int i=0; i<value;i++) srednee[i] = String.valueOf(array[i]);
        double summvaalue = 0;
        double sredneeZnachenie;
        for (int i=0;i < value; i++){
            summvaalue=summvaalue+srednee[i].length();
        }
        sredneeZnachenie=summvaalue/value;
        System.out.println("\nСреднее значение =" + sredneeZnachenie);
        for (int i=0;i < value; i++){
            if (srednee[i].length() < sredneeZnachenie){
                System.out.println("Числа меньше среднего значения  " + sredneeZnachenie + " число "+ srednee[i] + " длинна " + srednee[i].length());
            }
        }
        for (int i=0;i < value; i++) {
            if (srednee[i].length() > sredneeZnachenie) {
                System.out.println("Числа больше среднего значения  " + sredneeZnachenie + " число " + srednee[i] + " длинна " + srednee[i].length());

            }
        }
}

}
