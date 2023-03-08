package University;
import java.util.Arrays;

public class Methods extends University{
    /**
     * Sorting Students by course (both smaller to greater and vise versa)
     * @param allStudents array of students
     * @param length length of array
     * @param smallerToGreater sorting mode (true - smaller to greater, false - greater to smaller)
     */
    public static void sortByCourse(Student[] allStudents, int length, boolean smallerToGreater) {
        if (length > 1) { //sort as long as there is something to sort
            if (smallerToGreater) { //sorting from smaller to greater
                for (int i = 0; i < length - 1; i++) {  //going through unsorted grades
                    if (allStudents[i].getYear() > allStudents[i + 1].getYear()) { //checking if grades are in order (left is smaller), if not, swap them
                        Student temp = allStudents[i];
                        allStudents[i] = allStudents[i + 1];
                        allStudents[i + 1] = temp;
                    }
                }
            } else { //sorting from greater to smaller
                for (int i = 0; i < length - 1; i++) {  //going through unsorted grades
                    if (allStudents[i].getYear() < allStudents[i + 1].getYear()) { //checking if grades are in order (left is greater), if not, swap them
                        Student temp = allStudents[i];
                        allStudents[i] = allStudents[i + 1];
                        allStudents[i + 1] = temp;
                    }
                }
            }

            sortByCourse(allStudents, length - 1, smallerToGreater); //one pass done, proceed to the next
        } else {
            showStudentsArr(allStudents);
        }
    }
    /**
     * Sorting Students/Teachers by names (both smaller to greater and vise versa)
     * @param allHumans array of students
     * @param length length of array
     * @param smallerToGreater sorting mode (true - smaller to greater, false - greater to smaller)
     */
    public static void sortByName(Student[] allHumans, int length, boolean smallerToGreater) {
        if (length > 1) { //sort as long as there is something to sort
            if (smallerToGreater) { //sorting from smaller to greater
                for (int i = 0; i < length - 1; i++) {  //going through unsorted names
                    String leftName = allHumans[i].getName();//getting name of current left array student
                    int leftNameLength = leftName.length();
                    String rightName = allHumans[i + 1].getName();//getting name of current right array student
                    int rightNameLength = rightName.length();
                    int minNameLength = Math.min(leftNameLength, rightNameLength);//defining smaller name length

                    boolean sorted = false;
                    int j = 0;
                    while (j < minNameLength && !sorted) {
                        //checking if students are in order (left's name is smaller), if not, swap them
                        //System.out.println(leftName.charAt(j)+" "+rightName.charAt(j));
                        //System.out.println((int)leftName.charAt(j)+" "+(int)rightName.charAt(j));
                        if ((leftName.charAt(j)=='Є' && rightName.charAt(j)<='Е') ||
                                (leftName.charAt(j)=='є' && rightName.charAt(j)<='е') ||
                                (leftName.charAt(j)=='І' && rightName.charAt(j)<='И') ||
                                (leftName.charAt(j)=='і' && rightName.charAt(j)<='и') ||
                                (leftName.charAt(j)=='Ї' && (rightName.charAt(j)<='И' || rightName.charAt(j)=='І')) ||
                                (leftName.charAt(j)=='ї' && (rightName.charAt(j)<='и' || rightName.charAt(j)=='і')) ||
                                (rightName.charAt(j)=='Є' && leftName.charAt(j)>='Ж') ||
                                (rightName.charAt(j)=='є' && leftName.charAt(j)>='ж') ||
                                (rightName.charAt(j)=='І' && (leftName.charAt(j)>='Й' || leftName.charAt(j)=='Ї')) ||
                                (rightName.charAt(j)=='і' && (leftName.charAt(j)>='й' || leftName.charAt(j)=='ї')) ||
                                (rightName.charAt(j)=='Ї' && (leftName.charAt(j)>='И' || leftName.charAt(j)=='І')) ||
                                (rightName.charAt(j)=='ї' && (leftName.charAt(j)>='и' || leftName.charAt(j)=='і')) ||
                                leftName.charAt(j) > rightName.charAt(j)) {//comparing first letters of names of same-index elements of right and left arrays
                            Student temp = allHumans[i];
                            allHumans[i] = allHumans[i + 1];
                            allHumans[i + 1] = temp;
                            sorted = true;

                        }
                        else if (leftName.charAt(j) == rightName.charAt(j)) { //if letters are equal, lets compare next letter of name
                            j++;
                        } else {
                            sorted = true;
                        }
                    }
                    if (!sorted) {
                        //if names are equal or one contains another
                        if (leftNameLength <= rightNameLength) {//put left one if we sort a-z, and it's shorter or equal
                            Student temp = allHumans[i];
                            allHumans[i] = allHumans[i + 1];
                            allHumans[i + 1] = temp;
                        }

                    }

                }
            }
            sortByName(allHumans, length - 1, smallerToGreater); //one pass done, proceed to the next
        } else {
            showStudentsArr(allHumans);
        }
    }
    /**
     * Sorting Students/Teachers by names (both smaller to greater and vise versa)
     * @param allHumans array of students
     * @param length length of array
     * @param smallerToGreater sorting mode (true - smaller to greater, false - greater to smaller)
     */
    public static void sortByName(Teacher[] allHumans, int length, boolean smallerToGreater) {
        if (length > 1) { //sort as long as there is something to sort
            if (smallerToGreater) { //sorting from smaller to greater
                for (int i = 0; i < length - 1; i++) {  //going through unsorted names
                    String leftName = allHumans[i].getName();//getting name of current left array student
                    int leftNameLength = leftName.length();
                    String rightName = allHumans[i + 1].getName();//getting name of current right array student
                    int rightNameLength = rightName.length();
                    int minNameLength = Math.min(leftNameLength, rightNameLength);//defining smaller name length

                    boolean sorted = false;
                    int j = 0;
                    while (j < minNameLength && !sorted) {
                        //checking if students are in order (left's name is smaller), if not, swap them
                        //System.out.println(leftName.charAt(j)+" "+rightName.charAt(j));
                        //System.out.println((int)leftName.charAt(j)+" "+(int)rightName.charAt(j));
                        if ((leftName.charAt(j)=='Є' && rightName.charAt(j)<='Е') ||
                                (leftName.charAt(j)=='є' && rightName.charAt(j)<='е') ||
                                (leftName.charAt(j)=='І' && rightName.charAt(j)<='И') ||
                                (leftName.charAt(j)=='і' && rightName.charAt(j)<='и') ||
                                (leftName.charAt(j)=='Ї' && (rightName.charAt(j)<='И' || rightName.charAt(j)=='І')) ||
                                (leftName.charAt(j)=='ї' && (rightName.charAt(j)<='и' || rightName.charAt(j)=='і')) ||
                                (rightName.charAt(j)=='Є' && leftName.charAt(j)>='Ж') ||
                                (rightName.charAt(j)=='є' && leftName.charAt(j)>='ж') ||
                                (rightName.charAt(j)=='І' && (leftName.charAt(j)>='Й' || leftName.charAt(j)=='Ї')) ||
                                (rightName.charAt(j)=='і' && (leftName.charAt(j)>='й' || leftName.charAt(j)=='ї')) ||
                                (rightName.charAt(j)=='Ї' && (leftName.charAt(j)>='И' || leftName.charAt(j)=='І')) ||
                                (rightName.charAt(j)=='ї' && (leftName.charAt(j)>='и' || leftName.charAt(j)=='і')) ||
                                leftName.charAt(j) > rightName.charAt(j)) {//comparing first letters of names of same-index elements of right and left arrays
                            Teacher temp = allHumans[i];
                            allHumans[i] = allHumans[i + 1];
                            allHumans[i + 1] = temp;
                            sorted = true;

                        }
                        else if (leftName.charAt(j) == rightName.charAt(j)) { //if letters are equal, lets compare next letter of name
                            j++;
                        } else {
                            sorted = true;
                        }
                    }
                    if (!sorted) {
                        //if names are equal or one contains another
                        if (leftNameLength <= rightNameLength) {//put left one if we sort a-z, and it's shorter or equal
                            Teacher temp = allHumans[i];
                            allHumans[i] = allHumans[i + 1];
                            allHumans[i + 1] = temp;
                        }

                    }

                }
            }
            sortByName(allHumans, length - 1, smallerToGreater); //one pass done, proceed to the next
        } else {
            showTeachersArr(allHumans);
        }
    }

