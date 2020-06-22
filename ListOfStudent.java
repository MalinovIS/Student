import java.util.Calendar;
import java.util.GregorianCalendar;

public class ListOfStudent {
    private Student[] listOfStudent = new Student[100];

    int k = 0;

    public void addStudent(Student n) {
        listOfStudent[k++] = n;
    }
    public void outputStudent (Student i) {
        System.out.print("ID: " + i.getId() + ", ");
        System.out.print("Surname: " + i.getSurname() + ", ");
        System.out.print("Name: " + i.getName() + ", ");
        System.out.print("Midname: " + i.getMidName() + ", ");
        System.out.print("Birthday: " + i.getBirthday().get(Calendar.YEAR) + "-" + i.getBirthday().get(Calendar.MONTH) + "-" + i.getBirthday().get(Calendar.DAY_OF_MONTH) + ", ");
        System.out.print("Adress: " + i.getAdress() + ", ");
        System.out.print("Phone: " + i.getPhone() + ", ");
        System.out.print("Faculty: " + i.getFaculty() + ", ");
        System.out.print("Course: " + i.getCourse() + ", ");
        System.out.print("Group: " + i.getGroup() + ", ");
        System.out.println();
    }

    public void listOut(Student[] listOfStudent) {
        for (Student m : listOfStudent) {
            outputStudent(m);
        }
    }

    public void listOutByFaculty (String Faculty) {
        for (Student m: listOfStudent) {
            if (m != null) {

                if (Faculty.equalsIgnoreCase(m.getFaculty())) {
                    outputStudent(m);
                }
            }
        }
    }
    public void listOutByFacultyAndCourse (String Faculty, String Course) {
        for (Student m: listOfStudent) {
            if (m != null) {
                if (m.getFaculty().equalsIgnoreCase(Faculty) && m.getCourse().equalsIgnoreCase(Course) ) {
                    outputStudent(m);
                }
            }
        }
    }
    public void listOutByYear (GregorianCalendar year) {
        for (Student m : listOfStudent) {
            if (m != null) {
                if (m.getBirthday().get(Calendar.YEAR)>year.get(Calendar.YEAR)) {
                    outputStudent(m);
                }
            }
        }
    }
    public void listOutByGroup (String Groupe) {
        for (Student m : listOfStudent) {
            if (m != null) {
                if (m.getGroup().equalsIgnoreCase(Groupe)) {
                    outputStudent(m);
                }
            }
        }
    }
}

