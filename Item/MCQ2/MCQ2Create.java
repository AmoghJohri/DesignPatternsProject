package Item.MCQ2;
import Item.Item;
import java.util.Scanner;
import java.util.ArrayList;
public class MCQ2Create 
{
    public static Item makeItem()
    {
        Scanner scan = new Scanner(System.in);
        String question = null;
        ArrayList<String> options = null;
        ArrayList<Integer> answers = null;
        Integer difficulty = null;
        while(true)
        {
            System.out.println("Press 1 to enter the Question");
            System.out.println("Press 2 to enter the Options");
            System.out.println("Press 3 to enter the Answers");
            System.out.println("Press 4 to enter the Difficulty");
            System.out.println("Press 5 to get the Item");
            Integer input = Integer.parseInt(scan.nextLine());
            if(input == 1)
            {
                System.out.println("Enter the question:");
                question = scan.nextLine();
            }
            else if(input == 2)
            {
                System.out.println("Enter the number of Options:");
                Integer n = Integer.parseInt(scan.nextLine());
                options = new ArrayList<String>();
                System.out.println("Enter the options one after the other.");
                for(int i = 0; i < n; i++)
                {
                    options.add(scan.nextLine());
                }
            }
            else if(input == 3)
            {
                System.out.println("Enter the number of Answers:");
                Integer n = Integer.parseInt(scan.nextLine());
                answers = new ArrayList<Integer>();
                System.out.println("Enter the answer indices one after the other.");
                for(int i = 0; i < n; i++)
                {
                    answers.add(Integer.parseInt(scan.nextLine())); 
                }
            }
            else if(input == 4)
            {
                System.out.println("Enter the Difficulty:");
                difficulty = Integer.parseInt(scan.nextLine());
            }
            else if(input == 5)
            {
                return new MCQ2Item(new MCQ2Question(question, options), new MCQ2Answer(answers), difficulty);
            }
        }
    }
}