    public static void showStudentsArr(Student[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println((i+1) + ") " + arr[i]);

        }
        System.out.println();
    }
    public static void showTeachersArr(Teacher[] arr){
        Teacher[] localArr = Arrays.copyOf(arr, arr.length);
        int k=1;
        for (int i=0; i<localArr.length-1; i++){
            if (!localArr[i].getName().equals(localArr[i+1].getName())) {
                System.out.println((k) + ") " + localArr[i]);
                k++;
            } else {
               /* for (int g:localArr[1].getGroups()) {
                    if (!contains(localArr[i+1].getGroups(), g)) {
                        localArr[i+1].addGroup(g);
                    }
                }
                for (int c:localArr[i].getYears()) {
                    if (!contains(localArr[i+1].getYears(), c)) {
                        localArr[i+1].addYear(c);
                    }
                }
                for (String f:localArr[i].getFaculties()) {
                    if (!contains(localArr[i+1].getFaculties(), f)) {
                        localArr[i+1].addFaculty(f);
                    }
                }
                for (String s:localArr[i].getSpecialties()) {
                    if (!contains(localArr[i+1].getSpecialties(), s)) {
                        localArr[i+1].addSpecialty(s);
                    }
                }*/
            }
        }
        System.out.println((k) + ") " + localArr[localArr.length-1]);
        System.out.println();
    }



