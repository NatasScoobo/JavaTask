/*
Реализовать следующие программы:
1.     Приветствовать любого пользователя при вводе его имени через командную строку.

2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

5.     Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */
import java.util.Scanner;
public class RunnerTask {
    public static String userName;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name? - ");
        userName  = scanner.nextLine();
        System.out.println("1.     Приветствовать любого пользователя при вводе его имени через командную строку.\n" +
                           "2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.\n" +
                           "3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку\n" +
                           "4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.\n" +
                           "5.     Ввести чDefining the monthисло от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.\n\n");
        System.out.print("Выберите номер задания (1-5) - ");
        int item = scanner.nextInt();
        switch (item){
            case 1:System.out.println("Hi "+ userName);
            break;
            case 2: new ReverseNumer();
            break;
            case 3: new RandomNumbers();
            break;
            case 4: new SumAndMultiplication();
            break;
            case 5: new DefiningTheMonth();
            break;
            default:System.out.println("Нет такой задачи");
        }

     }

}
