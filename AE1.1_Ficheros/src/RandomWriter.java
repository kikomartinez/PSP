import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomWriter {

    public static void main(String[] args) throws IOException {
        write100RandomNumbers();
    }

    private static void write100RandomNumbers() throws IOException {
        File file = new File("fichero.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int)(Math.random()*100);
            printer.println(randomNumber);
        }
        long endTime = System.currentTimeMillis();
        printer.println(endTime - startTime);
        printer.close();
    }
}
