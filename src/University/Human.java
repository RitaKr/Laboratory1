package University;

/**
 * Базовий клас Human.java, що описує людину
 */
public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    /**
     * Геттер для імені
     * @return name
     */
    public String getName(){
        return name;
    }


    /**
     * Сеттер для імені
     * @param name full name
     */
    public void setName(String name) {
        this.name = Methods.normalizeCase(name);
    }


    /**
     * Перетворює масив інтів у стрічку
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
     * Перетворює масив стрічок у стрічку
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

    /**
     * Метод, що повертає ім'я людини
     * @return name
     */
    @Override
    public String toString() {
        return name;
    }
}
