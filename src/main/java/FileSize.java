import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSize {
        public static void displayFile() {
            try{
                int count=0;
                BufferedReader readData=new BufferedReader(new FileReader("/home/vanmathi/IdeaProjects/practice-exercise-2/text/textfile.txt"));
                String line;
                while ((line=readData.readLine())!=null){
                    System.out.println(line.toUpperCase());
                    count++;
                }
                System.out.println("size of file is "+count+" line/lines");
            }
            catch (IOException io){
                System.out.println("Error reading file");
            }

        }
    }


