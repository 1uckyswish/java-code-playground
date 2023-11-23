public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

     int gryffindor = 100;
    int ravenclaw = 500;





        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;

        if(margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        }else if( gryffindor > ravenclaw || gryffindor == ravenclaw){
            System.out.println("In second place, Gryffindor!");
        }else if(margin == 100){
            System.out.println("In third place, Gryffindor!");
        }else{
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
