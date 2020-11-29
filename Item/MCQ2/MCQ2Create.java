package Item.MCQ2;
import Item.Item;
import java.util.Scanner;
import java.util.ArrayList;
public class MCQ2Create 
{
    public MCQ2Create(){}
    public Item makeItem()
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
            System.out.println("Press 5 to enter the Difficulty");
            System.out.println("Press 5 to get the Item");
            Integer input = scan.nextInt();
            if(input == 1)
            {
                System.out.println("Enter the question:");
                question = scan.nextLine();
            }
            else if(input == 2)
            {
                System.out.println("Enter the number of Options:");
                Integer n = scan.nextInt();
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
                Integer n = scan.nextInt();
                answers = new ArrayList<Integer>();
                System.out.println("Enter the answer indices one after the other.");
                for(int i = 0; i < n; i++)
                {
                    answers.add(scan.nextInt());
                }
            }
            else if(input == 4)
            {
                System.out.println("Enter the Difficulty:");
                difficulty = scan.nextInt();
            }
            else if(input == 5)
            {
                scan.close();
                return new MCQ2Item(new MCQ2Question(question, options), new MCQ2Answer(answers), difficulty);
            }
        }
    }
}
