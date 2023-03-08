package University;
public class Student  extends Human {
    private int group;
    private int year;

    private String specialty;
    public Student(String name, int year, int group){
        super(name);
        this.year = year;
        this.group = group;

    }
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
     * Year getter
     * @return year of study
     */
    public int getYear() {
        return year;
    }
    /**
     * Group getter
     * @return student's group
     */
    public int getGroup() {
        return group;
    }

    public String toString() {
        return super.toString()+" ("+specialty+"-"+year+", група: "+group+")";
    }
}
