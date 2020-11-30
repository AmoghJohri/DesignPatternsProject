package Item.Comprehension;
import  Item.Item;
import  Item.ItemCreate;
import  Item.ItemFactory;

import  java.util.Scanner;
// concrete creator corresponding to ItemCreate (Factory Method)
public class ComprehensionCreate implements ItemCreate
{
    public ComprehensionCreate(){}

    // overriding the factory method
    public Item makeItem()
    {
        Scanner scan               = new Scanner(System.in);
        String paragraph           = null;                      // storing the paragraph
        Integer difficulty         = null;                      // storing the difficulty
        System.out.println("Enter the Paragraph");  
        paragraph                  = scan.nextLine();
        Comprehension question     = new Paragraph(paragraph);  // instantiating concrete component
        // interactive interface - as authoring is an interactive process
        while(true)
        {
            System.out.println("Press 1 to enter an MCQ Question");
            System.out.println("Press 2 to enter an MCQ2 Question");
            System.out.println("Press 3 to set the Difficulty");
            System.out.println("Press 4 to get the Item");
            Integer input = scan.nextInt();
            if(input == 1) // deocrating with an MCQ type question
            {
                question = new AddMCQ(question, ItemFactory.getItem("MCQ"));
            }
            else if(input == 2) // decorating with an MCQ2 type question
            {
                question = new AddMCQ2(question, ItemFactory.getItem("MCQ2"));
            }
            else if(input == 3) // getting the difficulty
            {
                System.out.println("Enter the Difficulty:");
                difficulty = scan.nextInt();
                scan.nextLine();
            }
            else if(input == 4) // returning an item of corresponding concrete type
            {
                return new ComprehensionItem(question, difficulty);
            }
        }
    }
}
