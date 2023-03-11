
import java.io.IOException;

import University.*;
public class Tester extends Methods {
    static University ukma;
    static String method;
    static String choice = "так";

    public static void main(String[] args) throws IOException {
        System.out.println("Програма має на меті змоделювати структуру університету. У якості прикладу взято НаУКМА");
        ukma = new University();

        while(choice.equals("так")){
            menu();
            while(method.equals("1")){
                System.out.println("Ви обрали 1. Створити/видалити/редагувати факультет. ");
                int n = DataInput.getInt("Створити факультет - 1; видалити - 2; редагувати - 3; повернутись до головного меню - 0 ");
                    if(n==1){
                        String facultyName = DataInput.getString("Уведіть назву факультету, який бажаєте створити: ");
                        while (!addFaculty(facultyName)){
                            facultyName = DataInput.getString("Уведіть назву факультету, якого ще не існує! ");
                        };
                        //ask("створити факультет");
                    }
                    if(n==2){
                        String facultyName = DataInput.getString("Уведіть назву факультету, який бажаєте видалити: ");
                        while (!deleteFaculty(facultyName)) {
                            facultyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО факультету! ");
                        }
                        //ask("видалити факультет");
                    }
                    if(n==3){
                        String facultyName = DataInput.getString("Уведіть назву факультету, яку бажаєте редагувати: ");
                        String newName = DataInput.getString("Уведіть нову назву для факультету "+facultyName+": ");
                        while (!editFaculty(facultyName, newName)) {
                            facultyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО факультету, який бажаєте змінити на "+facultyName+": ");
                        }
                        //ask("редагувати факультет");
                    }
                   repeatMethod("1. Створити/видалити/редагувати факультет");
            }

            while(method.equals("2")){
                System.out.println("Ви обрали 2. Створити/видалити/редагувати кафедру факультета.");
                int n = DataInput.getInt("Створити кафедру - 1; видалити - 2; редагувати - 3; повернутись до головного меню - 0 ");
                if(n==1){
                    String facultyName = DataInput.getString("Уведіть назву факультету, на якому бажаєте створити кафедру: ");
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте створити: ");
                    while (!addSpecialty(specialtyName, facultyName)) {
                        facultyName = DataInput.getString("Уведіть назву факультету, на якому бажаєте створити кафедру: ");
                        specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте створити: ");
                    }
                    //ask("створити кафедру");
                } else if(n==2){
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте видалити: ");
                    while (!deleteSpecialty(specialtyName)){
                        specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри, яку бажаєте видалити: ");
                    }
                    //ask("видалити кафедру");
                } else if(n==3){
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, назву якої бажаєте редагувати: ");
                    String newName = DataInput.getString("Уведіть нову назву кафедри: ");
                    while (!editSpecialty(specialtyName, newName)){
                        specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри, назву якої бажаєте змінити на "+newName+": ");
                    }
                    //ask("редагувати кафедру");
                } else {
                    menu();
                }
                repeatMethod("2. Створити/видалити/редагувати кафедру факультету");
            }

            while(method.equals("3")){
                System.out.println("Ви обрали 3. Додати/видалити/редагувати студента/викладача до кафедри.");
                int n = DataInput.getInt("кого бажаєте додати/видалити/редагувати? 1 - студента, 2 - викладача; повернутись до головного меню - 0 ");
                if(n==1){
                    int a = DataInput.getInt("Додати студента до кафедри - 1; видалити - 2; редагувати - 3; повернутись до головного меню - 0 \n" +
                            "Уведіть номер дії, яку бажаєте виконати: ");
                    if(a==1){
                        String specialtyName = DataInput.getString("Уведіть назву спеціальності, на яку бажаєте записати студента: ");
                        String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте записати на кафедру: ");
                        int year = DataInput.getInt("На якому курсі навчається студент? Уведіть номер (1 - 4): ");
                        while(year<1||year>4){
                            year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4)");
                        }
                        int group = DataInput.getInt("У якій групі вчитиметься студент? Уведіть номер (1-3)");
                        while(group<1||group>3){
                            group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3)");
                        }
                        while (!addStudent(studentName,year,group,specialtyName)){
                            specialtyName = DataInput.getString("Уведіть назву спеціальності, на яку бажаєте записати студента: ");
                            studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте записати на кафедру: ");
                            year = DataInput.getInt("На якому курсі навчається студент? Уведіть номер (1 - 4): ");
                            while(year<1||year>4){
                                year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4)");
                            }
                            group = DataInput.getInt("У якій групі вчитиметься студент? Уведіть номер (1-3)");
                            while(group<1||group>3){
                                group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3)");
                            }
                        }
                        //ask("додати студента до кафедри");
                    } else if(a==2){
                        String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте видалити: ");
                        while (!deleteStudent(studentName)){
                            studentName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО студента, якого бажаєте видалити: ");
                        }
                        //ask("видалити студента");
                    } else if(a==0){
                        menu();
                    }
                } else if (n==0) {
                    menu();
                }
            }

        }




        //1. додавання, редагування, видалення факультетів
        //addFaculty("фі");

        addFaculty("ФГН");
        addFaculty("ФПрН");
        editFaculty("ФГН", "ФСНСТ");
        deleteFaculty("ФПрН");

        //2
        addSpecialty("ПМ", "ФІ");
        addSpecialty("Соціологія", "ФСНСТ");
        addSpecialty("Журналістика", "ФСНСТ");
        addSpecialty("Соц робота", "ФСНСТ");
        addSpecialty("Міжнародні відносини", "ФСНСТ");
        addSpecialty("Право", "ФСНСТ");
        editSpecialty("Соц робота", "Психологія");
        deleteSpecialty("Право");

        //3.1
        addStudent("Зубець Олена Сергіївна", 1, 2, "Міжнародні відносини");
        deleteStudent("Прохоров Олександр Денисович");
        editStudentsName("трохимчук артем андрійович", "трохимчук артемчик андрійович");
        editStudentsYear("Красовський Андрій Олександрович", 4);
        editStudentsGroup("Крижанівська Маргарита Сергіївна", 2);

        //3.2
        addTeacher("Калиновська Оксана В'ячеславівна", new int[] {2, 3}, new int[] {2, 3}, "ІПЗ");
        addTeacher("Ренчка Інна Євгеніївна", new int[] {1}, new int[] {1, 2}, "КН");
        addTeacher("Ренчка Інна Євгеніївна", new int[] {1}, new int[] {1, 2}, "міжнародні відносини");
        deleteTeacherFromSpecialty("Пєчкурова Олена Миколаївна", "Економіка");
        deleteTeacherFromSpecialty("Пєчкурова Олена Миколаївна", "маркетинг");
        deleteTeacherFromSpecialty("Ренчка Інна Євгеніївна", "Міжнародні відносини");
        deleteTeacherCompletely("Калиновська Оксана В'ячеславівна");
        editTeachersName("Проценко Володимир Семенович", "Проц Володимир Семенович");
        editTeachersCourses("Пєчкурова Олена Миколаївна", new int[]{1, 4});
        editTeachersGroups("Пєчкурова Олена Миколаївна", new int[]{1, 2});

        //4
        findStudentByName("шевчук");
        findTeacherByName("Пєчкурова");
        findTeacherByName("Глибовець");

        //5
        allStudentsSortedByCourse();
        //6
        facultyStudentsSortedByName("Фі");
        facultyStudentsSortedByName("фснст");
        facultyTeachersSortedByName("фі");
        facultyTeachersSortedByName("фснст");

        //7

        specialtyStudentsSortedByCourse("ІПЗ");
        specialtyStudentsSortedByCourse("кн");
        specialtyStudentsSortedByCourse("економіка");
        specialtyStudentsSortedByCourse("соціологія");
        //8
        specialtyStudentsSortedByName("ІПЗ");
        specialtyTeachersSortedByName("ІПЗ");
        specialtyStudentsSortedByName("кн");
        specialtyTeachersSortedByName("кн");

        specialtyStudentsSortedByName("економіка");
        specialtyTeachersSortedByName("економіка");
        specialtyStudentsSortedByName("психологія");
        specialtyTeachersSortedByName("психологія");

        //9
        StudentsBySpecialtyAndYear("ІПЗ", 5);
        StudentsBySpecialtyAndYear("ІПЗ", 1);
        //10
        StudentsBySpecialtyAndYearSortedByName("ІПЗ", 4);
        StudentsBySpecialtyAndYearSortedByName("кн", 2);


        System.out.println(ukma);