    public static Faculty findFaculty(String facultyName) {
        Faculty faculty = null;
        for (Faculty f:faculties) {
            if (f.getFacultyName().equalsIgnoreCase(facultyName)) {
                faculty = f;
                break;
            }
        }
        return faculty;
    }
    public static Specialty findSpecialty(String specialtyName) {
        Specialty specialty = null;
        for (Faculty f:faculties) {
            Specialty[] specialties = f.getSpecialties();
            for (Specialty s:specialties) {
                if (s.getSpecialtyName().equalsIgnoreCase(specialtyName)) {
                    specialty = s;
                    break;
                }
            }

        }
        return specialty;
    }
    public static Student findStudentByFullName(String name) {
        Student person = null;
        for (Student student:allStudents) {
            if (student.getName().equalsIgnoreCase(name)){
                person = student;
            }
        }
        return person;
    }
    public static Teacher findTeacherByFullName(String name) {
        Teacher person = null;
        for (Teacher teacher:allTeachers) {
            if (teacher.getName().equalsIgnoreCase(normalizeCase(name))){
                person = teacher;
            }
        }
        return person;
    }


    public static boolean editFaculty(String facultyName, String newName) {
        Faculty faculty = findFaculty(facultyName);
        if (faculty!=null) {
            faculty.setFacultyName(newName);
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this faculty doesn't exist");
            return false;
        }

    }
    public static boolean deleteFaculty(String facultyName) {
        Faculty faculty = findFaculty(facultyName);
        if (faculty!=null) {
            Faculty[] arr_new = deleteArrItem(faculties, facultyName);
            numberOfFaculties = arr_new.length;
            faculties = arr_new;
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this faculty doesn't exist");
            return false;
        }

    }

