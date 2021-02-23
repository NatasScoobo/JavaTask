import java.util.*;

public class sorted {
    public sorted (int numer, int sort, int [][] array ) {
        int [] sortArray = new int[numer];
        for (int i = 0; i < numer; i++){
        sortArray[i] = array[i][sort-1];
        }
        Arrays.sort(sortArray);
        for (int s=0;s<numer;s++){
        }
        for (int r=0; r<numer;r++){
            array[r][sort-1] = sortArray[r];
        }
        System.out.println("Отсортирован "+sort+" столбец");
        for (int p=0;p<numer;p++){
            for (int y=0;y<numer;y++){
                System.out.print(array[p][y]+ ", ");
            }
            System.out.print("\n");
        }
    }
}
