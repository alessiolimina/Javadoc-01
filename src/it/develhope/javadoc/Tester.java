package it.develhope.javadoc;

/**
 * This class is a Tester class
 * @author alessiolimina
 */

public class Tester {
    public static void main(String[] args) {

        System.out.println("-----------------Starting---------------------------");

        /**
         * We created a new WordGames object
         */

        WordGames wordgames = new WordGames();

        /**
         * Applying the addHelloWorld method to the new object
         * Printing the result
         */

        System.out.println(wordgames.addHelloWorld("World!"));

        /**
         * Applying the getFullName method to the new object
         * Printing the result
         */

        System.out.println(wordgames.getFullName("Alessio", "Limina"));

        System.out.println("------------------------------------------------------");

    }
}
