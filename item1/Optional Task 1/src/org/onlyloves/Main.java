package org.onlyloves;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Scanner kol = new Scanner(System.in);
        System.out.print("Введите количество цифр ");
    int value = kol.nextInt();
    int[] array = new int[value];
    for (int i = 0;i<value;i++){
        System.out.print("Введите значение цифры N"+(i+1)+" - ");
        array[i] = kol.nextInt();
    }
        System.out.println("1.  Найти самое короткое и самое длинное число. Вывести найденные числа и их длину. ");
        System.out.println("2.  Вывести числа в порядке возрастания (убывания) значений их длины. ");
        System.out.println("3.  Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
        System.out.println("4.  Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них. ");
        System.out.println("5.  Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр. ");
        System.out.println("2.  Вывести числа в порядке возрастания (убывания) значений их длины. ");
        System.out.print("\nВведите номер задачи ");
        int zadacha = kol.nextInt();
        switch (zadacha){
            case 1: new zadachaOne(array, value);
            break;
            case 2: new zadachaTwo(array, value);
            break;
            case 3: new zadachaThree(array, value);
            break;
            case 4: new zadachaFo(array, value);
            break;
            case 5: new zadachaFive(array, value);
            break;
            default:System.out.println("Введен не верный вариант");

        }
    }
}
