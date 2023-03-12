package University;

/**
 * Клас Teacher.java, що наслідує клас Human.java
 * У цьому класі викладачу присвоюються певні параметри, як от: факультет та кафедра, на яких він викладає
 */
public class Teacher extends Human {
    private int[] groups;
    private int[] years;
    private String[] specialties;
    private String[] faculties;
    public Teacher(String name, int[] years, int[] groups){
        super(name);
        this.years = years;
        this.groups = groups;
    }

    /**
     * Повний конструктор викладача з 5-ма параметрами
     * @param name ПІБ викладача
     * @param years курси, на яких викладає
     * @param groups групи, у яких викладає
     * @param specialties кафедри, на яких веде групи викладач
     * @param faculties факультети, на яких викладач працює
     */
    public Teacher(String name, int[] years, int[] groups, String[] specialties, String[] faculties){
        super(name);
        this.years = years;
        this.groups = groups;
        this.specialties = specialties;
        this.faculties = faculties;
    }

    /**
     * Геттер курсів викладача
     * @return курси
     */
    public int[] getYears() {
        return years;
    }
    /**
     * Геттер груп викладача
     * @return групи
     */
    public int[] getGroups() {
        return groups;
    }

    /**
     * Сеттер курсів викладача
     * @return масив курсів викладача
     */
    public void setYears(int[] years) {
        this.years = years;
    }
    /**
     * Groups setter
     * @return масив груп викладача
     */
    public void setGroups(int[] groups) {
        this.groups = groups;
    }
    /**
     * Метод додавання курсів до масиву курсів викладача
     * @return масив курсів викладача
     */
    public void addYear(int year) {
        years = extendIntArray(years, years.length+1);
        years[years.length-1] = year;
    }
    /**
     * Метод додавання груп до масиву груп викладача
     * @return масив груп викладача
     */
    public void addGroup(int group) {
        groups = extendIntArray(groups, groups.length+1);
        groups[groups.length-1] = group;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String[] specialties) {
        this.specialties = specialties;
    }

    public void setFaculties(String[] faculties) {
        this.faculties = faculties;
    }

    public String[] getFaculties() {
        return faculties;
    }
    /**
     * Метод додавання кафедр до масиву кафедр
     * @return масив кафедр, на яких працює викладач
     */
    public void addSpecialty(String specialty) {
        specialties = extendStringArray(specialties, specialties.length+1);
        specialties[specialties.length-1] = specialty;
    }
    /**
     * Метод додавання факультетів до масиву факультетів
     * @return масив факультетів, на яких працює викладач
     */
    public void addFaculty(String faculty) {
        faculties = extendStringArray(faculties, faculties.length+1);
        faculties[faculties.length-1] = faculty;
    }

    /**
     * Метод розширення цілочисельних масивів
     * @param prevArr
     * @param n
     * @return розширений масив
     */
    private int[] extendIntArray(int[] prevArr, int n){
        int[] extendedArr = new int[n];
        for (int i=0; i<prevArr.length; i++) {
            extendedArr[i] = prevArr[i];
        }
        return extendedArr;
    }

    /**
     * Метод розширення масиву стрічок
     * @param prevArr
     * @param n
     * @return розширений масив
     */
    private String[] extendStringArray(String[] prevArr, int n){
        String[] extendedArr = new String[n];
        for (int i=0; i<prevArr.length; i++) {
            extendedArr[i] = prevArr[i];
        }
        return extendedArr;
    }

    /**
     * Метод виведення інформації про те, на яких факультетах, кафедрах працює викладач,
     * а також на яких курсах та у яких групах він викладає
     * @return перевизначена стрічка з класу Human.java
     */
    public String toString() {
        return super.toString()+" (курси: "+arrayToString(years)+", групи: "+arrayToString(groups) +
                ", факультети: "+arrayToString(faculties)+", спеціальності: "+arrayToString(specialties)+")";
    }
}
