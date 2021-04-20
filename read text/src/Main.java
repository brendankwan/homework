import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public

    public static void main(String[] args) throws IOException {
        ArrayList<String> sentence = new ArrayList<>();
        ArrayList<Integer> indexPosition = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            sentence.add(line);
        }
        br.close();
        for (int i = 0; i < sentence.size(); i ++){
            System.out.println(sentence.get(i));
        }








    }
}
