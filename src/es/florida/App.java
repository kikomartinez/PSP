package es.florida;

import java.util.*;

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

    public int getHighestNumber (Collection<Integer> numbers){
        int maxNumber = Collections.max(numbers);
        return  maxNumber;
    }

    public int inverse5NumbersAndSum(){
        Scanner scanner = new Scanner(System.in);
        int[] fiveNumbers = new int[5];

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Escriba un número: ");
            int numberToAdd = scanner.nextInt();
            fiveNumbers[i] = numberToAdd;
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(fiveNumbers[i]);
        }

        return Arrays.stream(fiveNumbers).sum();
    }

    public void calculateSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del desarrollador:");
        String name = scanner.nextLine();
        System.out.println("Escriba los años de experiencia como desarrollador:");
        int yearsWorking = scanner.nextInt();

        if (yearsWorking < 1){
            System.out.println(name +  " es Desarrollador Junior L1 - 15000-18000");
        }
        else if (yearsWorking < 3){
            System.out.println(name +  " es Desarrollador Junior L2 - 18000-22000");
        }
        else if (yearsWorking < 6){
            System.out.println(name +  " es Desarrollador Senior L1 - 22000-28000");
        }
        else if (yearsWorking < 9){
            System.out.println(name +  " es Desarrollador Senior L2 - 28000-36000");
        }
        else{
            System.out.println(name +  " es Analista / Arquitecto. Salario a convenir en base a rol");
        }
    }

    public void calculatePrimeNumbers(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el número del extremo inferior:");
        int lowerEnd = scanner.nextInt();
        System.out.println("Escribe el número del extremo superior:");
        int higherEnd = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        for (int i = lowerEnd; i < higherEnd; i++) {
            printIfPrime(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("La ejecución ha tardado " + (endTime - startTime) + " milisegundos");
    }

    private void printIfPrime(int numberToCheck){
        if (checkIfPrime(numberToCheck) == true){
            System.out.println(numberToCheck + " es primo");
        }
        else{
            System.out.println(numberToCheck + " no es primo");
        }
    }

    private boolean checkIfPrime(int numberToCheck){
        if (numberToCheck % 2 == 0 && numberToCheck != 2){
            return false;
        }
        for (int i = 3; i*i <= numberToCheck ; i+=2) {
            if (numberToCheck % i == 0){
                return false;
            }
        }
        return true;
    }
}
