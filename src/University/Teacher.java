package University;
import java.util.Arrays;

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
    public Teacher(String name, int[] years, int[] groups, String[] specialties, String[] faculties){
        super(name);
        this.years = years;
        this.groups = groups;
        this.specialties = specialties;
        this.faculties = faculties;
    }

    /**
     * Years getter
     * @return year of study
     */
    public int[] getYears() {
        return years;
    }
    /**
     * Groups getter
     * @return student's group
     */
    public int[] getGroups() {
        return groups;
    }

    /**
     * Years setter
     * @return array of courses where they teach
     */
    public void setYears(int[] years) {
        this.years = years;
    }
    /**
     * Groups setter
     * @return array of group where they teach
     */
    public void setGroups(int[] groups) {
        this.groups = groups;
    }
    /**
     * Add course to array of courses
     * @return array of courses where they teach
     */
    public void addYear(int year) {
        years = extendIntArray(years, years.length+1);
        years[years.length-1] = year;
    }
    /**
     * Add group to array of groups
     * @return array of group where they teach
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
     * Add course to array of courses
     * @return array of courses where they teach
     */
    public void addSpecialty(String specialty) {
        specialties = extendStringArray(specialties, specialties.length+1);
        specialties[specialties.length-1] = specialty;
    }
    /**
     * Add group to array of groups
     * @return array of group where they teach
     */
    public void addFaculty(String faculty) {
        faculties = extendStringArray(faculties, faculties.length+1);
        faculties[faculties.length-1] = faculty;
    }
    private int[] extendIntArray(int[] prevArr, int n){
        int[] extendedArr = new int[n];
        for (int i=0; i<prevArr.length; i++) {
            extendedArr[i] = prevArr[i];
        }
        return extendedArr;
        //System.out.println(Arrays.toString(faculties));
    }
    private String[] extendStringArray(String[] prevArr, int n){
        String[] extendedArr = new String[n];
        for (int i=0; i<prevArr.length; i++) {
            extendedArr[i] = prevArr[i];
        }
        return extendedArr;
        //System.out.println(Arrays.toString(faculties));
    }
    public String toString() {
        return super.toString()+" (курси: "+arrayToString(years)+", групи: "+arrayToString(groups) +
                ", факультети: "+arrayToString(faculties)+", спеціальності: "+arrayToString(specialties)+")";
    }
}
