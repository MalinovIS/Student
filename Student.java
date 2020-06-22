import java.util.GregorianCalendar;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String midName;
    private GregorianCalendar birthday;
    private String adress;
    private String phone;
    private String faculty;
    private String course;
    private String group;

    public Student (int id, String surname, String name, String midName, GregorianCalendar birthday, String adress, String phone, String faculty, String course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.midName = midName;
        this.birthday = birthday;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
public int getId() {
        return id;
}
public  void  setId( int id){
        this.id = id;
}
public String getSurname() {
    return surname;
}
public  void  setSurname( String surname) {
    this.surname = surname;
}
    public String getName() {
        return name;
    }
    public  void  setName( String name) {
        this.name = name;
    }
    public String getMidName() {
        return midName;
    }
    public  void  setMidName( String midName) {
        this.midName = midName;
    }
    public GregorianCalendar getBirthday() {
        return birthday;
    }
    public  void  setBirthday( GregorianCalendar birthday) {
        this.birthday = birthday;
    }
    public String getAdress() {
        return adress;
    }
    public  void  setAdress( String adress) {
        this.adress = adress;
    }
    public String getPhone() {
        return phone;
    }
    public  void  setPhone( String phone) {
        this.phone = phone;
    }
    public String getFaculty() {
        return faculty;
    }
    public  void  setFaculty( String faculty) {
        this.faculty = faculty;
    }
    public String getCourse() {
        return course;
    }
    public  void  setCourse( String course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public  void  setGroup( String group) {
        this.group = group;
    }

}
