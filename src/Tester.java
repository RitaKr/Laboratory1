
import java.io.IOException;

import University.*;
public class Tester extends Methods {
    static University ukma;
    static String method;
    static String choice = "так";

    public static void main(String[] args) throws IOException {
        System.out.println("Програма має на меті змоделювати структуру університету. У якості прикладу взято НаУКМА");
        ukma = new University();
        System.out.println(ukma);
        menu();







        //1. додавання, редагування, видалення факультетів
        //addFaculty("фі");
/*
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

*/
        //System.out.println(ukma);

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
    private static void showUniversity() throws IOException {
        int ask = DataInput.getInt("Бажаєте подивитись поточну структуру університету? (1 - так, 0 - ні) ");
        /*while(!ask.equals("1")&&!ask.equals("0")){
            ask = DataInput.getString("1 - повторити, 0 - закінчити ");
        }*/
        if (ask==1) System.out.println(ukma);
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

        while(method.equals("1")){
            option1();
        }

        while(method.equals("2")){
            option2();

        }

        while(method.equals("3")){
            System.out.println("\nВи знаходитесь у пункті 3. Додати/видалити/редагувати студента/викладача до кафедри. Кого бажаєте додати/видалити/редагувати? ");
            int n = DataInput.getInt("1 - студента, 2 - викладача; повернутись до головного меню - 0 ");
                if (n == 1) {
                    option3Students();
                    //showUniversity();
                } else if (n == 2) {
                    option3Teachers();
                    //showUniversity();
                } else if (n == 0) {
                    menu();
                }

        }
        while (method.equals("4")) {
            System.out.println("\nВи знаходитесь у пункті 4. Знайти студента/викладача за ПІБ. Кого бажаєте шукати? ");
            int n = DataInput.getInt("1 - студента, 2 - викладача; повернутись до головного меню - 0 ");
            if (n == 1) {
                System.out.println("\nВи знаходитесь у пункті 4.1 Знайти студента за ПІБ ");
                String name = DataInput.getString("Уведіть ПІБ або частину імені студента, якого шукаєте: ");
                findStudentByName(name);

            } else if (n == 2) {
                System.out.println("\nВи знаходитесь у пункті 4.1 Знайти студента за ПІБ ");
                String name = DataInput.getString("Уведіть ПІБ або частину імені викладача, якого шукаєте: ");
                findTeacherByName(name);

            } else if (n == 0) {
                menu();
            }
        }
        while (method.equals("5")) {
            System.out.println("\nВи знаходитесь у пункті 5. Вивести всіх студентів впорядкованих за курсами. ");
            allStudentsSortedByCourse();
        }
        while (method.equals("6")) {
            System.out.println("\nВи знаходитесь у пункті 6. Вивести всіх студентів/викладачів факультету впорядкованих за алфавітом. ");
            int n = DataInput.getInt("1 - студенти, 2 - викладачі; повернутись до головного меню - 0 ");
            if (n == 1) {
                System.out.println("\nВи знаходитесь у пункті 6.1. Вивести всіх студентів факультету впорядкованих за алфавітом. ");
                String facultyName = DataInput.getString("Уведіть назву факультету, студентів якого бажаєте сортувати: ");
                while (!facultyStudentsSortedByName(facultyName)){
                    facultyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО факультету: ");
                }

            } else if (n == 2) {
                System.out.println("\nВи знаходитесь у пункті 6.2. Вивести всіх викладачів факультету впорядкованих за алфавітом. ");
                String facultyName = DataInput.getString("Уведіть назву факультету, викладачів якого бажаєте сортувати: ");
                while (!facultyTeachersSortedByName(facultyName)) {
                    facultyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО факультету: ");
                }

            } else if (n == 0) {
                menu();
            }
        }
        while (method.equals("7")) {
            System.out.println("\nВи знаходитесь у пункті 7. Вивести всіх студентів кафедри впорядкованих за курсами. ");
            String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте сортувати: ");
            while (!specialtyStudentsSortedByCourse(specialtyName)){
                specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри: ");
            }
            int repeat = DataInput.getInt("Повторити пункт 7? (1 - так; 0 - повернутись до головного меню) ");
            while (repeat!=0 && repeat!=1) repeat = DataInput.getInt("Введіть 0 або 1 ");
            if (repeat==0) menu();
        }
        while (method.equals("8")) {
            System.out.println("\nВи знаходитесь у пункті 8. Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом. ");

            int n = DataInput.getInt("1 - студенти, 2 - викладачі; повернутись до головного меню - 0 ");
            if (n == 1) {
                System.out.println("\nВи знаходитесь у пункті 8.1 Вивести всіх студентів кафедри впорядкованих за алфавітом. ");
                String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте сортувати: ");
                while (!specialtyStudentsSortedByName(specialtyName)){
                    specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО кафедри: ");
                }

            } else if (n == 2) {
                System.out.println("\nВи знаходитесь у пункті 8.2 Вивести всіх викладачів кафедри впорядкованих за алфавітом. ");
                String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте сортувати: ");
                while (!specialtyTeachersSortedByName(specialtyName)) {
                    specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри: ");
                }
            } else if (n == 0) {
                menu();
            }
        }
        while (method.equals("9")) {
            System.out.println("\nВи знаходитесь у пункті 9. Вивести всіх студентів кафедри вказаного курсу. ");
            String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте вивести: ");
            int year = DataInput.getInt("Уведіть курс: ");
            while (year < 1 || year > 4) {
                year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
            }
            while (!StudentsBySpecialtyAndYear(specialtyName, year)){
                specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри: ");
                year = DataInput.getInt("Уведіть курс: ");
                while (year < 1 || year > 4) {
                    year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
                }
            }
            int repeat = DataInput.getInt("Повторити пункт 9? (1 - так; 0 - повернутись до головного меню) ");
            while (repeat!=0 && repeat!=1) repeat = DataInput.getInt("Введіть 0 або 1 ");
            if (repeat==0) menu();
        }
        while (method.equals("10")) {
            System.out.println("\nВи знаходитесь у пункті 10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом. ");
            String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте сортувати: ");
            int year = DataInput.getInt("Уведіть курс: ");
            while (year < 1 || year > 4) {
                year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
            }
            while (!StudentsBySpecialtyAndYearSortedByName(specialtyName, year)){
                specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри: ");
                year = DataInput.getInt("Уведіть курс: ");
                while (year < 1 || year > 4) {
                    year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
                }
            }
            int repeat = DataInput.getInt("Повторити пункт 10? (1 - так; 0 - повернутись до головного меню) ");
            while (repeat!=0 && repeat!=1) repeat = DataInput.getInt("Введіть 0 або 1 ");
            if (repeat==0) menu();
        }
    }
    private static void option1() throws IOException {
        System.out.println("\nВи знаходитесь у пункті 1. Створити/видалити/редагувати факультет. ");
        int n = DataInput.getInt("Створити факультет - 1; видалити - 2; редагувати - 3; повернутись до головного меню - 0 ");
        if (n!=0) {
            int sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
            if (sure == 1) {
                if (n == 1) {
                    String facultyName = DataInput.getString("Уведіть назву факультету, який бажаєте створити: ");
                    while (!addFaculty(facultyName)) {
                        facultyName = DataInput.getString("Уведіть назву факультету, якого ще не існує! ");
                    }
                    ;
                    //ask("створити факультет");
                } else if (n == 2) {
                    String facultyName = DataInput.getString("Уведіть назву факультету, який бажаєте видалити: ");
                    while (!deleteFaculty(facultyName)) {
                        facultyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО факультету! ");
                    }
                    //ask("видалити факультет");
                } else if (n == 3) {
                    String facultyName = DataInput.getString("Уведіть назву факультету, яку бажаєте редагувати: ");
                    String newName = DataInput.getString("Уведіть нову назву для факультету " + facultyName + ": ");
                    while (!editFaculty(facultyName, newName)) {
                        facultyName = DataInput.getString("Уведіть назву ІСНУЮЧОГО факультету: ");
                        newName = DataInput.getString("Уведіть нову назву для факультету " + facultyName + ": ");
                    }
                    //ask("редагувати факультет");
                }
                showUniversity();
            }
        } else {
            menu();
        }
    }
    private static void option2() throws IOException {
        System.out.println("\nВи знаходитесь у пункті 2. Створити/видалити/редагувати кафедру факультета.");
        int n = DataInput.getInt("Створити кафедру - 1; видалити - 2; редагувати - 3; повернутись до головного меню - 0 ");
        if (n!=0) {
            int sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
            if (sure == 1) {
                if (n == 1) {
                    String facultyName = DataInput.getString("Уведіть назву факультету, на якому бажаєте створити кафедру: ");
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте створити: ");
                    while (!addSpecialty(specialtyName, facultyName)) {
                        facultyName = DataInput.getString("Уведіть назву факультету, на якому бажаєте створити кафедру: ");
                        specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте створити: ");
                    }
                    //ask("створити кафедру");
                } else if (n == 2) {
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте видалити: ");
                    while (!deleteSpecialty(specialtyName)) {
                        specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри, яку бажаєте видалити: ");
                    }
                    //ask("видалити кафедру");
                } else if (n == 3) {
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, назву якої бажаєте редагувати: ");
                    String newName = DataInput.getString("Уведіть нову назву кафедри: ");
                    while (!editSpecialty(specialtyName, newName)) {
                        specialtyName = DataInput.getString("Уведіть назву ІСНУЮЧОЇ кафедри, назву якої бажаєте змінити на " + newName + ": ");
                    }
                    //ask("редагувати кафедру");
                }
                showUniversity();
            }
        } else {
            menu();
        }
    }
    private static void option3Students() throws IOException {
        System.out.println("\nПункт 3.1. Додати/видалити/редагувати студента до кафедри");
        int n = DataInput.getInt("Додати студента до кафедри - 1; видалити - 2; редагувати - 3; повернутись до пункту 3 - 0 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0){
            int sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
            if (sure == 1) {
                //add student
                if (n == 1) {
                    String specialtyName = DataInput.getString("Уведіть назву спеціальності, на яку бажаєте записати студента: ");
                    String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте записати на кафедру: ");
                    int year = DataInput.getInt("На якому курсі навчається студент? Уведіть номер (1-4): ");
                    while (year < 1 || year > 4) {
                        year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
                    }
                    int group = DataInput.getInt("У якій групі вчитиметься студент? Уведіть номер (1-3)");
                    while (group < 1 || group > 3) {
                        group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3)");
                    }
                    while (!addStudent(studentName, year, group, specialtyName)) {
                        specialtyName = DataInput.getString("Уведіть назву спеціальності, на яку бажаєте записати студента: ");
                        studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте записати на кафедру: ");
                        year = DataInput.getInt("На якому курсі навчається студент? Уведіть номер (1-4): ");
                        while (year < 1 || year > 4) {
                            year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
                        }
                        group = DataInput.getInt("У якій групі вчитиметься студент? Уведіть номер (1-3) ");
                        while (group < 1 || group > 3) {
                            group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3)");
                        }
                    }
                    showUniversity();
                }
                //delete student
                else if (n == 2) {
                    String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте видалити: ");
                    while (!deleteStudent(studentName)) {
                        studentName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО студента, якого бажаєте видалити: ");
                    }
                    showUniversity();
                }
                //edit student
                else if (n==3) {
                    System.out.println("\nПункт 3.1.3. Редагування студента");
                    String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте редагувати: ");
                    option3EditStudents(studentName);
                }

            } else {
                option3Students();
            }
        }

    }
    private static void option3EditStudents(String studentName) throws IOException{
        int n = DataInput.getInt("1 - редагувати ПІБ; 2 - редагувати курс; 3 - редагувати групу; 0 - повернутись до пункту 3.1 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {
            int sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
            if (sure == 1) {
                if (n == 1) {
                    String newName = DataInput.getString("Уведіть новий ПІБ студента "+studentName+": ");
                    while (!editStudentsName(studentName, newName)) {
                        studentName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО студента: ");
                        newName = DataInput.getString("Уведіть новий ПІБ студента "+studentName+": ");
                    }
                } else if (n==2) {
                    int year = DataInput.getInt("Уведіть новий курс студента "+studentName+": ");
                    while (!editStudentsYear(studentName, year)) {
                        studentName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО студента: ");
                        year = DataInput.getInt("Уведіть новий курс студента "+studentName+": ");
                    }

                } else if (n==3) {
                    int group = DataInput.getInt("Уведіть нову групу студента "+studentName+": ");
                    while (!editStudentsGroup(studentName, group)) {
                        studentName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО студента: ");
                        group = DataInput.getInt("Уведіть нову групу студента "+studentName+": ");
                    }
                }
                showUniversity();
            } else {
                option3EditStudents(studentName);
            }
        } else {
            option3Students();
        }
    }
    private static void option3Teachers() throws IOException {
        System.out.println("\nПункт 3.2. Додати/видалити/редагувати викладача до кафедри");
        int n = DataInput.getInt("Додати викладача до кафедри - 1; видалити - 2; редагувати - 3; повернутись до пункту 3 - 0 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {
            int sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
            if (sure == 1) {
                //add student
                if (n == 1) {
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, на яку бажаєте додати викладача: ");
                    String teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте додати на кафедру: ");
                    int[] years = fillArr(4);
                    int[] groups = fillArr(3);

                    while (!addTeacher(teacherName, years, groups, specialtyName)) {
                        specialtyName = DataInput.getString("Уведіть назву кафедри, на яку бажаєте записати викладача: ");
                        teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте додати на кафедру: ");
                        years = fillArr(4);
                        groups = fillArr(3);
                    }
                    showUniversity();
                }
                //delete student
                else if (n == 2) {
                    sure = 0;
                    String teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте видалити: ");
                    while (sure == 0) {
                        int del = DataInput.getInt("Видалити викладача " + teacherName + " з університету чи тільки з певної кафедри? " +
                                "(1 - з кафедри; 2 - з університету) ");
                        sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
                        if (sure == 1) {
                            if (del == 1) {
                                String specialtyName = DataInput.getString("Уведіть назву кафедри, з якої бажаєте видалити викладача: ");
                                while (!deleteTeacherFromSpecialty(teacherName, specialtyName)) {
                                    teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте видалити: ");
                                    specialtyName = DataInput.getString("Уведіть назву кафедри, з якої бажаєте видалити викладача " + teacherName + ": ");
                                }
                            } else if (del == 2) {
                                while (!deleteTeacherCompletely(teacherName)) {
                                    teacherName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО викладача, якого бажаєте видалити: ");
                                }
                            }
                            showUniversity();
                        }
                    }
                }
                //edit student
                else if (n==3) {
                    System.out.println("\nПункт 3.2.3. Редагування викладача");
                    String teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте редагувати: ");
                    option3EditTeachers(teacherName);
                }
            } else {
                option3Teachers();
            }
        }
    }
    private static void option3EditTeachers(String teacherName) throws IOException{
        int n = DataInput.getInt("1 - редагувати ПІБ; 2 - редагувати курси; 3 - редагувати групи; 0 - повернутись до пункту 3.1 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {
            int sure = DataInput.getInt("Ви впевнені? (так - 1; скасувати поточну дію - 0) ");
            if (sure == 1) {
                if (n == 1) {
                    String newName = DataInput.getString("Уведіть новий ПІБ викладача "+teacherName+": ");
                    while (!editTeachersName(teacherName, newName)) {
                        teacherName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО викладача: ");
                        newName = DataInput.getString("Уведіть новий ПІБ викладача "+teacherName+": ");
                    }
                } else if (n==2) {
                    int[] years = fillArr(4);
                    while (!editTeachersCourses(teacherName, years)) {
                        teacherName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО викладача: ");
                        years = fillArr(4);
                    }

                } else if (n==3) {
                    int[] groups = fillArr(3);
                    while (!editTeachersGroups(teacherName, groups)) {
                        teacherName = DataInput.getString("Уведіть ПІБ ІСНУЮЧОГО викладача: ");
                        groups = fillArr(3);
                    }
                }
                showUniversity();
            } else {
                option3EditTeachers(teacherName);
            }
        } else {
            option3Teachers();
        }
    }
    private static int[] fillArr(int length) throws IOException {
        int[] arr = new int[length];
        int k=0;
        if (length==4){
            for (int i=0; i<length; i++) {
                int year = DataInput.getInt("На яких курсах викладає викладач? Уведіть номер (1-4) або 0, щоб зупинити введення курсів: ");
                while (((year < 1 || year > 4) && year!=0) || contains(arr, year)) {
                    if (year==0) break;
                    if (contains(arr, year)) year = DataInput.getInt("Ви вже додавали цей курс, введіть інший або закінчіть введення, відправивши 0 ");
                    else year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4) ");
                }

                if (year==0) break;
                else{
                    arr[i] = year;
                    k++;
                }
            }
        }
        if (length==3){
            for (int i=0; i<length; i++) {
                int group = DataInput.getInt("У яких групах викладає викладач? Уведіть номер (1-3) або 0, щоб зупинити введення груп: ");
                while (((group < 1 || group > 3) && group!=0) || contains(arr, group)) {
                    if (group==0) break;
                    if (contains(arr, group)) group = DataInput.getInt("Ви вже додавали цю групу, введіть іншу або закінчіть введення, відправивши 0 ");
                    else group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3) ");
                }

                if (group==0) break;
                else{
                    arr[i] = group;
                    k++;
                }
            }
        }
        int[] croppedArr=new int[k];
        System.arraycopy(arr, 0, croppedArr, 0, k);

        return croppedArr;
    }




    //4. Знайти студента за ПІБ
    private static void findStudentByName(String name) {
        System.out.println("Searching for students with "+name+" in their full name...");
        if (!findStudentsByNameAndShow(name)) System.out.println("Не знайдено жодного студента");
    }
    //4.Знайти викладача за ПІБ
    private static void findTeacherByName(String name) {
        System.out.println("Searching for teachers with "+name+" in their full name...");
        if (!findTeachersByNameAndShow(name)) System.out.println("no teachers found");
    }
    //4. Знайти студента за курсом.
    private static void findStudentByCourse(int year) {
        System.out.println("Searching for students who study "+year+" course...");
        if (!findStudentsByCourseAndShow(year)) System.out.println("no students found");
    }
    //4.Знайти викладача за курсом.
    private static void findTeacherByCourse(int year) {
        System.out.println("Searching for teachers who teach on "+year+" course...");
        if (!findTeachersByCourseAndShow(year)) System.out.println("no teachers found");
    }
    //4. Знайти студента за групою.
    private static void findStudentByGroup(int group) {
        System.out.println("Searching for students who study in group "+group+"...");
        if (!findStudentsByGroupAndShow(group)) System.out.println("no students found");
    }
    //4.Знайти викладача за групою.
    private static void findTeacherByGroup(int group) {
        System.out.println("Searching for teachers who teach in group "+group+"...");
        if (!findTeachersByGroupAndShow(group)) System.out.println("no teachers found");
    }

    //5. Вивести всіх студентів впорядкованих за курсами.
    private static void allStudentsSortedByCourse() {
        //System.out.println("All students sorted by course");
        if (ukma.getNumberOfStudents()==0) System.out.println("there are no students in this university");
        else sortByCourse(ukma.getAllStudents(), ukma.getNumberOfStudents(), true);
    }

    //6. Вивести всіх студентів факультета впорядкованих за алфавітом.
    private static boolean facultyStudentsSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            //System.out.println(facultyName+" students sorted by name");
            if (f.getNumberOfStudents()==0) System.out.println("there are no students on "+f.getFacultyName());
            else sortByName(f.getStudents(), f.getNumberOfStudents(), true);
            return true;
        } else {
            System.out.print("faculty "+facultyName+" doesn't exist. ");
            return false;
        }
    }
    //6. Вивести всіх викладачів факультета впорядкованих за алфавітом.
    private static boolean facultyTeachersSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            //System.out.println(facultyName+" teachers sorted by name");
            if (f.getNumberOfTeachers()==0) System.out.println("there are no teachers on "+f.getFacultyName());
            else sortByName(f.getTeachers(), f.getNumberOfTeachers(), true);
            return true;
        } else {
            System.out.print("faculty "+facultyName+" doesn't exist. ");
            return false;
        }
    }
    //7. Вивести всіх студентів кафедри впорядкованих за курсами.
    private static boolean specialtyStudentsSortedByCourse(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            //System.out.println(specialtyName+" students sorted by course");
            if (s.getNumberOfStudents()==0) System.out.println("there are no students on "+s.getSpecialtyName());
            else sortByCourse(s.getStudents(), s.getNumberOfStudents(), true);
            return true;
        } else {
            System.out.print("specialty "+specialtyName+" doesn't exist. ");
            return false;
        }
    }

    //8. Вивести всіх студентів кафедри впорядкованих за алфавітом.
    private static boolean specialtyStudentsSortedByName(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            //System.out.println(specialtyName+" students sorted by name");
            if (s.getNumberOfStudents()==0) System.out.println("there are no students on "+s.getSpecialtyName());
            else sortByName(s.getStudents(), s.getNumberOfStudents(), true);
            return true;
        } else {
            System.out.print("specialty "+specialtyName+" doesn't exist. ");
            return false;
        }
    }
    //8. Вивести всіх викладачів кафедри впорядкованих за алфавітом.
    private static boolean specialtyTeachersSortedByName(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            //System.out.println(specialtyName+" teachers sorted by name");
            if (s.getNumberOfTeachers()==0) System.out.println("there are no teachers on "+s.getSpecialtyName());
            else sortByName(s.getTeachers(), s.getNumberOfTeachers(), true);
            return true;
        } else {
            System.out.print("specialty "+specialtyName+" doesn't exist. ");
            return false;
        }
    }
    //9.Вивести всіх студентів кафедри вказаного курсу.
    private static boolean StudentsBySpecialtyAndYear(String specialtyName, int year) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            //System.out.println(specialtyName+" students on "+year+" course: ");
            int k=1;
            for (Student student:s.getStudents()){
                if (student.getYear()==year) {
                    System.out.println(k+") "+student);
                    k++;
                }
            }
            if (k==1) System.out.println("there are no student's on "+year+" course of "+s.getSpecialtyName());
            System.out.println();
            return true;
        } else {
            System.out.print("specialty "+specialtyName+" doesn't exist. ");
            return false;
        }
    }
    //10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.
    private static boolean StudentsBySpecialtyAndYearSortedByName(String specialtyName, int year) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            //System.out.println(specialtyName+" students on "+year+" course, sorted by name: ");
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
            if (k==0) System.out.println("there are no student's on "+year+" course of "+s.getSpecialtyName());
            else sortByName(students, students.length, true);
            return true;
        } else {
            System.out.print("specialty "+specialtyName+" doesn't exist. ");
            return false;
        }
    }

}
