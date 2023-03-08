import java.io.IOException;
import java.util.Arrays;
import University.*;
public class Tester extends Methods {
    static University ukma;

    public static void main(String[] args) throws IOException {

        ukma = new University();
        //ukma.addFaculty("Fl", 3);
        System.out.println(ukma);

        //System.out.println(Arrays.toString(allStudents));
        //System.out.println(Arrays.toString(allTeachers));
/*
        //5
        allStudentsSortedByCourse();
        //6
        facultyStudentsSortedByName("Фен");
        facultyTeachersSortedByName("фі");
        //7

        specialtyStudentsSortedByCourse("ІПЗ");
        specialtyStudentsSortedByCourse("кн");
        specialtyStudentsSortedByCourse("економіка");
        specialtyStudentsSortedByCourse("маркетинг");
        //8
        specialtyStudentsSortedByName("ІПЗ");
        specialtyTeachersSortedByName("ІПЗ");
        specialtyStudentsSortedByName("кн");
        specialtyTeachersSortedByName("кн");
        specialtyStudentsSortedByName("економіка");
        specialtyTeachersSortedByName("економіка");
        specialtyStudentsSortedByName("маркетинг");
        specialtyTeachersSortedByName("маркетинг");
        //9
        StudentsBySpecialtyAndYear("ІПЗ", 2);
        StudentsBySpecialtyAndYear("ІПЗ", 1);
        //10
        StudentsBySpecialtyAndYearSortedByName("ІПЗ", 1);
        StudentsBySpecialtyAndYearSortedByName("кн", 2);
        //StudentsBySpecialtyAndYear("кн", 1);
        //StudentsBySpecialtyAndYearSortedByName("маркетинг", 3);

*/
        /*
        //4
        findStudentByName("шевчук");
        findTeacherByName("Печкурова");
        findTeacherByName("Глибовець");

        //1. додавання, редагування, видалення факультетів
        ukma.addFaculty("ФГН");
        editFaculty("ФГН", "ФСНСТ");
        //System.out.println(ukma);


        addSpecialty("Соціологія", "ФСНСТ");
        addSpecialty("Журналістика", "ФСНСТ");
        addSpecialty("Психологія", "ФСНСТ");
        addSpecialty("Соц робота", "ФСНСТ");
        addSpecialty("Міжнародні відносини", "ФСНСТ");
        addStudent("Зубець Олена Сергіївна", 1, 2, "Міжнародні відносини");
        ukma.addFaculty("ФГН");
        //deleteSpecialty("Економіка");
        addSpecialty("ПМ", "ФІ");
        //deleteStudent("трохимчук артем");

        specialtyStudentsSortedByCourse("ІПЗ");
        editStudentsName("трохимчук артем андрійович", "трохимчук артемчик андрійович");
        editStudentsYear("Красовський Андрій Олександрович", 4);
        editStudentsGroup("Крижанівська Маргарита Сергіївна", 2);
        specialtyStudentsSortedByCourse("ІПЗ");
        //deleteSpecialty("s");
        //deleteFaculty("ФЕН");
        addTeacher("Калиновська Оксана В'ячеславівна", new int[] {2, 3}, new int[] {2, 3}, "ІПЗ");
        addTeacher("Ренчка Інна Євгеніївна", new int[] {1}, new int[] {1, 2}, "КН");
        addTeacher("Ренчка Інна Євгеніївна", new int[] {1}, new int[] {1, 2}, "міжнародні відносини");
        deleteTeacherFromSpecialty("Печкурова Олена Миколаївна", "Економіка");
        deleteTeacherFromSpecialty("Печкурова Олена Миколаївна", "маркетинг");
        deleteTeacherCompletely("Калиновська Оксана В'ячеславівна");
        deleteTeacherFromSpecialty("Ренчка Інна Євгеніївна", "Міжнародні відносини");
        System.out.println(ukma);
*/

        String spec = DataInput.getString("enter speciality: ");
        while (!specialtyStudentsSortedByName(spec)) {
            spec = DataInput.getString("This specialty doesn't exist. Enter existing speciality: ");
        }
        /*System.out.println();
        ukma.findPersonByCourse(4);
        System.out.println();
        ukma.findPersonByGroup(3);*/


    /*for(int i=1025; i<1152; i++){
            System.out.print((char)i+" ");
        }*/
    }


