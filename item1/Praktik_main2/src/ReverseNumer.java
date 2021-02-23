import java.util.Scanner;

public class ReverseNumer {
    public ReverseNumer(){
        int amount = 0;
        int multiply = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите требуемое количество чисел (1-10)- ");
        int interNumm = scanner.nextInt();
        int array[] = new int[interNumm];
        for(int i = 0; i < interNumm; i++) {
            System.out.print("Число N" + (i+1) + " - ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.print("Числа в обратном порчдке -");
        for (int i = interNumm-1;i>=0;i-- ){
            System.out.print (" " + array[i]);
        }


    }
}
