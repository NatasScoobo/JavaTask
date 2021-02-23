import java.util.Scanner;

public class RandomNumbers {

    public RandomNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int interNumm = scanner.nextInt();
        scanner.close();
        int array[] = new int[interNumm];
        System.out.println("По строкам");
        for (int i = 0;i<interNumm;i++){
            array[i]= (int) (Math.random()*((1000)+1));
            System.out.println(array[i]);
        }
        System.out.println("В одну строку");
        for (int i = 0;i<interNumm;i++){
            System.out.print(array[i]+ ", ");
        }

    }
}
