package org.example.Traccia_2;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[] {
                new String("Peppe"),
                new String("Carlo"),
                new String("Vincenzo")
        };

        Person person = new Person("Giuseppe", 27);

        printForstFiveLetters(strings);

        System.out.println(thirdLettersChains(strings, 1, 2));
    }

    public static void printForstFiveLetters(String[] array) {
        for(String element : array) {
            System.out.println(element.substring(0, 5));
        }
    }

    public static String thirdLettersChains(String[] array2, int k, int n) {
        String concatenation = "";
        for (int index = 0; index < k + n && index < array2.length; index++) {
            String change = array2[index];
            concatenation += change.charAt(2);
        }
        return concatenation;
    }
}
