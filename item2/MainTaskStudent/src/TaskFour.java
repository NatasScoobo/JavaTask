import java.util.List;

public class TaskFour {
    public TaskFour(List<Student> list, int listsize, String inputCode){
        System.out.println("Cписок студентов группы " + inputCode + ".");
        int counter = 0;
        for (int z = 0; z < listsize; z++) {
            if ((list.get(z).getGroup()).equals(inputCode)) {
                counter++;
                System.out.println(list.get(z));
            }
        }
        System.out.println("Найдено записей "+ counter +".");

    }
}
