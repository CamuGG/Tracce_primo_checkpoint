package org.example.Traccia_1;

public class Main {
    public static void main(String[] args) {
        //Implement a main method where:
        //- 1) An array of 3 Person objects is allocated. FATTO
        //- 2) An array of Strings containing the values of the lastName attribute for every
        //Person object in the previously allocated array. FATTO
        //- 3) The method printFirstThreeLetters is called passing the allocated array as
        //parameter. FATTO
        //- 4) The method thirdLettersChains is called passing the allocated array as
        //parameter and n = 2 and its result is printed to screen. FATTO
        //- 5) The values of the attribute age for every object in the array is printed to
        //screen FATTO

        Person[] person = new Person[]{
                new Person("Peppe", "Catania", 25),
                new Person("Ugo", "Pirlo", 23),
                new Person("Vincenzo", "Balsamo", 24),
        };

        String[] lastName = new String[3];
        lastName[0] = person[0].getLastName();
        lastName[1] = person[1].getLastName();
        lastName[2] = person[2].getLastName();

        printFirstThreeLetters(lastName);

        System.out.println(thirdLettersChains(lastName, 2));

        System.out.println(person[0].getAge() + "\n" + person[1].getAge() + "\n" + person[2].getAge());


    }
    //Implement a method printFirstThreeLetters that takes an array of String objects as
    //parameter and prints to the terminal the first 3 letters of each element of the array. FATTO
    public static void printFirstThreeLetters(String[] arrayString){
        for (String element : arrayString)
            System.out.println(element.substring(0,3));
    }
    //Implement a method thirdLettersChains that takes an array of String objects and an
    //integer n as parameters and returns a String resulting from the concatenation of the
    //third characters of the first n elements in the array. FATTO
    public static String thirdLettersChains(String[] arrayString2, int n){
        String x = "";
        for (int i = 0; i < n; i++){
            String a = arrayString2[i];
            x = x + a.charAt(2);
        }
        return x;
    }
}
