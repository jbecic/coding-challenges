import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class csv {
    public static void readCsv() throws FileNotFoundException {
        String delimiter = ",";
        try {
            File file = new File("/Users/jasminbecic/Library/CloudStorage/OneDrive-Personal/Book1.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = " ";
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                System.out.println(Arrays.toString(tempArr) + tempArr.length);
                for (String tempStr: tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        readCsv();
    }
}
