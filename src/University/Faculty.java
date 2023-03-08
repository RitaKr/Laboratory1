package University;

import java.util.Arrays;

public class Faculty {
    private String facultyName;
    private int numberOfSpecialties = 2;
    private int numberOfStudents;
    private int numberOfTeachers;
    private Specialty[] specialties ;
    private Student[] allStudents;
    private Teacher[] allTeachers;
    public Specialty[] getSpecialties() {
        return specialties;
    }

    public Student[] getStudents() {
        return allStudents;
    }

    public Teacher[] getTeachers() {
        return allTeachers;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setNumberOfSpecialties(int numberOfSpecialties) {
        this.numberOfSpecialties = numberOfSpecialties;
    }

    public void setSpecialties(Specialty[] specialties) {
        this.specialties = specialties;
    }

    public void setAllStudents(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    public void setAllTeachers(Teacher[] allTeachers) {
        this.allTeachers = allTeachers;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    Faculty(String name, int number){
        facultyName = name;
        numberOfSpecialties = number;
        specialties = new Specialty[numberOfSpecialties];
        updateStudentsAndTeachers();
    }
    Faculty(String name){
        facultyName = name;
        numberOfSpecialties = 0;
        specialties = new Specialty[numberOfSpecialties];
        updateStudentsAndTeachers();
    }

    Faculty(String name, Specialty spec1, Specialty spec2){
        facultyName = name;
        specialties = new Specialty[numberOfSpecialties];
        specialties[0] = spec1;
        specialties[1] = spec2;
        updateStudentsAndTeachers();

    }
    public void addSpecialty(String name){
        //System.out.println(numberOfFaculties);
        extendSpecialtiesArray(numberOfSpecialties+1);
        //System.out.println(numberOfFaculties);
        specialties[numberOfSpecialties-1]=new Specialty(name, facultyName);
        updateStudentsAndTeachers();

    }
    private void updateStudentsAndTeachers(){
        for (Specialty sp : specialties) {
            this.numberOfStudents += sp.getNumberOfStudents();
            this.numberOfTeachers += sp.getNumberOfTeachers();
        }
        updateStudents();
        updateTeachers();
    }
    private void updateStudents(){
        int n=0;
        allStudents = new Student[numberOfStudents];
        for (Specialty sp : specialties) {
            Student[] spStudents = sp.getStudents();
            for (int i = 0; i<spStudents.length; i++) {
                allStudents[i+n]=spStudents[i];
            }
            n += sp.getNumberOfStudents();
        }
    }
    private void updateTeachers(){
        int n=0;
        allTeachers = new Teacher[numberOfTeachers];
        for (Specialty sp : specialties) {
            Teacher[] spTeachers = sp.getTeachers();
            for (int i = 0; i<spTeachers.length; i++) {
                allTeachers[i+n]=spTeachers[i];
            }
            n += sp.getNumberOfTeachers();
        }
    }
    private void extendSpecialtiesArray(int n){
        Specialty[] extendedArr = new Specialty[n];
        for (int i=0; i<numberOfSpecialties; i++) {
            extendedArr[i] = specialties[i];
        }
        numberOfSpecialties = n;
        specialties = extendedArr;
        //System.out.println(Arrays.toString(specialties));
    }
    public String toString(){
        String specialtiesString="";
        for (int i=0; i<numberOfSpecialties;i++){
            specialtiesString+="  "+(i+1)+". "+specialties[i]+"\n";
        }
        String ending="ість";
        if (numberOfSpecialties%10>1 && numberOfSpecialties%10<5 && !(numberOfSpecialties>=12 && numberOfSpecialties<=14)) ending="ості";
        else if ((numberOfSpecialties>=5 && numberOfSpecialties%10!=1) || numberOfSpecialties==11) ending="остей";
        if (numberOfSpecialties>0) return "\n"+facultyName+", що має "+numberOfSpecialties+" спеціальн"+ending+": \n"+ specialtiesString;
        else  return "\n"+facultyName+", на якому поки емає жодної спеціальності\n";
    }
}
