import java.util.GregorianCalendar;
public class Runner {
    public static void main(String[] args) {
        Student [] stud = new Student[3];
        stud[0] = new Student(1, "Ivan", "Ivanovich", "Ivanov", new GregorianCalendar(1980, 9, 9), "Kyiv", "063-333-33-33", "IGH", "5", "4");
        stud[1] = new Student(2, "Sergey", "Sergeevich", "Sergeev", new GregorianCalendar(1981, 5, 6), "Lviv", "063-333-99-33", "IGI", "4", "1");
        stud[2] = new Student(3, "Boris", "Filatovich", "Borisov", new GregorianCalendar(1985, 9, 1), "Kharkov", "063-433-90-30", "IGI", "4", "1");
        //создаем список
        ListOfStudent l = new ListOfStudent();
        for (Student k : stud) {
            l.addStudent(k);
        }
        //выводим список введенных студентов
        System.out.println("список введенных студентов");
        l.listOut(stud);
        //a) список студентов заданного факультета;
        System.out.println("список студентов заданного факультета");
        l.listOutByFaculty("IGH");
        //b) списки студентов для каждого факультета и курса;
        System.out.println("списки студентов для каждого факультета и курса");
        l.listOutByFacultyAndCourse("IGH","5");
        //c) список студентов, родившихся после заданного года;
        System.out.println("список студентов, родившихся после заданного года");
        l.listOutByYear(new GregorianCalendar(1980, 9, 9));
        //d) список учебной группы.
        System.out.println("список учебной группы");
        l.listOutByGroup("1");

    }
}
