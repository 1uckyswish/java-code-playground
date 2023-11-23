public class Calendar {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        String day = "fjjff"; // Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");

        // Check 'calendar' here:
        switch (day) {
            case "Monday":
                System.out.println("SORRY I WORK\n");
                break;
            case "Tuesday":
                System.out.println("work late\n");
                break;
            case "Wednesday":
                System.out.println("meetings\n");
                break;
            case "Thursday":
                System.out.println("dentist appoit\n");
                break;
            case "Fridat":
                System.out.println("free\n");
                break;
            default: System.out.println("not a day\n");break;
        }

    }
}
