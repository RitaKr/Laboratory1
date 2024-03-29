package University;

/**
 * Клас University.java, який містить в собі всю інформацію про університет НаУКМА, а саме:
 * кількість факультетів та кафедр, що є у ньому, з відповідною кількістю студентів,
 * що вчаться в університеті, та викладачів, що в ньому працюють
 */
public class University {
    private String universityName = "НаУКМА";
    protected static int numberOfFaculties = 2;
    protected static Faculty[] faculties;
    protected static Student[] allStudents;
    protected static Teacher[] allTeachers;
    protected static int numberOfStudents = 0;
    protected static int numberOfTeachers = 0;

    /**
     * Масив студентів кафедри "Інженерія програмного забезпечення"
     */
    private Student[] ipzStudents = {
            new Student("Трохимчук Артем Андрійович", 1, 1, "ІПЗ"),
            new Student("Красовський Андрій Олександрович", 1, 2, "ІПЗ"),
            new Student("Крижанівська Маргарита Сергіївна", 1, 3, "ІПЗ"),
            new Student("Богун Єлизавета Сергіївна", 1, 1, "ІПЗ"),
            new Student("Швець Дмитро Віталійович", 1, 2, "ІПЗ"),
            new Student("Міндюк Вікторія Олегівна", 1, 3, "ІПЗ"),
            new Student("Квятковський Андрій Вікторович", 1, 1, "ІПЗ"),
            new Student("Літвінчук Захар Вікторович", 1, 2, "ІПЗ"),

            new Student("Новак Артем Владиславович", 2, 1, "ІПЗ"),
            new Student("Назар Ірина Ігорівна", 2, 2, "ІПЗ"),
            new Student("Прохоров Олександр Денисович", 2, 3, "ІПЗ"),
            new Student("Грисюк Анастасія Олександрівна", 2, 1, "ІПЗ"),

            new Student("Смовженко Антон Олександрович", 3, 1, "ІПЗ"),
            new Student("Архипчук Богдан Олександрович", 3, 2, "ІПЗ"),
            new Student("Літвінчук Данило Вікторович", 3, 3, "ІПЗ"),

            new Student("Богута Станіслав Сергійович", 4, 1, "ІПЗ"),
    };
    /**
     * Масив студентів кафедри "Комп'ютерні науки"
     */
    private Student[] knStudents = {
            new Student("Романюк Андрій Олександрович", 1, 1, "КН"),
            new Student("Рудник Богдан Дмитрович", 1, 2, "КН"),
            new Student("Прокопчук Богдана Олександрівна", 1, 3, "КН"),
            new Student("Сичова Марія Євгенівна", 1, 1, "КН"),
            new Student("Заспа Марина Ігорівна", 1, 2, "КН"),
            new Student("Негруб Андрій Сергійович", 1, 2, "КН"),
            new Student("Сіленко Андрій Едуардович", 1, 3, "КН"),

            new Student("Тарасенко Артем Григорович", 2, 1, "КН"),
            new Student("Буділова Софія Дмитрівна", 2, 2, "КН"),
            new Student("Бойко Інна Іванівна", 2, 3, "КН"),

            new Student("Яременко Петро Всеволодович", 3, 1, "КН"),
            new Student("Стасюк Ілля Вікторович", 3, 2, "КН"),
            new Student("Іваненко Валерія Анатоліївна", 3, 3, "КН"),

            new Student("Кучерук Дарія Вікторівна", 4, 1, "КН"),
            new Student("Пономаренко Катерина Олександрівна", 4, 2, "КН"),
    };
    /**
     * Масив студентів кафедри "Економіка"
     */
    private Student[] economyStudents = {
            new Student("Думич Ірина Володимирівна", 1, 1, "Економіка"),
            new Student("Грек Тетяна Василівна", 1, 2, "Економіка"),
            new Student("Альошина Милана Ігорівна", 1, 3, "Економіка"),
            new Student("Ковальчук Анна Ігорівна", 1, 1, "Економіка"),
            new Student("Ходєєв Андрій Олександрович", 1, 2, "Економіка"),

            new Student("Безпалько Віктор Олександрович", 2, 1, "Економіка"),
            new Student("Береза Ігор Юрійович", 2, 2, "Економіка"),
            new Student("Мельник Юлія Степанівна", 2, 3, "Економіка"),
            new Student("Поліщук Сергій Сергійович", 2, 1, "Економіка"),
            new Student("Єфімова Олександра Олександрівна", 2, 2, "Економіка"),

            new Student("Шевчук Дмитро Анатолійович", 3, 1, "Економіка"),
            new Student("Шевчук Анна Володимирівна", 3, 2, "Економіка"),
            new Student("Гриневич Софія Геннадіївна", 3, 3, "Економіка"),

            new Student("Жуков Максим Олексійович", 4, 1, "Економіка"),
            new Student("Божко Катерина Сергіївна", 4, 2, "Економіка"),
    };
    /**
     * Масив студентів кафедри "Маркетинг"
     */
    private Student[] marketingStudents = {
            new Student("Захарченко Марія Юріївна", 1, 1, "Маркетинг"),
            new Student("Лобанова Софія Андріївна", 1, 2, "Маркетинг"),
            new Student("Подолян Уляна Мирославівна", 1, 3, "Маркетинг"),
            new Student("Ткач Анна Олексіївна", 1, 1, "Маркетинг"),
            new Student("Бібік Олександра Володимирівна", 1, 2, "Маркетинг"),

            new Student("Ничипорук Олександра Романівна", 2, 1, "Маркетинг"),
            new Student("Тарасенко Поліна Олександрівна", 2, 2, "Маркетинг"),
            new Student("Шевчук Анастасія Русланівна", 2, 3, "Маркетинг"),

            new Student("Гранкін Іван Олександрович", 3, 1, "Маркетинг"),
            new Student("Сошко Марина Олегівна", 3, 2, "Маркетинг"),
            new Student("Мазур Світлана Джузеппівна", 3, 3, "Маркетинг"),

            new Student("Прозоровська Вікторія Тарасівна", 4, 1, "Маркетинг"),
            new Student("Кондратьєва Світлана Володимирівна", 4, 2, "Маркетинг"),
            new Student("Миколенко Ірина Ігорівна", 4, 3, "Маркетинг"),
    };
    /**
     * Масив викладачів кафедри "Інженерія програмного забезпечення"
     */
    private Teacher[] ipzTeachers = {
            new Teacher("Пєчкурова Олена Миколаївна", new int[]{1, 2, 4}, new int[]{1, 3}, new String[]{"ІПЗ", "КН", "Економіка", "Маркетинг"},  new String[]{"ФІ","ФЕН"}),
            new Teacher("Кирієнко Оксана Валентинівна", new int[]{1, 2}, new int[]{2}, new String[]{"ІПЗ"},  new String[]{"ФІ"}),
            new Teacher("Глибовець Андрій Миколайович", new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}, new String[]{"ІПЗ"},  new String[]{"ФІ"}),
            new Teacher("Тригуб Олександр Семенович", new int[]{1}, new int[]{1, 2, 3}, new String[]{"ІПЗ", "КН"},  new String[]{"ФІ"}),
            new Teacher("Проценко Володимир Семенович", new int[]{1, 3, 4}, new int[]{2, 3}, new String[]{"ІПЗ", "КН"},  new String[]{"ФІ"}),
            new Teacher("Митник Юрій Васильович", new int[]{1, 4}, new int[]{2, 3}, new String[]{"ІПЗ"},  new String[]{"ФІ"}),
    };
    /**
     * Масив викладачів кафедри "Комп'ютерні науки"
     */
    private Teacher[] knTeachers = {
            new Teacher("Глибовець Микола Миколайович", new int[]{1, 3, 4}, new int[]{1, 2}, new String[]{"КН"},  new String[]{"ФІ"}),
            new Teacher("Пєчкурова Олена Миколаївна", new int[]{1, 2, 4}, new int[]{1, 3}, new String[]{"ІПЗ", "КН", "Економіка", "Маркетинг"},  new String[]{"ФІ","ФЕН"}),
            new Teacher("Тригуб Олександр Семенович", new int[]{1}, new int[]{1, 2, 3}, new String[]{"ІПЗ", "КН"},  new String[]{"ФІ"}),
            new Teacher("Захарійченко Юрій Олексійович", new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}, new String[]{"КН", "Маркетинг"},  new String[]{"ФІ","ФЕН"}),
            new Teacher("Проценко Володимир Семенович", new int[]{1, 3, 4}, new int[]{2, 3}, new String[]{"ІПЗ", "КН"},  new String[]{"ФІ"}),
    };
    /**
     * Масив викладачів кафедри "Економіка"
     */
    private Teacher[] economyTeachers = {
            new Teacher("Пєчкурова Олена Миколаївна", new int[]{1, 2, 4}, new int[]{1, 3}, new String[]{"ІПЗ", "КН", "Економіка", "Маркетинг"},  new String[]{"ФІ","ФЕН"}),
            new Teacher("Калиновська Оксана В'ячеславівна", new int[]{1}, new int[]{2}, new String[]{"Економіка"},  new String[]{"ФЕН"}),
            new Teacher("Гуменна Олександра Віталіївна", new int[]{2, 3, 4}, new int[]{1, 2}, new String[]{"Економіка"},  new String[]{"ФЕН"}),
    };
    /**
     * Масив викладачів кафедри "Маркетинг"
     */
    private Teacher[] marketingTeachers = {
            new Teacher("Пєчкурова Олена Миколаївна", new int[]{1, 2, 4}, new int[]{1, 3}, new String[]{"ІПЗ", "КН", "Економіка", "Маркетинг"},  new String[]{"ФІ","ФЕН"}),
            new Teacher("Захарійченко Юрій Олексійович", new int[]{1, 2}, new int[]{1, 2, 3}, new String[]{"КН", "Маркетинг"},  new String[]{"ФІ","ФЕН"}),
            new Teacher("Берданова Ольга Володимирівна", new int[]{2, 3}, new int[]{2, 3}, new String[]{"Маркетинг"},  new String[]{"ФЕН"}),
            new Teacher("Малиш Наталія Андріївна", new int[]{1, 4}, new int[]{1}, new String[]{"Маркетинг"},  new String[]{"ФЕН"}),
    };
    /**
     * Масив кафедр факультету інформатики
     */
    private Specialty[] FI = {
            new Specialty("ІПЗ", ipzStudents, ipzTeachers, "ФІ"),
            new Specialty("КН", knStudents, knTeachers, "ФІ"),
    };
    /**
     * Масив кафедр факультету економічних наук
     */
    private Specialty[] FEN = {
            new Specialty("Економіка", economyStudents, economyTeachers, "ФЕН"),
            new Specialty("Маркетинг", marketingStudents, marketingTeachers,"ФЕН"),
    };

    public University(){
        faculties = new Faculty[numberOfFaculties];
        faculties[0] = new Faculty("ФІ", FI[0], FI[1]);
        faculties[1] = new Faculty("ФЕН", FEN[0], FEN[1]);
        updateStudentsAndTeachers();
    }

    /**
     * Метод розширення масиву факультетів університету
     * @param n
     */
    protected static void extendFacultyArray(int n){
        Faculty[] extendedArr = new Faculty[n];
        for (int i=0; i<numberOfFaculties; i++) {
            extendedArr[i] = faculties[i];
        }
        numberOfFaculties = n;
        faculties = extendedArr;
    }

    /**
     * Метод, що виводить інформацію про університет у консоль
     * @return
     */
    public String toString(){
        String facultiesString="";
        for (int i=0; i<numberOfFaculties;i++){
            facultiesString+=faculties[i]+" ";
        }
        String ending="";
        if (numberOfFaculties%10>1 && numberOfFaculties%10<5 && !(numberOfFaculties>=12 && numberOfFaculties<=14)) ending="и";
        else if ((numberOfFaculties>=5 && numberOfFaculties%10!=1) || numberOfFaculties==11) ending="ів";
        return "Університет "+universityName+" має "+
                numberOfFaculties+" факультет"+ending+". Серед них: "+facultiesString;
    }

    /**
     * Метод, що повертає масив кафедр університету
     * @return масив кафедр
     */
    public static Specialty[] getAllSpecialties() {
        Specialty[] arr = new Specialty[getTotalNumberOfSpecialties()];
        for (int i=0, k=0; i<numberOfFaculties; i++){
            for (Specialty s:faculties[i].getSpecialties()){
                arr[k]=s;
                k++;
            }
        }
        return arr;
    }

    /**
     * Метод, що повертає загальну кількість кафедр
     * @return загальна кількість кафедр
     */
    public static int getTotalNumberOfSpecialties(){
        int n=0;
        for (Faculty f:faculties){
            n+=f.getNumberOfSpecialties();
        }
        return n;
    }

    /**
     * Оновлення інформації про студентів та викладачів університету
     */
    public static void updateStudentsAndTeachers(){
        numberOfStudents=0;
        numberOfTeachers=0;
        int nStudents = 0;
        int nTeachers = 0;
        for (Faculty f:faculties) {
            Specialty[] specialties = f.getSpecialties();
            for (Specialty sp : specialties) {
                numberOfStudents += sp.getNumberOfStudents();
                numberOfTeachers += sp.getNumberOfTeachers();
            }
            f.updateStudentsAndTeachers();
        }
        allStudents=new Student[numberOfStudents];
        allTeachers=new Teacher[numberOfTeachers];

        for (Faculty f:faculties) {
            Specialty[] specialties = f.getSpecialties();

            for (Specialty sp:specialties){
                Student[] students = sp.getStudents();
                for (int i = 0; i<students.length; i++) {
                    allStudents[i+nStudents]=students[i];
                }
                nStudents += sp.getNumberOfStudents();

                Teacher[] teachers = sp.getTeachers();
                for (int i = 0; i<teachers.length; i++) {
                    allTeachers[i+nTeachers]=teachers[i];
                }
                nTeachers+=sp.getNumberOfTeachers();
            }
            f.updateStudentsAndTeachers();
        }

    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }
    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }
    public Faculty[] getFaculties() {
        return faculties;
    }

    public Student[] getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    public Teacher[] getAllTeachers() {
        return allTeachers;
    }

    public void setAllTeachers(Teacher[] allTeachers) {
        this.allTeachers = allTeachers;
    }
}
