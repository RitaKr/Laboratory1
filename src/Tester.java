
import java.io.IOException;

import University.*;

/**
 * Клас Tester.java, який наслідує клас Methods.java
 * У цьому класі можна запустити програму і подивитися на структуру університету
 */
public class Tester extends Methods {
    static University ukma;
    static String method;

    public static void main(String[] args) throws IOException {
        System.out.println("Програма має на меті змоделювати структуру університету. У якості прикладу взято НаУКМА");
        ukma = new University();
        //System.out.println(ukma);
        menu();
    }

    /**
     * Метод, що дозволяє подивитись поточну структуру університету після змін, внесених до нього
     * @throws IOException
     */
    private static void showUniversity() throws IOException {
        int ask = DataInput.getInt("Бажаєте подивитись поточну структуру університету? (1 - так, 0 - ні) ");
        while(ask!=0&&ask!=1){
            ask = DataInput.getInt("Введіть 1 або 0! ");
        }
        if (ask==1) System.out.println("\n"+ukma);
    }

    /**
     * Рекурсивний метод меню, у якому викликаються та виконуються методи від 1-го до 10-го
     * У разі, якщо користувач захоче перейти до меню, натиснувши 0, цей метод викличе сам себе
     * @throws IOException
     */
    private static void menu() throws IOException {
        System.out.println("---------------- Меню ----------------\n" +
                "1. Створити/видалити/редагувати факультет.\n" +
                "2. Створити/видалити/редагувати кафедру факультету.\n" +
                "3. Додати/видалити/редагувати студента/викладача до кафедри.\n" +
                "4. Знайти студента/викладача за ПІБ, курсом або групою.\n" +
                "5. Вивести всіх студентів впорядкованих за курсами.\n" +
                "6. Вивести всіх студентів/викладачів факультету впорядкованих за алфавітом.\n" +
                "7. Вивести всіх студентів кафедри впорядкованих за курсами.\n" +
                "8. Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом.\n" +
                "9. Вивести всіх студентів кафедри вказаного курсу.\n" +
                "10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.\n" +
                "11. Вивести поточну структуру університету.");
        method = DataInput.getString("\nОберіть номер методу, який бажаєте виконати: ");
        //1. Створити/видалити/редагувати факультет.
        while(method.equals("1")){
            option1();
        }
        //2. Створити/видалити/редагувати кафедру факультету.
        while(method.equals("2")){
            option2();
        }
        //3. Додати/видалити/редагувати студента/викладача до кафедри.
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
        //4. Знайти студента/викладача за ПІБ, курсом або групою.
        while (method.equals("4")) {
            System.out.println("\nВи знаходитесь у пункті 4. Знайти студента/викладача за ПІБ. Кого бажаєте шукати? ");
            int n = DataInput.getInt("1 - студента, 2 - викладача; повернутись до головного меню - 0 ");
            if (n == 1) {
                System.out.println("\nВи знаходитесь у пункті 4.1 Знайти студента за ПІБ ");
                String name = DataInput.getString("Уведіть ПІБ студента, якого шукаєте: ");
                findStudentByName(name);

            } else if (n == 2) {
                System.out.println("\nВи знаходитесь у пункті 4.1 Знайти студента за ПІБ ");
                String name = DataInput.getString("Уведіть ПІБ викладача, якого шукаєте: ");
                findTeacherByName(name);

            } else if (n == 0) {
                menu();
            }
        }
        //5. Вивести всіх студентів впорядкованих за курсами.
        while (method.equals("5")) {
            System.out.println("\nВи знаходитесь у пункті 5. Вивести всіх студентів впорядкованих за курсами. ");
            allStudentsSortedByCourse();
        }
        //6. Вивести всіх студентів/викладачів факультету впорядкованих за алфавітом.
        while (method.equals("6")) {
            System.out.println("\nВи знаходитесь у пункті 6. Вивести всіх студентів/викладачів факультету впорядкованих за алфавітом. Кого бажаєте вивести? ");
            int n = DataInput.getInt("1 - студентів, 2 - викладачів; повернутись до головного меню - 0 ");
            if (n == 1) {
                System.out.println("\nВи знаходитесь у пункті 6.1. Вивести всіх студентів факультету впорядкованих за алфавітом. ");
                String facultyName = DataInput.getString("Уведіть назву факультету, студентів якого бажаєте сортувати: ");
                while (!facultyStudentsSortedByName(facultyName)){
                    facultyName = DataInput.getString("Факультету "+facultyName+" не існує! Уведіть назву факультету, який вже існує: ");
                }

            } else if (n == 2) {
                System.out.println("\nВи знаходитесь у пункті 6.2. Вивести всіх викладачів факультету впорядкованих за алфавітом. ");
                String facultyName = DataInput.getString("Уведіть назву факультету, викладачів якого бажаєте сортувати: ");
                while (!facultyTeachersSortedByName(facultyName)) {
                    facultyName = DataInput.getString("Факультету "+facultyName+" не існує! Уведіть назву факультету, який вже існує: ");
                }

            } else if (n == 0) {
                menu();
            }
        }
        //7. Вивести всіх студентів кафедри впорядкованих за курсами.
        while (method.equals("7")) {
            System.out.println("\nВи знаходитесь у пункті 7. Вивести всіх студентів кафедри впорядкованих за курсами. ");
            String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте сортувати: ");
            while (!specialtyStudentsSortedByCourse(specialtyName)){
                specialtyName = DataInput.getString("Кафедри "+specialtyName+" не існує. Уведіть назву кафедри, яка вже існує: ");
            }
            int repeat = DataInput.getInt("Повторити пункт 7? (1 - так; 0 - повернутись до головного меню): ");
            while (repeat!=0 && repeat!=1) repeat = DataInput.getInt("Уведіть 1, щоби повторити та 0, щоби перейти до головного меню: ");
            if (repeat==0) menu();
        }
        //8. Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом.
        while (method.equals("8")) {
            System.out.println("\nВи знаходитесь у пункті 8. Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом. Кого бажаєте вивести? ");
            int n = DataInput.getInt("1 - студентів, 2 - викладачів; повернутись до головного меню - 0 ");
            if (n == 1) {
                System.out.println("\nВи знаходитесь у пункті 8.1 Вивести всіх студентів кафедри впорядкованих за алфавітом. ");
                String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якої бажаєте сортувати: ");
                while (!specialtyStudentsSortedByName(specialtyName)){
                    specialtyName = DataInput.getString("Кафедри "+specialtyName+" не існує. Уведіть назву кафедри, яка вже існує: ");
                }

            } else if (n == 2) {
                System.out.println("\nВи знаходитесь у пункті 8.2 Вивести всіх викладачів кафедри впорядкованих за алфавітом. ");
                String specialtyName = DataInput.getString("Уведіть назву кафедри, викладачів якої бажаєте сортувати: ");
                while (!specialtyTeachersSortedByName(specialtyName)) {
                    specialtyName = DataInput.getString("Кафедри "+specialtyName+" не існує. Уведіть назву кафедри, яка вже існує: ");
                }
            } else if (n == 0) {
                menu();
            }
        }
        //9. Вивести всіх студентів кафедри вказаного курсу.
        while (method.equals("9")) {
            System.out.println("\nВи знаходитесь у пункті 9. Вивести всіх студентів кафедри вказаного курсу. ");
            String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якої бажаєте вивести: ");
            int year = DataInput.getInt("Уведіть курс: ");
            while (year < 1 || year > 4) {
                year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
            }
            while (!StudentsBySpecialtyAndYear(specialtyName, year)){
                specialtyName = DataInput.getString("Кафедри "+specialtyName+" не існує. Уведіть назву кафедри, яка вже існує: ");
                year = DataInput.getInt("Уведіть курс: ");
                while (year < 1 || year > 4) {
                    year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
                }
            }
            int repeat = DataInput.getInt("Повторити пункт 9? (1 - так; 0 - повернутись до головного меню) ");
            while (repeat!=0 && repeat!=1) repeat = DataInput.getInt("Уведіть 1, щоби повторити та 0, щоби перейти до головного меню: ");
            if (repeat==0) menu();
        }
        //10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.
        while (method.equals("10")) {
            System.out.println("\nВи знаходитесь у пункті 10. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом. ");
            String specialtyName = DataInput.getString("Уведіть назву кафедри, студентів якого бажаєте сортувати: ");
            int year = DataInput.getInt("Уведіть курс: ");
            while (year < 1 || year > 4) {
                year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
            }
            while (!StudentsBySpecialtyAndYearSortedByName(specialtyName, year)){
                specialtyName = DataInput.getString("Кафедри "+specialtyName+" не існує. Уведіть назву кафедри, яка вже існує: ");
                year = DataInput.getInt("Уведіть курс: ");
                while (year < 1 || year > 4) {
                    year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
                }
            }
            int repeat = DataInput.getInt("Повторити пункт 10? (1 - так; 0 - повернутись до головного меню) ");
            while (repeat!=0 && repeat!=1) repeat = DataInput.getInt("Уведіть 1, щоби повторити та 0, щоби перейти до головного меню: ");
            if (repeat==0) menu();
        }
        while(method.equals("11")){
            System.out.println("\n"+ukma);
            menu();
        }
    }

