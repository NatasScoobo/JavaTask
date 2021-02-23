import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TaskRunner {


    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file = new File("data.bin");
        List<Student> list = new ArrayList<>();
        Scanner scannerFile = new Scanner(file);
        while (scannerFile.hasNextLine()){
            String line = scannerFile.nextLine();
            String[] dataStudent =line.split("@");
            int txtId = Integer.parseInt(dataStudent[0]);
            String txtfirstName = dataStudent[1].toString();
            String txtlastName = dataStudent[2].toString();
            String txtpatronymic = dataStudent[3].toString();
            String tmpDate = dataStudent[4].toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
            String dateInString = tmpDate;
            Date date = sdf.parse(dateInString);
            String txtadress = dataStudent[5].toString();
            String txtphoneNumber = dataStudent[6].toString();
            String txtfaculty = dataStudent[7].toString();
            int txtcourse = Integer.parseInt(dataStudent[8]);
            String txtgroup = dataStudent[9].toString();
            Student student = new Student(txtId, txtfirstName, txtlastName, txtpatronymic, date, txtadress, txtphoneNumber, txtfaculty, txtcourse, txtgroup);
            list.add(student);
        }
        System.out.println("В базу загружено "+list.size()+" студента!");
        scannerFile.close();
        Scanner scannerSysIn = new Scanner(System.in);
        System.out.println("Задачи");
        System.out.println("1. вывести список студентов заданного факультета;");
        System.out.println("2. списки студентов для каждого факультета и курса;");
        System.out.println("3. список студентов, родившихся после заданного года;");
        System.out.println("4. список учебной группы.\n");
        System.out.print("Номер задачи?  ");
        int zadacha = scannerSysIn.nextInt();
        scannerSysIn.nextLine();
        int listsize= list.size();
        switch (zadacha) {
            case 1: {
                System.out.print("Факультет?  ");
                String inputfacultet = scannerSysIn.nextLine();
                new TaskOne(list, listsize, inputfacultet);
            }
            break;
            case 2:
                new TaskTwo(list, listsize);
                break;
            case 3: {
                System.out.print("Год выборки (ГГГГ)?  ");
                int inputYear = scannerSysIn.nextInt();
                if (inputYear>2000&&inputYear<2020) {
                    inputYear =- 2000;
                }else if (inputYear<2000&&inputYear>1950){
                    inputYear =- 1900;
                }else if (inputYear<1950){
                    inputYear =- 01;
                }

                new TaskThree(list, listsize, inputYear);
            }
            break;
            case 4: {
                GroupNum[] groupNum = GroupNum.values();
                System.out.print("Список групп (/");
                for (GroupNum groupNum1 : groupNum) {
                    System.out.print(groupNum1 + "/");
                }
                System.out.println(")");
                System.out.println("Код группы?  ");
                String inputCode = scannerSysIn.nextLine();
                new TaskFour(list, listsize, inputCode);
            }
            break;
            default:
                System.out.println("Выбран не верный вариант");
        }





    }
}
