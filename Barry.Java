
import java.util.Scanner;

public class Barry {


    // create main method 

    public static void main (String [] args) {
    
        // Print introduction to console

        displayTitle();
        displayDescription();
        String usersDestination = ""

        while(!usersDestination.equals(anObject:"Exit")) {
            
            usersDestination = Scenario1PonyUp

        }
    
    }


    public static void sendUserToNextScenario(String destination){
        if((destination.equals("Scenario1"))){

            Scenario1PonyUp
        
        }else if(destination.equals(anObject:Scenario2))
    }



    // Create method to display title 
    public static void displayTitle() {
        // print title
        System.out.println("\n\n\t *** Barry's Day Out ***\n\n");
    } 

    public static void displayDescription() { 
        System.out.println("\n\n\t *** It's a...pleasant day in Dreamera, cloudy as always, people are lively, and you are as...manageable as you usually are, when reaching for your box of smokes, you find only one left! ***\n\n");
        System.out.println("\n\n\t *** Looks like you're gonna have to go and get more...what're you gonna do about it? ***\n\n");
    }

    //create first scenario: PonyUp

    public static String Scenario1PonyUp() {
        //Create string for user choices 
        String usersChoice = "";
        
        System.printLn("\n\t*** Pony Up ***\n");

        // display description
        System.out.println("You decide to stop loitering about, and decide to head to the store to buy some more smokes, but you find that you're short on money, what do you do?");

        System.out.println("1. Give up");
        System.out.println("Go back to loitering, but without smokes to keep you happy");

        System.out.println("2. Ask shop for help");
        System.out.println("Ask the shop for anything you can do to earn them");

        System.out.println("3. Find a job");
        System.out.println("Find an odd job to get money to buy some");



        System.out.print(s:"\n Enter your choice (1,2, or3): ");

        Scanner scanner = new Scanner(System.ln); 

        usersChoice = scanner.nextLine();

        String usersDestination = "";

        if (usersChoice.equals(anObject:"1")) {

            usersDestination = "Scenario 2";
        } else if(userschoice.equals(anObject:"2")) {
            usersDestination = "Scenario 3";

        }

        //return choice
        return usersChoice
    }

}