    public static boolean addSpecialty(String specialtyName, String facultyName) {
        Faculty faculty = findFaculty(facultyName);
        if (faculty!=null) {
            faculty.addSpecialty(specialtyName);
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this faculty doesn't exist");
            return false;
        }
    }
    public static boolean editSpecialty(String specialtyName, String newName) {
        Specialty specialty = findSpecialty(specialtyName);
        if (specialty!=null) {
            specialty.setSpecialtyName(newName);
            updateStudentsAndTeachers();
            return true;
        } else {
            //System.out.println("this specialty doesn't exist");
            return false;
        }
    }
    public static boolean deleteSpecialty(String specialtyName) {
        Specialty specialty = findSpecialty(specialtyName);
        if (specialty!=null) {
            Faculty faculty = findFaculty(specialty.getFaculty());
            Specialty[] arr_new = deleteArrItem(faculty.getSpecialties(), specialtyName);
            faculty.setNumberOfSpecialties(arr_new.length);
            faculty.setSpecialties(arr_new);
            updateStudentsAndTeachers();
            return true;
        } else {
            //System.out.println("this specialty doesn't exist");
            return false;
        }

    }

    public static boolean addStudent(String studentName, int year, int group, String specialtyName) {
        Specialty specialty = findSpecialty(specialtyName);
        if (specialty!=null) {
            //Faculty faculty = findFaculty(specialty.getFaculty());
            specialty.addStudent(studentName,year, group);
            updateStudentsAndTeachers();
            return true;
        } else {
            //System.out.println("this specialty doesn't exist");
            return false;
        }
    }
    public static boolean editStudentsName(String studentName, String newName) {
        Student student = findStudentByFullName(studentName);
        if (student!=null) {
            student.setName(normalizeCase(newName));
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this student doesn't exist");
            return false;
        }
    }
    public static boolean editStudentsYear(String studentName, int year) {
        Student student = findStudentByFullName(studentName);
        if (student!=null) {
            student.setYear(year);
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this student doesn't exist");
            return false;
        }
    }
    public static boolean editStudentsGroup(String studentName, int group) {
        Student student = findStudentByFullName(studentName);
        if (student!=null) {
            student.setGroup(group);
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this student doesn't exist");
            return false;
        }
    }
    public static boolean deleteStudent(String studentName) {
        Student student = findStudentByFullName(studentName);
        if (student!=null) {
            Specialty specialty = findSpecialty(student.getSpecialty());
            //Faculty faculty = findFaculty(specialty.getFaculty());
            Student[] arr_new = deleteArrItem(specialty.getStudents(), studentName);
            specialty.setNumberOfStudents(arr_new.length);
            specialty.setStudents(arr_new);
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this student doesn't exist");
            return false;
        }
    }
    public static boolean addTeacher(String teacherName, int[] years, int[] groups, String specialtyName) {
        Specialty specialty = findSpecialty(specialtyName);
        if (specialty!=null) {
            if (contains(specialty.getTeachers(), teacherName)) {
                System.out.println("This teacher is already on this specialty");
                return false;
            } else {
                String[] specs = new String[]{specialty.getSpecialtyName()};
                String[] facs = new String[]{specialty.getFaculty()};
                if (contains(allTeachers, teacherName)) {
                    for (Faculty f:faculties) {
                        Specialty[] specialties = f.getSpecialties();
                        for (Specialty sp : specialties) {
                            Teacher[] teachers = sp.getTeachers();
                            for (Teacher t : teachers) {
                                if (t.getName().equalsIgnoreCase(teacherName)) {
                                    for (int y: years){
                                        if (!contains(t.getYears(), y)) t.addYear(y);
                                    }
                                    years = t.getYears();
                                    for (int g: groups){
                                        if (!contains(t.getGroups(), g)) t.addGroup(g);
                                    }
                                    groups = t.getGroups();
                                    if (!contains(t.getSpecialties(), specialtyName)) t.addSpecialty(specialty.getSpecialtyName());
                                    specs = t.getSpecialties();
                                    if (!contains(t.getFaculties(), specialty.getFaculty())) t.addFaculty(specialty.getFaculty());
                                    facs = t.getFaculties();
                                }

                            }
                        }
                    }
                }
                //Faculty faculty = findFaculty(specialty.getFaculty());
                specialty.addTeacher(teacherName, years, groups, specs, facs);
                updateStudentsAndTeachers();
                return true;
            }
        } else {
            //System.out.println("this specialty doesn't exist");
            return false;
        }
    }
    public static boolean deleteTeacherCompletely(String teacherName) {
        Teacher teacher = findTeacherByFullName(teacherName);
        if (teacher!=null) {
            for (Faculty f:faculties) {
                Specialty[] specialties = f.getSpecialties();
                for (Specialty sp : specialties) {
                    Teacher[] teachers = sp.getTeachers();
                    if (teachers.length>0 && contains(teachers, teacherName)) {
                        Teacher[] arr_new = deleteArrItem(teachers, teacherName);
                        sp.setNumberOfTeachers(arr_new.length);
                        sp.setTeachers(arr_new);
                    }
                }
            }
            updateStudentsAndTeachers();
            return true;
        } else {
            //System.out.println("this specialty doesn't exist");
            return false;
        }
    }
    public static boolean deleteTeacherFromSpecialty(String teacherName, String specialtyName) {
        Teacher teacher = findTeacherByFullName(teacherName);
        Specialty specialty = findSpecialty(specialtyName);
        if (teacher!=null && specialty!=null && contains(specialty.getTeachers(), teacherName)) {
            Faculty faculty = findFaculty(specialty.getFaculty());
            //deleting teacher from this specialty's teachers array
            Teacher[] arr_new = deleteArrItem(specialty.getTeachers(), teacherName);
            specialty.setNumberOfTeachers(arr_new.length);
            specialty.setTeachers(arr_new);
            //updating data for all duplicates of this teacher on other specialties arrays
            for (Faculty f:faculties) {
                Specialty[] specialties = f.getSpecialties();
                for (Specialty sp : specialties) {
                    Teacher[] teachers = sp.getTeachers();
                    for (Teacher t:teachers) {
                        if (t.getName().equalsIgnoreCase(teacherName)){
                            //deleting specialty from teacher's specialties
                            t.setSpecialties(deleteArrItem(t.getSpecialties(), specialty.getSpecialtyName()));
                            //deleting faculty from teacher's faculties if they are not on this faculty anymore
                            boolean remainsOnFaculty = false;
                            for (String teacherSpStr:t.getSpecialties()){
                                for (Specialty allSp:faculty.getSpecialties()){
                                    if (allSp.getSpecialtyName().equalsIgnoreCase(teacherSpStr)){
                                        remainsOnFaculty = true;
                                    }
                                }
                            }
                            if (!remainsOnFaculty) t.setFaculties(deleteArrItem(t.getFaculties(), specialty.getFaculty()));
                        }
                    }
                }
            }
            updateStudentsAndTeachers();
            return true;
        } else {
            System.out.println("this specialty or student doesn't exist, or this teacher doesn't work on this specialty");
            return false;
        }
    }
    private static String[] deleteArrItem(String[] arr, String item) {
        String[] arr_new = new String[arr.length-1];
        for(int i=0, k=0; i<arr.length; i++){
            if(!arr[i].equalsIgnoreCase(item)){
                arr_new[k]=arr[i];
                if (k<arr.length-2) k++;
            }
        }
        return arr_new;
    }
    private static Student[] deleteArrItem(Student[] arr, String item) {
        Student[] arr_new = new Student[arr.length-1];
        for(int i=0, k=0; i<arr.length; i++){
            if(!arr[i].getName().equalsIgnoreCase(item)){
                arr_new[k]=arr[i];
                k++;
            }
        }
        return arr_new;
    }
    private static Teacher[] deleteArrItem(Teacher[] arr, String item) {
        Teacher[] arr_new = new Teacher[arr.length-1];
        for(int i=0, k=0; i<arr.length; i++){
            if(!arr[i].getName().equalsIgnoreCase(item)){
                    arr_new[k] = arr[i];
                    if (k<arr.length-2) k++;
            }
        }
        return arr_new;
    }
    private static Specialty[] deleteArrItem(Specialty[] arr, String item) {
        Specialty[] arr_new = new Specialty[arr.length-1];
        for(int i=0, k=0; i<arr.length; i++){
            if(!arr[i].getSpecialtyName().equalsIgnoreCase(item)){
                arr_new[k]=arr[i];
                k++;
            }
        }
        return arr_new;
    }
    private static Faculty[] deleteArrItem(Faculty[] arr, String item) {
        Faculty[] arr_new = new Faculty[arr.length-1];
        for(int i=0, k=0; i<arr.length; i++){
            if(!arr[i].getFacultyName().equalsIgnoreCase(item)){
                arr_new[k]=arr[i];
                k++;
            }
        }
        return arr_new;
    }


