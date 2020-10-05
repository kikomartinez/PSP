package es.florida;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

    public void sayHello(){
        System.out.println("Hello World");
    }

    public void writeNamesFromArray(){
        String[] names = {"Juan", "Pepe", "Sandra", "Erika", "David", "Kiko"};
        for (String name: names){
            System.out.println(name);
        }
    }

    public void writeNamesFromList(){
        List<String> names = Arrays.asList("Juan", "Pepe", "Sandra", "Erika", "David", "Kiko");
        for (String name: names) {
            System.out.println(name);
        }
    }

    public int sumPairs(int limitNumber){
        int result = 0;
        for (int i = 0; i <= limitNumber; i++) {
            if ((i % 2) == 0){
                result += i;
            }
        }
        return result;
    }

    public void writeFactorialFrom15(){
        long factorial = 1;
        for (int i = 2; i <= 15 ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

}