    /**
     * Метод, у якому реалізована можливість створення, видалення та редагування факультету
     * @throws IOException
     */
    private static void option1() throws IOException {
        System.out.println("\nВи знаходитесь у пункті 1. Створити/видалити/редагувати факультет.");
        int n = DataInput.getInt("1 - створити факультет; 2 - видалити; 3 - редагувати; повернутись до головного меню - 0\n" +
                "Оберіть номер дії, яку бажаєте виконати:  ");
        if (n!=0) {

            if (n == 1) {
                String facultyName = DataInput.getString("Уведіть назву факультету, який бажаєте створити: ");
                int sure = DataInput.getInt("Ви впевнені, що хочете додати цей факультет? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!addFaculty(facultyName)) {
                        facultyName = DataInput.getString("Факультет із назвою " + facultyName + " вже існує! Уведіть іншу назву: ");
                    }
                    showUniversity();
                }
            } else if (n == 2) {
                String facultyName = DataInput.getString("Уведіть назву факультету, який бажаєте видалити: ");
                int sure = DataInput.getInt("Ви впевнені, що хочете видалити цей факультет? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!deleteFaculty(facultyName)) {
                        facultyName = DataInput.getString("Факультету із назвою " + facultyName + " не існує! Уведіть назву факультету, що вже існує: ");
                    }
                    showUniversity();
                }
            } else if (n == 3) {
                String facultyName = DataInput.getString("Уведіть назву факультету, яку бажаєте редагувати: ");
                String newName = DataInput.getString("Уведіть нову назву для факультету " + facultyName + ": ");
                int sure = DataInput.getInt("Ви впевнені, що хочете застосувати ці зміни? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editFaculty(facultyName, newName)) {
                        facultyName = DataInput.getString("Факультету із назвою " + facultyName + " не існує! Уведіть назву факультету, що вже існує: ");
                        newName = DataInput.getString("Уведіть нову назву для факультету " + facultyName + ": ");
                    }
                    showUniversity();
                }
            }


        } else {
            menu();
        }
    }

    /**
     * Метод, у якому реалізована можливість створення, редагування та видалення кафедри факультету
     * @throws IOException
     */
    private static void option2() throws IOException {
        System.out.println("\nВи знаходитесь у пункті 2. Створити/видалити/редагувати кафедру факультету.");
        int n = DataInput.getInt("1 - Створити кафедру; 2 - видалити; 3 - редагувати; повернутись до головного меню - 0\n" +
                "Оберіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {

            if (n == 1) {
                String facultyName = DataInput.getString("Уведіть назву факультету, на якому бажаєте створити кафедру: ");
                String specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте створити: ");
                int sure = DataInput.getInt("Ви впевнені, що хочете додати цю кафедру? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!addSpecialty(specialtyName, facultyName)) {
                        System.out.println("Факультету " + facultyName + " не існує або кафедра з назвою " + specialtyName + " вже існує! Введіть коректні дані!");
                        facultyName = DataInput.getString("Уведіть назву факультету, на якому бажаєте створити кафедру: ");
                        specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте створити: ");
                    }
                    showUniversity();
                }
            } else if (n == 2) {
                String specialtyName = DataInput.getString("Уведіть назву кафедри, яку бажаєте видалити: ");
                int sure = DataInput.getInt("Ви впевнені, що хочете видалити цю кафедру? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!deleteSpecialty(specialtyName)) {
                        specialtyName = DataInput.getString("Кафедри " + specialtyName + " не існує. Уведіть назву кафедри, яка вже існує: ");
                    }
                    showUniversity();
                }
            } else if (n == 3) {
                String specialtyName = DataInput.getString("Уведіть назву кафедри, назву якої бажаєте редагувати: ");
                String newName = DataInput.getString("Уведіть нову назву кафедри: ");
                int sure = DataInput.getInt("Ви впевнені, що хочете застосувати ці зміни? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editSpecialty(specialtyName, newName)) {
                        specialtyName = DataInput.getString("Кафедри " + specialtyName + " не існує. Уведіть назву кафедри, яка вже існує, щоби змінити її на " + newName + ": ");
                    }
                    showUniversity();
                }
            }

        } else {
            menu();
        }
    }

    /**
     * Метод для додавання, видалення та редагування студента певної кафедри
     * У ньому, своєю чергою, викликається метод option3EditStudents, зроблений окремо для редагування ПІБ, курсу, групи студентів
     * @throws IOException
     */
    private static void option3Students() throws IOException {
        System.out.println("\nПункт 3.1. Додати/видалити/редагувати студента до кафедри.");
        int n = DataInput.getInt("1 - додати студента до кафедри; 2 - видалити; 3 - редагувати; 0 - повернутись до пункту 3\n" +
                "Оберіть номер дії, яку бажаєте виконати: ");
        if (n!=0){
            //add student
            if (n == 1) {
                System.out.println("\nПункт 3.1.1. Додавання студента до кафедри");
                String specialtyName = DataInput.getString("Уведіть назву спеціальності, на яку бажаєте записати студента: ");
                String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте записати на кафедру: ");
                int year = DataInput.getInt("На якому курсі навчається студент? Уведіть номер (1-4): ");
                while (year < 1 || year > 4) {
                    year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
                }
                int group = DataInput.getInt("У якій групі вчитиметься студент? Уведіть номер (1-3): ");
                while (group < 1 || group > 3) {
                    group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3): ");
                }
                int sure = DataInput.getInt("Ви впевнені, що хочете додати цього студента? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!addStudent(studentName, year, group, specialtyName)) {
                        System.out.println("Кафедри " + specialtyName + " не існує або студент із іменем " + studentName + " уже існує! Уведіть коректні дані!");
                        specialtyName = DataInput.getString("Уведіть назву спеціальності, на яку бажаєте записати студента: ");
                        studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте записати на кафедру: ");
                        year = DataInput.getInt("На якому курсі навчається студент? Уведіть номер (1-4): ");
                        while (year < 1 || year > 4) {
                            year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
                        }
                        group = DataInput.getInt("У якій групі вчитиметься студент? Уведіть номер (1-3): ");
                        while (group < 1 || group > 3) {
                            group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3): ");
                        }
                    }
                    showUniversity();
                } else {
                    option3Students();
                }
            }
            //delete student
            else if (n == 2) {
                System.out.println("\nПункт 3.1.2. Видалення студента з кафедри");
                String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте відрахувати: ");
                int sure = DataInput.getInt("Ви впевнені, що хочете відрахувати цього студента? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!deleteStudent(studentName)) {
                        studentName = DataInput.getString("Студента " + studentName + " не існує! Уведіть ім'я справжнього студента: ");
                    }
                    showUniversity();
                } else {
                    option3Students();
                }
            }
            //edit student
            else if (n==3) {
                System.out.println("\nПункт 3.1.3. Редагування студента");
                String studentName = DataInput.getString("Уведіть ПІБ студента, якого бажаєте редагувати: ");
                option3EditStudents(studentName);
            }

        }
    }

    /**
     * Метод, зроблений окремо для редагування ПІБ, курсу, групи студентів
     * @param studentName ПІБ студента
     * @throws IOException
     */
    private static void option3EditStudents(String studentName) throws IOException{
        int n = DataInput.getInt("1 - редагувати ПІБ; 2 - редагувати курс; 3 - редагувати групу; 0 - повернутись до пункту 3.1 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {
            if (n == 1) {
                String newName = DataInput.getString("Уведіть новий ПІБ студента "+studentName+": ");
                int sure = DataInput.getInt("Ви впевнені, що хочете змінити ім'я цього студента? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editStudentsName(studentName, newName)) {
                        studentName = DataInput.getString("Студента з іменем " + studentName + " не існує! Уведіть ПІБ справжнього студента: ");
                        newName = DataInput.getString("Уведіть новий ПІБ студента " + studentName + ": ");
                    }
                    showUniversity();
                } else {
                    option3EditStudents(studentName);
                }
            } else if (n==2) {
                int year = DataInput.getInt("Уведіть новий курс студента "+studentName+": ");
                int sure = DataInput.getInt("Ви впевнені, що хочете змінити курс цього студента? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editStudentsYear(studentName, year)) {
                        studentName = DataInput.getString("Студента з іменем " + studentName + " не існує! Уведіть ПІБ справжнього студента: ");
                        year = DataInput.getInt("Уведіть новий курс студента " + studentName + ": ");
                    }
                    showUniversity();
                } else {
                    option3EditStudents(studentName);
                }

            } else if (n==3) {
                int group = DataInput.getInt("Уведіть нову групу студента "+studentName+": ");
                int sure = DataInput.getInt("Ви впевнені, що хочете змінити групу цього студента? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editStudentsGroup(studentName, group)) {
                        studentName = DataInput.getString("Студента з іменем " + studentName + " не існує! Уведіть ПІБ справжнього студента: ");
                        group = DataInput.getInt("Уведіть нову групу студента " + studentName + ": ");
                    }
                    showUniversity();
                } else {
                    option3EditStudents(studentName);
                }
            }
        } else {
            option3Students();
        }

    }

    /**
     * Метод для додавання, видалення та редагування викладача певної кафедри
     * У цьому методі міститься також окремий метод для редагування ПІБ, курсів та груп викладача
     * @throws IOException
     */
    private static void option3Teachers() throws IOException {
        System.out.println("\nПункт 3.2. Додати/видалити/редагувати викладача до кафедри");
        int n = DataInput.getInt("1 - додати викладача до кафедри; 2 - видалити; 3 - редагувати; 0 - повернутись до пункту 3 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {
                //додати викладача
                if (n == 1) {
                    String specialtyName = DataInput.getString("Уведіть назву кафедри, на яку бажаєте додати викладача: ");
                    String teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте додати на кафедру: ");
                    int[] years = fillArr(4);
                    int[] groups = fillArr(3);
                    int sure = DataInput.getInt("Ви впевнені, що хочете додати цього викладача? (1 - так; 0 - скасувати поточну дію): ");
                    if (sure == 1) {
                        while (!addTeacher(teacherName, years, groups, specialtyName)) {
                            System.out.println("Кафедри " + specialtyName + " не існує, або викладач з іменем " + teacherName + " вже є на цій кафедрі. " +
                                    "Введіть коректні дані! ");
                            specialtyName = DataInput.getString("Уведіть назву кафедри, на яку бажаєте записати викладача: ");
                            teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте додати на кафедру: ");
                            years = fillArr(4);
                            groups = fillArr(3);
                        }
                        showUniversity();
                    } else {
                        option3Teachers();
                    }
                }
                //видалити викладача
                else if (n == 2) {
                    String teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте видалити: ");
                    int sure = DataInput.getInt("Ви впевнені, що хочете видалити цього викладача? (1 - так; 0 - скасувати поточну дію): ");
                    if (sure == 1) {
                        sure = 0;
                        while (sure == 0) {
                            int del = DataInput.getInt("Видалити викладача " + teacherName + " з університету чи тільки з певної кафедри? " +
                                "(1 - з кафедри; 2 - з університету) ");
                            if (del == 1) {
                                String specialtyName = DataInput.getString("Уведіть назву кафедри, з якої бажаєте видалити викладача: ");
                                sure = DataInput.getInt("Ви впевнені, що хочете видалити викладача з кафедри "+specialtyName+"? (1 - так; 0 - скасувати поточну дію; 2 - скасувати видалення): ");
                                if (sure == 1) {
                                    while (!deleteTeacherFromSpecialty(teacherName, specialtyName)) {
                                        System.out.println("Викладача з іменем " + teacherName + " не існує, або він не викладає на кафедрі " + specialtyName + " (або цієї кафедри взагалі не існує). " +
                                                "Введіть коректні дані! ");
                                        teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте видалити: ");
                                        specialtyName = DataInput.getString("Уведіть назву кафедри, з якої бажаєте видалити викладача " + teacherName + ": ");
                                    }
                                    showUniversity();
                                } else if (sure==2){
                                    option3Teachers();
                                }
                            } else if (del == 2) {
                                sure = DataInput.getInt("Ви впевнені, що хочете видалити викладача з університету? (1 - так; 0 - скасувати поточну дію; 2 - скасувати видалення): ");
                                if (sure == 1) {
                                    while (!deleteTeacherCompletely(teacherName)) {
                                        teacherName = DataInput.getString("Викладача " + teacherName + " не існує! Уведіть коректне ім'я: ");
                                    }
                                    showUniversity();
                                } else if (sure==2) {
                                    option3Teachers();
                                }
                            }
                        }
                    } else {
                        option3Teachers();
                    }
                }
                //редагувати викладача
                else if (n==3) {
                    System.out.println("\nПункт 3.2.3. Редагування викладача");
                    String teacherName = DataInput.getString("Уведіть ПІБ викладача, якого бажаєте редагувати: ");
                    option3EditTeachers(teacherName);
                }

        }
    }

    /**
     * Метод для редагування ПІБ, курсів та груп викладача
     * @param teacherName ПІБ викладача
     * @throws IOException
     */
    private static void option3EditTeachers(String teacherName) throws IOException{
        int n = DataInput.getInt("1 - редагувати ПІБ; 2 - редагувати курси; 3 - редагувати групи; 0 - повернутись до пункту 3.2 \n" +
                "Уведіть номер дії, яку бажаєте виконати: ");
        if (n!=0) {
            if (n == 1) {
                String newName = DataInput.getString("Уведіть новий ПІБ викладача "+teacherName+": ");
                int sure = DataInput.getInt("Ви впевнені, що хочете змінити ім'я цього викладача? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editTeachersName(teacherName, newName)) {
                        teacherName = DataInput.getString("Викладача " + teacherName + " не існує! Уведіть коректне ім'я: ");
                        newName = DataInput.getString("Уведіть новий ПІБ викладача " + teacherName + ": ");
                    }
                    showUniversity();
                } else {
                    option3EditTeachers(teacherName);
                }
            } else if (n==2) {
                int[] years = fillArr(4);
                int sure = DataInput.getInt("Ви впевнені, що хочете змінити курси цього викладача? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editTeachersCourses(teacherName, years)) {
                        teacherName = DataInput.getString("Викладача " + teacherName + " не існує! Уведіть коректне ім'я: ");
                        years = fillArr(4);
                    }
                    showUniversity();
                } else {
                    option3EditTeachers(teacherName);
                }

            } else if (n==3) {
                int[] groups = fillArr(3);
                int sure = DataInput.getInt("Ви впевнені, що хочете змінити групи цього викладача? (1 - так; 0 - скасувати поточну дію): ");
                if (sure == 1) {
                    while (!editTeachersGroups(teacherName, groups)) {
                        teacherName = DataInput.getString("Викладача " + teacherName + " не існує! Уведіть коректне ім'я: ");
                        groups = fillArr(3);
                    }
                    showUniversity();
                } else {
                    option3EditTeachers(teacherName);
                }
            }

        } else {
            option3Teachers();
        }
    }

    /**
     * Метод, який записує в масив курсів та груп їх рівно стільки, скільки введе користувач
     * @param length довжина масиву
     * @return croppedArr
     * @throws IOException
     */
    private static int[] fillArr(int length) throws IOException {
        int[] arr = new int[length];
        int k=0;
        if (length==4){
            for (int i=0; i<length; i++) {
                int year = DataInput.getInt("На яких курсах викладає викладач? Уведіть номер (1-4) або 0, щоби зупинити введення: ");
                while (((year < 1 || year > 4) && year!=0) || contains(arr, year)) {
                    if (year==0) break;
                    if (contains(arr, year)) year = DataInput.getInt("Ви вже додавали цей курс! Уведіть інший номер курсу або натисніть 0, щоби завершити введення: ");
                    else year = DataInput.getInt("Неправильне значення! Уведіть значення курсу у межах (1-4): ");
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
                int group = DataInput.getInt("У яких групах викладає викладач? Уведіть номер (1-3) або 0, щоб зупинити введення: ");
                while (((group < 1 || group > 3) && group!=0) || contains(arr, group)) {
                    if (group==0) break;
                    if (contains(arr, group)) group = DataInput.getInt("Ви вже додавали цю групу! Уведіть інший номер групи або натисніть 0, щоби зупинити введення: ");
                    else group = DataInput.getInt("Неправильне значення! Уведіть значення групи у межах (1-3): ");
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

    /**
     * Метод для знаходження студента за ПІБ
     * @param name ПІБ студента
     */
    private static void findStudentByName(String name) {
        System.out.println("Результат пошуку студента за ім'ям "+name+":");
        if (!findStudentsByNameAndShow(name)) System.out.println("Співпадінь не знайдено");
    }

    /**
     * Метод для знаходження викладача за ПІБ
     * @param name ПІБ викладача
     */
    private static void findTeacherByName(String name) {
        System.out.println("Результат пошуку викладача за ім'ям "+name+":");
        if (!findTeachersByNameAndShow(name)) System.out.println("Співпадінь не знайдено");
    }

    /**
     * Метод для виведення всіх студентів впорядкованих за курсами.
     */
    private static void allStudentsSortedByCourse() {
        System.out.println("Ось список всіх студентів, впорядкованих за курсами: ");
        if (ukma.getNumberOfStudents()==0) System.out.println("В університеті немає студентів");
        else sortByCourse(ukma.getAllStudents(), ukma.getNumberOfStudents(), true);
    }

    /**
     * Метод виведення всіх студентів факультету впорядкованих за алфавітом.
     * @param facultyName назва факультету
     * @return true, якщо студентів впорядковано та false, якщо факультету не існує
     */
    private static boolean facultyStudentsSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            System.out.println("Студенти факультету "+facultyName+" впорядковані за алфавітом: ");
            if (f.getNumberOfStudents()==0) System.out.println("На факультеті "+f.getFacultyName()+" немає студентів");
            else sortByName(f.getStudents(), f.getNumberOfStudents(), true);
            return true;
        } else {
            //System.out.print("Факультету "+facultyName+" не існує!");
            return false;
        }
    }

    /**
     * Метод виведення всіх викладачів факультету впорядкованих за алфавітом.
     * @param facultyName назва факультету
     * @return true, якщо викладачів впорядковано та false, якщо факультету не існує
     */
    private static boolean facultyTeachersSortedByName(String facultyName) {
        Faculty f = findFaculty(facultyName);
        if (f!=null) {
            System.out.println("Викладачі факультету "+facultyName+" впорядковані за алфавітом: ");
            if (f.getNumberOfTeachers()==0) System.out.println("На факультеті "+f.getFacultyName()+" немає викладачів");
            else sortByName(f.getTeachers(), f.getNumberOfTeachers(), true);
            return true;
        } else {
            //System.out.print("Факультету "+facultyName+" не існує!");
            return false;
        }
    }

    /**
     * Метод виведення всіх студентів кафедри впорядкованих за курсами.
     * @param specialtyName назва кафедри
     * @return true, якщо студентів кафедри впорядковано та false, якщо кафедри не існує
     */
    private static boolean specialtyStudentsSortedByCourse(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println("Студенти кафедри "+specialtyName+" впорядковані за курсом:");
            if (s.getNumberOfStudents()==0) System.out.println("На кафедрі "+s.getSpecialtyName()+" немає студентів");
            else sortByCourse(s.getStudents(), s.getNumberOfStudents(), true);
            return true;
        } else {
            //System.out.print("Кафедри "+specialtyName+" не існує!");
            return false;
        }
    }

    /**
     * Метод виведення всіх студентів кафедри впорядкованих за алфавітом.
     * @param specialtyName назва кафедри
     * @return true, якщо студентів впорядковано та false, якщо кафедри не існує
     */
    private static boolean specialtyStudentsSortedByName(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println("Студенти кафедри "+specialtyName+" впорядковані за алфавітом: ");
            if (s.getNumberOfStudents()==0) System.out.println("На кафедрі "+s.getSpecialtyName()+" немає студентів");
            else sortByName(s.getStudents(), s.getNumberOfStudents(), true);
            return true;
        } else {
            //System.out.print("Кафедри "+specialtyName+" не існує!");
            return false;
        }
    }

    /**
     * Метод виведення всіх викладачів кафедри впорядкованих за алфавітом.
     * @param specialtyName назва кафедри
     * @return true, якщо викладачів впорядковано та false, якщо кафедри не існує
     */
    private static boolean specialtyTeachersSortedByName(String specialtyName) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println("Викладачі кафедри "+specialtyName+" впорядковані за алфавітом: ");
            if (s.getNumberOfTeachers()==0) System.out.println("На кафедрі "+s.getSpecialtyName()+" немає викладачів");
            else sortByName(s.getTeachers(), s.getNumberOfTeachers(), true);
            return true;
        } else {
            //System.out.print("Кафедри "+specialtyName+" не існує!");
            return false;
        }
    }

    /**
     * Метод виведення всіх студентів кафедри вказаного курсу.
     * @param specialtyName назва кафедри
     * @param year курс
     * @return true, якщо студентів виведено та false, якщо кафедри не існує
     */
    private static boolean StudentsBySpecialtyAndYear(String specialtyName, int year) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println("Студенти кафедри "+specialtyName+"  "+year+" року навчання: ");
            int k=1;
            for (Student student:s.getStudents()){
                if (student.getYear()==year) {
                    System.out.println(k+") "+student);
                    k++;
                }
            }
            if (k==1) System.out.println("Студентів кафедри "+s.getSpecialtyName()+" "+year+" року навчання не існує");
            System.out.println();
            return true;
        } else {
            //System.out.print("Кафедри "+specialtyName+" не існує!");
            return false;
        }
    }

    /**
     * Метод виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.
     * @param specialtyName назва кафедри
     * @param year курс
     * @return true, якщо студентів виведено та false, якщо кафедри не існує
     */
    private static boolean StudentsBySpecialtyAndYearSortedByName(String specialtyName, int year) {
        Specialty s = findSpecialty(specialtyName);
        if (s!=null) {
            System.out.println("Студенти кафедри "+specialtyName+" "+year+" року навчання впорядковані за алфавітом: ");
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
            if (k==0) System.out.println("Студентів кафедри "+s.getSpecialtyName()+" "+year+" року навчання не існує");
            else sortByName(students, students.length, true);
            return true;
        } else {
            //System.out.print("Кафедри "+specialtyName+" не існує!");
            return false;
        }
    }

}