    public static boolean findStudentsByNameAndShow(String name) {
        Student person = null;
        for (Student student:allStudents) {
            if (student.getName().contains(normalizeCase(name))){
                person = student;
                System.out.println(person);
            }
            System.out.println();
        }
        //System.out.println("no matches found");
        return person != null;
    }
    public static boolean findTeachersByNameAndShow(String name) {
        Teacher person = null;
        for (Teacher teacher:allTeachers) {
            if (teacher.getName().contains(normalizeCase(name))){
                if (person==null || !person.getName().equals(teacher.getName())) {
                    person = teacher;
                    System.out.println(person);
                }
            }
            System.out.println();
        }
        //System.out.println("no matches found");
        return person != null;

    }

    public static boolean findStudentsByCourseAndShow(int year) {
        Human person = null;
        for (Student student:allStudents) {
            if (student.getYear()==year){
                person = student;
                System.out.println(person);
            }
        }
        return person != null;
    }
    public static boolean findTeachersByCourseAndShow(int year) {
        Human person = null;
        for (Teacher teacher:allTeachers) {
            if (contains(teacher.getYears(), year)){
                person = teacher;
                System.out.println(person);
            }
        }
        return person != null;
    }
    public static boolean findStudentsByGroupAndShow(int group) {
        Human person = null;
        for (Student student:allStudents) {
            if (student.getGroup()==group){
                person = student;
                System.out.println(person);
            }
        }
        //System.out.println("no matches found");
        return person != null;

    }
    public static boolean findTeachersByGroupAndShow(int group) {
        Human person = null;
        for (Teacher teacher:allTeachers) {
            if (contains(teacher.getGroups(), group)){
                person = teacher;
                System.out.println(person);
            }

        }
        //System.out.println("no matches found");
        return person != null;

    }

