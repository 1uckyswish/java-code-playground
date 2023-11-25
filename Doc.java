public class Doc {
    
    public static void main(String[] args){

    }

    /**
     * Function name: greet
     * 
     * INSIDE THE FUNCTION : 
     *  1:prints hi
     * 
     * 
     */

    public static void greet(){
        System.out.println("hi");
    }

    /**
     * FUNCTION NAME: printText
     * @param name (String)
     * @param age (String)
     * 
     * inside the function:
     *  1:Prints users name and age
     */
    public static void printText(String name, String age){
        System.out.println("Hi my name is "+name+ " and i am " +age+ " year old");
    }

    /**
     * FUNCTION NAME : calArea
     * @param length (double)
     * @param width (double)
     * @return      (double)
     * 
     * Inside of function:
     *  1:Calculates the area and return it.
     */

    public static double calArea(double length, double width){
        double area = length * width;
        return area;
    }

}
