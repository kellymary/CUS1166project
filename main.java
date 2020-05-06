/**
 *
 * @author Mary Kelly
 */
import java.util.*;

public class main {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Deck> deckList = new ArrayList<Deck>();
    
    public static void main(String[] args) {
        main demo = new main();
        DBConnector db = new DBConnector();
        db.connectDB();
        demo.startupMenu();
        
    }

    public void startupMenu() {
        System.out.print("Welcome to the deck builder. Select an option: \n 1. Create Deck \n 2. Load Deck \n 3. Exit \n");
        int choice;
        choice = input.nextInt();
        
        if(choice==1) {
            Deck myDeck = new Deck();
            System.out.println("Enter a name for your deck.");
            String deckName = input.next();
            myDeck.setName(deckName);
            deckList.add(myDeck);
            System.out.println("Nice name. Returning to the main menu.");
            startupMenu();
        }
        else if(choice==2) {
            System.out.println("You have the following decks:");
            for(int i=0; i<deckList.size(); i++) {
                System.out.println(i + " " + deckList.get(i).getName());
            }
            System.out.println("Select the number for the deck you want to see");
            int selectnum = input.nextInt();
            System.out.println(deckList.get(selectnum).getName() + " currently has " + deckList.get(selectnum).getNumberOfCards() + " cards.");
            startupMenu();
        }
        else if(choice==3) {
            System.out.println("Goodbye.");
        }
        else {
            System.out.println("Invalid input. Try again.");
        }
    }
}