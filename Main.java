import Item.Item;
import Item.ItemFactory;
import Database.QuestionDatabaseConnectionPool;

import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan                        = new Scanner(System.in);                             // scanner to take input
        ArrayList<Item> savedItems          = new ArrayList<Item>();                              // everytime an item is saved, it is added to this list
        QuestionDatabaseConnectionPool pool = QuestionDatabaseConnectionPool.getConnectionPool(); // get the pool of open database connections
        Integer choice;
        System.out.println("Welcome to the Item Authoring Module!");
        // beginning the interaction (infinite loop)
        while(true)
        {
            Item item = null; // to store the Item which gets authored in each run
            System.out.println("Press 1 to create an MCQ Question");
            System.out.println("Press 2 to create an MCQ2 Question");
            System.out.println("Press 3 to create a Comprehension Question");
            System.out.println("Press 9 to Exit");
            choice    = Integer.parseInt(scan.nextLine());
            if(choice == 1)         // authoring an MCQ type item
            {
                item = ItemFactory.getItem("MCQ");
            }
            else if(choice == 2)    // authoring an MCQ2 type item
            {
                item = ItemFactory.getItem("MCQ2");
            }
            else if(choice == 3)    // authoring a comprehension type item
            {
                item = ItemFactory.getItem("Comprehension");
            }
            else if(choice == 9)    // exits
            {
                break;
            }
            System.out.println("Press 4 to review Item");
            System.out.println("Press 5 to delete Item");
            System.out.println("Press 6 to save Item");
            System.out.println("Press 9 to Exit");
            choice = Integer.parseInt(scan.nextLine());
            if(choice == 4)         // display the item that has been authored
            {
                System.out.println("\n" + item.displayItem());
            }
            else if(choice == 5)    // delete the item that has been authored
            {
                item = null;
            }
            else if(choice == 6)    // store the item that has been authored
            {
                Integer connectionNumber = pool.getConnection(); // getting a connection from the connection-pool
                // keeps trying until an open connection is found
                while(connectionNumber == -1)
                {
                    connectionNumber = pool.getConnection();
                }
                System.out.println("Saving Item using Connection: " + connectionNumber.toString());
                // stores it after finding an open connection
                savedItems.add(item);
                // explicitly releases the connection once done
                pool.releaseConnection(connectionNumber);
            }
            else if(choice == 9) // exits
            {
                break;
            }
        }
        System.out.println("These are all the questions that you have submitted!");
        // displaying all the items that have been authored
        for(Item item : savedItems)
        {
            System.out.println("\n" + item.displayItem());
        }
        System.out.println("Goodbye!");
    }
}