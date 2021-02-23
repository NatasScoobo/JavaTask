import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date dateOfBirth;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String patronymic, Date dateOfBirth, String adress, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {

        return "Студент " +
                "под номером " + id +
                ", " + firstName +
                " " +lastName +
                " " +patronymic +
                ", дата рождения " + dateOfBirth.getDay() +"."+dateOfBirth.getMonth()+"."+dateOfBirth.getYear()+"г." +
                ", проживает " + adress +
                ", номер тел. " + phoneNumber +
                ", Факультет " + faculty +
                ", курс" + course +
                ", группа № " + group;
    }
}
