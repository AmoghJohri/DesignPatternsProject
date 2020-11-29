import Item.Item;
import Item.ItemFactory;
import Database.QuestionDatabaseConnectionPool;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> savedItems = new ArrayList<Item>();
        QuestionDatabaseConnectionPool pool = QuestionDatabaseConnectionPool.getConnectionPool();
        Integer choice;
        System.out.println("Welcome to the Item Authoring Module!");
        while(true)
        {
            Item item = null;
            System.out.println("Press 1 to create an MCQ Question");
            System.out.println("Press 2 to create an MCQ2 Question");
            System.out.println("Press 3 to create a Comprehension Question");
            System.out.println("Press 9 to Exit");
            choice = Integer.parseInt(scan.nextLine());
            if(choice == 1)
            {
                item = ItemFactory.getItem("MCQ");
            }
            else if(choice == 2)
            {
                item = ItemFactory.getItem("MCQ2");
            }
            else if(choice == 3)
            {
                item = ItemFactory.getItem("Comprehension");
            }
            else if(choice == 9)
            {
                break;
            }
            System.out.println("Press 4 to review Item");
            System.out.println("Press 5 to delete Item");
            System.out.println("Press 6 to save Item");
            System.out.println("Press 9 to Exit");
            choice = Integer.parseInt(scan.nextLine());
            if(choice == 4)
            {
                System.out.println("\n" + item.displayItem());
            }
            else if(choice == 5)
            {
                item = null;
            }
            else if(choice == 6)
            {
                Integer connectionNumber = pool.getConnection();
                while(connectionNumber == -1)
                {
                    connectionNumber = pool.getConnection();
                }
                System.out.println("Saving Item using Connection: " + connectionNumber.toString());
                savedItems.add(item);
                pool.releaseConnection(connectionNumber);
            }
            else if(choice == 9)
            {
                break;
            }
        }
        System.out.println("These are all the questions that you have submitted!");
        for(Item item : savedItems)
        {
            System.out.println("\n" + item.displayItem());
        }
        System.out.println("Goodbye!");
    }
}