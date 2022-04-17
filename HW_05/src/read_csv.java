import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class read_csv {
    public static final String delimiter = ",";
    public static ArrayList<String[]> read(String CSVFile){
        ArrayList<String[]> namelist = new ArrayList<String[]>();
        try {
            File file = new File(CSVFile);
            FileReader fileReader = new FileReader(file,StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String[] tempArr;
            while((line = bufferedReader.readLine())!=null){
                tempArr=line.split(delimiter);
                for (String string : tempArr) {
                    System.out.println(string);
                }
                namelist.add(tempArr);
            }

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            String[] namelistArrary = namelist.toArray(new String[0]);
            return namelist;
    }
}