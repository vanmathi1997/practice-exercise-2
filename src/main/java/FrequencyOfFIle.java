import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FrequencyOfFIle {
    public Integer checkWordFrequency(String inputPath) throws IOException {
        if(inputPath.equals(""))
            return null;
        BufferedReader bufferedReader=new BufferedReader(new FileReader(inputPath));
        int len=0;
        String st;
        while ((st=bufferedReader.readLine())!=null){
            len+=st.split(" ").length;
        }
        return len;
    }
}
