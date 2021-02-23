import java.util.List;

public class TaskTwo {
    public TaskTwo(List<Student> list, int listsize){
        System.out.println("Cписок студентов факультета с разбивкой по курсам");
        for(Facultet facult : Facultet.values()) {
            System.out.println("\nФакультет " + facult);
            for (int curs = 1; curs <= 5; curs++) {
                System.out.println(curs + " курс");
                int counter = 0;
                for (int x = 0; x < listsize; x++) {
                    if (((list.get(x).getFaculty()).equals(facult.getTranslateFacultet()))&&(list.get(x).getCourse())==curs) {
                        counter++;
                        System.out.println(list.get(x));
                    }
                }
                System.out.println("Найдено записей "+ counter +".");


            }
        }
    }
}
