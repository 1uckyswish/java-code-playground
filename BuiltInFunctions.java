public class BuiltInFunctions {

    public static void main(String[] args) {
        double numb = Math.random();

        System.out.println((int)numb);
        /**
         * Scenario 1
         * 
         * Find a built-in function that prints the message on the console.
         * @param message (String)
         */
        String message = "Hello, World!";
        // Write your code here


        /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        String example = "Java";
        // Write your code here


        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        String upperCase = "JAVA";
        // Write your code here


        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */
        String programming = "java programming";
        // Write your code here

        boolean prefix = programming.startsWith("JAVA".toLowerCase());



        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        String original = "Java is fun!";

        String value = original.replace("a", "0");
        // Write your code here

        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        
        double number = 9;
        // Write your code here


        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        double base = 2;
        double exponent = 3;
        // Write your code here


        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        // Write your code here



        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        int number1 = 5;
        int number2 = 10;
        // Write your code here


    }
}