public class ReturnValues {

    public static void main(String[] args){
        double area = calculateArea(2.3, 3.6);
        String explain = explainArea("spanish");
        printArea(2.3, 3.6, area);
    }

    public static double calculateArea(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("SORRY TRY AGAIN");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language){
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default: return "Sorry not available";
        }
    }


    public static void printArea(double length, double width, double area){
        System.out.println("rectangle with a length of " +length+ " and " + width + "equals = "+ area);
    }
}