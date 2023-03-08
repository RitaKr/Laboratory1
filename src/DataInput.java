import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class DataInput {

    private static void writeText(String wr){
        if (wr == null)
            System.out.print("Введіть дані: ");
        else
            System.out.print(wr);
    }

    public static Long getLong() throws IOException {
        String s = getString();
        Long value = Long.valueOf(s);
        return value;
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }
/*
    public static Integer getInt(String wr){
        writeText(wr);
        String s = "";
        try {
            s = getString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Integer value = Integer.valueOf(s);
        return value;
    }
*/
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static String getString(String wr) throws IOException{
        writeText(wr);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    private static boolean checkIfNumber(String str) {
        boolean isNum = true;
        if ((str.charAt(0)<'0' || str.charAt(0)>'9') && str.charAt(0)!='-') isNum=false;
        if (str.charAt(0)=='-' && str.length()<2) isNum=false;
        for (int i=1; i<str.length(); i++){
            if (str.charAt(i)<'0' || str.charAt(i)>'9') isNum=false;
        }
        return isNum;
    }

    public static int getInt(String prompt) throws IOException {
        String str = DataInput.getString(prompt);
        //checking if we entered a valid number
        while (str.length()<1 || !checkIfNumber(str)) {
            str = DataInput.getString("Invalid input! Enter an integer number ");
        }
        return Integer.parseInt(str);
    }
}