    private static boolean contains(int[] arr, int item){
        boolean contains = false;
        for (int i:arr) if (i==item) {
            contains = true;
            break;
        }
        return contains;
    }
    private static boolean contains(String[] arr, String item){
        boolean contains = false;
        for (String i:arr) if (i.equals(item)) {
            contains = true;
            break;
        }
        return contains;
    }
    private static boolean contains(Teacher[] arr, String item){
        boolean contains = false;
        for (Teacher i:arr) if (i.getName().equalsIgnoreCase(item)) {
            contains = true;
            break;
        }
        return contains;
    }
    //making every first letter after space capital (if it's not)
    public static String normalizeCase(String string) {
        String res="";
        char ch=string.charAt(0);
        if (ch>='а' && ch<='я') {
            ch = (char) (ch-'а'+'А');
        } else if(ch=='і' || ch=='ї'  || ch=='є'){
            ch = (char) (ch-'є'+'Є');
        }
        res+=ch;
        for (int i=1; i<string.length(); i++) {
            if (string.charAt(i-1)==' ' && (string.charAt(i)>='а' && string.charAt(i)<='я')){
                res+=(char)(string.charAt(i)-'а'+'А');
            } else if (string.charAt(i-1)==' ' && (string.charAt(i)=='і' || string.charAt(i)=='ї'  || string.charAt(i)=='є')){
                res+=(char)(string.charAt(i)-'є'+'Є');
            }else {
                res+=string.charAt(i);
            }

        }
        return res;
    }
}
