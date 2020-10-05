package es.florida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        App app = new App();
        //AE1-1
        //app.sayHello();

        //AE1-2
        //app.writeNamesFromArray();
        //app.writeNamesFromList();

        //AE1-3
        //int numberToPrint = app.sumPairs(6);
        //System.out.println(numberToPrint);

        //AE1-4
        //app.writeFactorialFrom15();

        //AE1-5
        List<Integer> numbersList = Arrays.asList(5,1,4,10,9,3);
        int maxNumberFromList = app.getHighestNumber(numbersList);
        System.out.println(maxNumberFromList);

        ArrayList<Integer> numbersArray = new ArrayList<>(Arrays.asList(3, 1, 9, 4, 2));
        int maxNumberFromArray = app.getHighestNumber(numbersArray);
        System.out.println(maxNumberFromArray);

    }
}
