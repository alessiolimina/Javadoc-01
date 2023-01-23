package it.develhope.javadoc;

/**
 * This class is a Tester class
 * @author aless
 */

public class Tester {
    public static void main(String[] args) {

        System.out.println("-----------------Starting---------------------------");

        /**
         * We created a new WordGames object
         */

        WordGames wordgames = new WordGames();

        System.out.println(wordgames.addHelloWorld("World!"));

        System.out.println(wordgames.getFullName("Alessio", "Limina"));

        System.out.println("------------------------------------------------------");

    }
}
