import java.util.List;

public class TaskThree {
    public TaskThree(List<Student> list, int listsize, int inputYear){
        System.out.println("Cписок студентов, родившихся после " + inputYear + " года");
        int counter = 0;
        for(int y = 0;y < listsize;y++){
            if (((list.get(y).getDateOfBirth().getYear())>(inputYear))) {
                counter++;
                System.out.println(list.get(y));
            }
        }
        System.out.println("Найдено " + counter + "записей.");
    }
}
