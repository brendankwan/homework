import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        ArrayList<Integer> indexPosition = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i ++){
            System.out.println("Copied: " + lines.get(i));
        }





    }
}
