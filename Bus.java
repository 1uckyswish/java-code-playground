public class Bus {
    
    public static void main(String[] args){

        computerChoice();
        // int pass = 0;
        // pass += 9;
        // System.out.println(pass);
        // pass -= 5;
        // System.out.println(pass);
        // pass -= 4;
        // System.out.println(pass);
    }

    public static String computerChoice(){
           int randomInt = (int) (Math.random() * 3);
            switch(randomInt){
                case 0: return "rock";
                case 1: return "paper";
                case 2: return "scissors";
                default: return "Sorry error";
            }
        }

}
