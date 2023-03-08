package University;
public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }
    /**
     * Full name getter
     * @return name
     */
    public String getName(){
        return name;
    }



    /**
     * Full name setter
     * @param name full name
     */
    public void setName(String name) {
        this.name = Methods.normalizeCase(name);
    }


    /**
     * Converts int array to string
     * @return string with grades
     */
    public String arrayToString(int[] arr) {
        String str = "";
        for (int i=0; i<arr.length-1; i++){
            str += arr[i]+", ";
        }
        str += arr[arr.length-1];
        return str;
    }
    /**
     * Converts String array to string
     * @return string with grades
     */
    public String arrayToString(String[] arr) {
        String str = "";
        for (int i=0; i<arr.length-1; i++){
            str += arr[i]+", ";
        }
        str += arr[arr.length-1];
        return str;
    }


    public String toString() {
        return name;
    }
}
