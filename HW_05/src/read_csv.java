import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class read_csv {
    public static final String delimiter = ",";
    public static List<Object[]> read(String CSVFile){
        List<Object[]> namelist = new ArrayList<>();
        try {
            File file = new File(CSVFile);
            FileReader fileReader = new FileReader(file,StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String[] tempArr;
//            String name;
//            String code;
            while((line = bufferedReader.readLine())!=null){
                tempArr=line.split(delimiter);
                String name = tempArr[1];
                String code = tempArr[0];
                namelist.add(new Object[] {name,code});
            }

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//            String[] namelistArrary = namelist.toArray(new String[0]);
            return namelist;
    }
}