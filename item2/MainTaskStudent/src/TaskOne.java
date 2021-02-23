import java.util.List;

public class TaskOne {
    public TaskOne(List<Student> list, int listsize, String inputfacultet){
        System.out.println("Cписок студентов факультета '" + inputfacultet + "'");
        int counter = 0;
        for(int i = 0;i < listsize;i++){
            if (((list.get(i).getFaculty()).equals(inputfacultet))) {
                counter++;
                System.out.println(list.get(i));
            }
        }
        if(counter==0){
            System.out.println("Список студентов пуст");
        }

    }
}
