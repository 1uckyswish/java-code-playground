public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
    }


    //Task 1: Make a function here. See the doc comments below. 
    public static double fahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius;
    }
    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */

     
    //Task 2: Make a function here. See the doc comments below. 

    public static void printTemperatures(double fahrenheit){
        System.out.println("Temp in fahrenheit is " + fahrenheit);
        System.out.println("Temp in celcius is " + fahrenheitToCelsius(fahrenheit) + "\n");
    }
    /**
     * Function name: fahrenheitToCelsius – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
}