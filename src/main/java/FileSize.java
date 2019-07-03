import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSize {
    int count=0;
        public String displayFile() {
            try{

                BufferedReader readData=new BufferedReader(new FileReader("/home/vanmathi/IdeaProjects/practice-exercise-2/text/textfile.txt"));
                String line;
                while ((line=readData.readLine())!=null){
                   line.toUpperCase();
                    count++;
                }
                return "size of file is "+count+" line/lines";
            }
            catch (IOException io){
                return io.toString();
            }

        }

    }


