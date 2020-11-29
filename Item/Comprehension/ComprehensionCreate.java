package Item.Comprehension;
import Item.Item;
import Item.ItemFactory;
import java.util.Scanner;
public class ComprehensionCreate 
{
    public static Item makeItem()
    {
        Scanner scan = new Scanner(System.in);
        String paragraph = null;
        Integer difficulty = null;
        System.out.println("Enter the Paragraph");
        paragraph = scan.nextLine();
        Comprehension question = new Paragraph(paragraph);
        while(true)
        {
            System.out.println("Press 1 to enter an MCQ Question");
            System.out.println("Press 2 to enter an MCQ2 Question");
            System.out.println("Press 3 to set the Difficulty");
            System.out.println("Press 4 to get the Item");
            Integer input = scan.nextInt();
            if(input == 1)
            {
                question = new AddMCQ(question, ItemFactory.makeItem("MCQ"));
            }
            else if(input == 2)
            {
                question = new AddMCQ2(question, ItemFactory.makeItem("MCQ2"));
            }
            else if(input == 3)
            {
                System.out.println("Enter the Difficulty:");
                difficulty = scan.nextInt();
                scan.nextLine();
            }
            else if(input == 4)
            {
                return new ComprehensionItem(question, difficulty);
            }
        }
    }
}
