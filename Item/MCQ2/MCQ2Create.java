package Item.MCQ2;
import  Item.Item;
import  Item.ItemCreate;

import  java.util.Scanner;
import  java.util.ArrayList;
// concrete creator corresponding to ItemCreate (Factory Method)
public class MCQ2Create implements ItemCreate
{
    public MCQ2Create(){}

    // overriding the factory-method
    public Item makeItem()
    {
        Scanner scan                = new Scanner(System.in);
        String question             = null; // storing the question
        ArrayList<String> options   = null; // storing the list of options
        ArrayList<Integer> answers  = null; // storing the indices of correct options
        Integer difficulty          = null; // storing the difficulty
        // interactive interface - as authoring is an interactive process
        while(true)
        {
            System.out.println("Press 1 to enter the Question");
            System.out.println("Press 2 to enter the Options");
            System.out.println("Press 3 to enter the Answers");
            System.out.println("Press 4 to enter the Difficulty");
            System.out.println("Press 5 to get the Item");
            Integer input = Integer.parseInt(scan.nextLine());
            if(input == 1) // getting the question
            {
                System.out.println("Enter the question:");
                question = scan.nextLine();
            }
            else if(input == 2) // getting the options
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
            else if(input == 3) // getting the answer
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
            else if(input == 4) // getting the difficulty
            {
                System.out.println("Enter the Difficulty:");
                difficulty = Integer.parseInt(scan.nextLine());
            }
            else if(input == 5) // returning an item of corresponding concrete type
            {
                return new MCQ2Item(new MCQ2Question(question, options), new MCQ2Answer(answers), difficulty);
            }
        }
    }
}
