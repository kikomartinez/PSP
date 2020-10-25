import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReaderSumFile {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("fichero.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        ArrayList<Integer> numbersToSum = new ArrayList();

        String line;
        long startTimeRead = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            line = reader.readLine();
            numbersToSum.add(Integer.parseInt((line)));
        }
        long endTimeRead = System.currentTimeMillis();
        System.out.println("El proceso de lectura ha tardado " + (endTimeRead - startTimeRead) + "ms");
        reader.close();

        int finalSum = sumNumbers(numbersToSum);
        long startTimeSum = System.currentTimeMillis();
        long endTimeSum = System.currentTimeMillis();
        System.out.println("El proceso de suma ha tardado " + (endTimeSum - startTimeSum) + "ms");

    }

    private static int sumNumbers(ArrayList<Integer> numbers){
        return numbers.stream().mapToInt(n->n).sum();
    }
}
