package University;
import java.util.Arrays;

import static University.University.updateStudentsAndTeachers;

public class Specialty {
    private String specialtyName;
    private int numberOfStudents;
    private Student[] students;

    private int numberOfTeachers;
    private Teacher[] teachers;
    private String faculty;

    Specialty(String name, Student[] students, Teacher[] teachers, String faculty){
        specialtyName = name;
        this.students = students;
        numberOfStudents = students.length;
        this.teachers = teachers;
        numberOfTeachers = teachers.length;
        this.faculty=faculty;
    }
    Specialty(String name, String faculty){
        specialtyName = name;
        numberOfStudents = 0;
        this.students = new Student[numberOfStudents];
        numberOfTeachers = 0;
        this.teachers = new Teacher[numberOfTeachers];
        this.faculty=faculty;
    }

    public void addStudent(String name, int year, int group){
        //System.out.println(numberOfFaculties);
        extendStudentsArray(numberOfStudents+1);
        //System.out.println(numberOfFaculties);
        students[numberOfStudents-1]=new Student(name, year, group, specialtyName);

    }
    public void addTeacher(String name, int[] years, int[] groups, String[] specialties, String[] faculties){
        //System.out.println(numberOfFaculties);
        extendTeachersArray(numberOfTeachers+1);
        //System.out.println(numberOfFaculties);
        teachers[numberOfTeachers-1]=new Teacher(name, years, groups, specialties, faculties);

    }
    private void extendStudentsArray(int n){
        Student[] extendedArr = new Student[n];
        for (int i=0; i<numberOfStudents; i++) {
            extendedArr[i] = students[i];
        }
        numberOfStudents = n;
        students = extendedArr;
        //System.out.println(Arrays.toString(students));
    }
    private void extendTeachersArray(int n){
        Teacher[] extendedArr = new Teacher[n];
        for (int i=0; i<numberOfTeachers; i++) {
            extendedArr[i] = teachers[i];
        }
        numberOfTeachers = n;
        teachers = extendedArr;
        //System.out.println(Arrays.toString(students));
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public String toString(){
        String studentsString="";
        for (int i=0; i<numberOfStudents;i++){
            studentsString+="      "+(i+1)+") "+students[i]+"\n";
        }
        String teachersString="";
        for (int i=0; i<numberOfTeachers;i++){
            teachersString+="      "+(i+1)+") "+teachers[i]+"\n";
        }
        String aboutStudents ="";
        String ending="";
        if (numberOfStudents%10>1 && numberOfStudents%10<5 && !(numberOfStudents>=12 && numberOfStudents<=14)) ending="и";
        else if ((numberOfStudents>=5 && numberOfStudents%10!=1) || numberOfStudents==11) ending="ів";
        if (numberOfStudents>0) aboutStudents = ", на якій навчається "+numberOfStudents+" студент"+ending+": \n"+ studentsString+"\n";
        else aboutStudents = ", на якій поки немає студентів\n";

        String aboutTeachers ="";

        if (numberOfTeachers%10>1 && numberOfTeachers%10<5 && !(numberOfTeachers>=12 && numberOfTeachers<=14)) ending="і";
        else if ((numberOfTeachers>=5 && numberOfTeachers%10!=1) || numberOfTeachers==11) ending="ів";
        else ending="";
        if (numberOfTeachers>0) aboutTeachers = "      Та викладає "+numberOfTeachers+" викладач"+ending+": \n"+teachersString;
        else aboutTeachers = "      Та немає викладачів\n";
        return "Спеціальність "+specialtyName+ aboutStudents+aboutTeachers;
    }
}
