import java.util.Random;
import java.util.Scanner;

/*
Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы
в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).

Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца
(строки).
 */

public class RandomRunner {

    public static void main(String[] args) {
        Random randomize = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы [n] [n] - ");
        int numer = scanner.nextInt();
        System.out.print("Введите интервал значений от -M до M - ");
        int interval = scanner.nextInt();
        int array[][] = new int[numer][numer];
        for(int i = 0; i < numer; i++) {
            for (int x = 0; x < numer; x++){
                int value = randomize.nextInt(interval * 2) - interval + 1;
                array[i][x] = value;
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println("");
            for(int x = 0;x<numer;x++){
                System.out.print(" "+array[i][x]);
            }
        }
        System.out.print("Какой сортируем столбец (1-"+numer+") ? - ");
        int sort = scanner.nextInt();
        if (sort>numer||sort<0){
            System.out.println("Введено не верное число");
        }else{
            new sorted(numer, sort, array);
        }

    }
}