/*
        String spec = DataInput.getString("enter speciality: ");
        while (!specialtyStudentsSortedByName(spec)) {
            spec = DataInput.getString("This specialty doesn't exist. Enter existing speciality: ");
        }
*/

    /*for(int i=1025; i<1152; i++){
            System.out.print((char)i+" ");
        }*/
    }

    private static void ask(String methodName)throws IOException{
        String ask = DataInput.getString("Бажаєте "+methodName+" ще раз? (1 - так, 0 - ні) ");
        while(!ask.equals("1")&&!ask.equals("0")){
            ask = DataInput.getString("1 - повторити, 0 - закінчити ");
        }
    }

    private static void repeatMethod(String methodName)throws IOException{
        method = DataInput.getString("Бажаєте повторити метод "+methodName+"? (1 - так, 0 - ні) ");
        while(!method.equals("1")&&!method.equals("0")){
            method = DataInput.getString("1 - повторити, 0 - перейти до меню ");
        }
        if(method.equals("0")){
            menu();
        }
    }

    private static void menu() throws IOException {
        System.out.println("---------------- Меню ----------------\n" +
                "1. Створити/видалити/редагувати факультет.\n" +
                "2. Створити/видалити/редагувати кафедру факультета.\n" +
                "3. Додати/видалити/редагувати студента/викладача до кафедри.\n" +
                "4. Знайти студента/викладача за ПІБ, курсом або групою.\n" +
                "5. Вивести всіх студентів впорядкованих за курсами.\n" +
                "6. Вивести всіх студентів/викладачів факультета впорядкованих за алфавітом.\n" +
                "7. Вивести всіх студентів кафедри впорядкованих за курсами.\n" +
                "8. Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом.\n" +
                "9. Вивести всіх студентів кафедри вказаного курсу.\n" +
                "10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.");
        method = DataInput.getString("\nОберіть номер методу, який бажаєте виконати: ");
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
        if (ukma.getNumberOfStudents()==0) System.out.println("there are no students in this university"+"\n");
        else sortByCourse(ukma.getAllStudents(), ukma.getNumberOfStudents(), true);
    }

    //6. Вивести всіх студентів факультета впорядкованих за алфавітом.
    private static boolean facultyStudentsSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            System.out.println(facultyName+" students sorted by name");
            if (f.getNumberOfStudents()==0) System.out.println("there are no students on "+f.getFacultyName()+"\n");
            else sortByName(f.getStudents(), f.getNumberOfStudents(), true);
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
            if (f.getNumberOfTeachers()==0) System.out.println("there are no teachers on "+f.getFacultyName()+"\n");
            else sortByName(f.getTeachers(), f.getNumberOfTeachers(), true);
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
            if (s.getNumberOfStudents()==0) System.out.println("there are no students on "+s.getSpecialtyName()+"\n");
            else sortByCourse(s.getStudents(), s.getNumberOfStudents(), true);
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
            if (s.getNumberOfStudents()==0) System.out.println("there are no students on "+s.getSpecialtyName()+"\n");
            else sortByName(s.getStudents(), s.getNumberOfStudents(), true);
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
            if (s.getNumberOfTeachers()==0) System.out.println("there are no teachers on "+s.getSpecialtyName()+"\n");
            else sortByName(s.getTeachers(), s.getNumberOfTeachers(), true);
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
            if (k==1) System.out.println("there are no student's on "+year+" course of "+s.getSpecialtyName()+"\n");
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
            if (k==0) System.out.println("there are no student's on "+year+" course of "+s.getSpecialtyName()+"\n");
            else sortByName(students, students.length, true);
            return true;
        } else {
            //System.out.println("This specialty doesn't exist");
            return false;
        }
    }

}
