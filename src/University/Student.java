package University;

/**
 * Клас Student.java, що наслідує клас Human.java
 * У цьому класі студенту присвоюються певні параметри, як от: рік навчання та група
 */
public class Student  extends Human {
    private int group;
    private int year;

    private String specialty;
    public Student(String name, int year, int group){
        super(name);
        this.year = year;
        this.group = group;
    }

    /**
     * Повний конструктор студента з 4-ма параметрами
     * @param name ПІБ студента
     * @param year курс
     * @param group група
     * @param specialty кафедра
     */
    public Student(String name, int year, int group, String specialty){
        super(name);
        this.year = year;
        this.group = group;
        this.specialty =specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Геттер курсу студента
     * @return рік навчання
     */
    public int getYear() {
        return year;
    }
    /**
     * Геттер групи студента
     * @return група студента
     */
    public int getGroup() {
        return group;
    }

    /**
     * Метод для виведення інформації про студента
     * @return перевизначена стрічка з класу Human.java
     */
    public String toString() {
        return super.toString()+" ("+specialty+"-"+year+", група: "+group+")";
    }
}