    //4. Знайти студента за ПІБ
    private static void findStudentByName(String name) {
        System.out.println("Searching for students with "+name+" in their full name...");
        if (!findStudentsByNameAndShow(name)) System.out.println("no students found\n");
    }
    //4.Знайти викладача за ПІБ
    private static void findTeacherByName(String name) {
        System.out.println("Searching for teachers with "+name+" in their full name...");
        if (!findTeachersByNameAndShow(name)) System.out.println("no teachers found\n");
    }
    //4. Знайти студента за курсом.
    private static void findStudentByCourse(int year) {
        System.out.println("Searching for students who study "+year+" course...");
        if (!findStudentsByCourseAndShow(year)) System.out.println("no students found\n");
    }
    //4.Знайти викладача за курсом.
    private static void findTeacherByCourse(int year) {
        System.out.println("Searching for teachers who teach on "+year+" course...");
        if (!findTeachersByCourseAndShow(year)) System.out.println("no teachers found\n");
    }
    //4. Знайти студента за групою.
    private static void findStudentByGroup(int group) {
        System.out.println("Searching for students who study in group "+group+"...");
        if (!findStudentsByGroupAndShow(group)) System.out.println("no students found\n");
    }
    //4.Знайти викладача за групою.
    private static void findTeacherByGroup(int group) {
        System.out.println("Searching for teachers who teach in group "+group+"...");
        if (!findTeachersByGroupAndShow(group)) System.out.println("no teachers found\n");
    }

    //5. Вивести всіх студентів впорядкованих за курсами.
    private static void allStudentsSortedByCourse() {
        System.out.println("All students sorted by course");
        sortByCourse(ukma.getAllStudents(), ukma.getNumberOfStudents(), true);
    }

    //6. Вивести всіх студентів факультета впорядкованих за алфавітом.
    private static boolean facultyStudentsSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            System.out.println(facultyName+" students sorted by name");
            sortByName(f.getStudents(), f.getNumberOfStudents(), true);
            return true;
        } else {
            //System.out.println("This faculty doesn't exist");
            return false;
        }
    }
    //6. Вивести всіх викладачів факультета впорядкованих за алфавітом.
    private static boolean facultyTeachersSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            System.out.println(facultyName+" teachers sorted by name");
            sortByName(f.getTeachers(), f.getNumberOfTeachers(), true);
            return true;
        } else {
            //System.out.println("This faculty doesn't exist");
            return false;
        }
    }
    //7. Вивести всіх студентів кафедри впорядкованих за курсами.
    private static boolean specialtyStudentsSortedByCourse(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println(specialtyName+" students sorted by course");
            sortByCourse(s.getStudents(), s.getNumberOfStudents(), true);
            return true;
        } else {
            //System.out.println("This specialty doesn't exist");
            return false;
        }
    }

    //8. Вивести всіх студентів кафедри впорядкованих за алфавітом.
    private static boolean specialtyStudentsSortedByName(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println(specialtyName+" students sorted by name");
            sortByName(s.getStudents(), s.getNumberOfStudents(), true);
            return true;
        } else {
            //System.out.println("This specialty doesn't exist");
            return false;
        }
    }
    //8. Вивести всіх викладачів кафедри впорядкованих за алфавітом.
    private static boolean specialtyTeachersSortedByName(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println(specialtyName+" teachers sorted by name");
            sortByName(s.getTeachers(), s.getNumberOfTeachers(), true);
            return true;
        } else {
            //System.out.println("This specialty doesn't exist");
            return false;
        }
    }
    //9.Вивести всіх студентів кафедри вказаного курсу.
    private static boolean StudentsBySpecialtyAndYear(String specialtyName, int year) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println(specialtyName+" students on "+year+" course: ");
            int k=1;
            for (Student student:s.getStudents()){
                if (student.getYear()==year) {
                    System.out.println(k+") "+student);
                    k++;
                }
            }
            System.out.println();
            return true;
        } else {
            //System.out.println("This specialty doesn't exist");
            return false;
        }
    }
    //10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.
    private static boolean StudentsBySpecialtyAndYearSortedByName(String specialtyName, int year) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println(specialtyName+" students on "+year+" course, sorted by name: ");
            int k=0;
            for (Student student:s.getStudents()) if (student.getYear()==year) k++;
            Student[] students =  new Student[k];
            k=0;
            for (int i = 0; i<s.getStudents().length; i++) {
                if (s.getStudents()[i].getYear()==year) {
                    students[k]=s.getStudents()[i];
                    k++;
                }
            }
            sortByName(students, students.length, true);
            return true;
        } else {
            //System.out.println("This specialty doesn't exist");
            return false;
        }
    }

}
