import Item.MCQ.MCQQuestion;
import Item.MCQ.MCQAnswer;
import Item.MCQ.MCQItem;
import Item.MCQ2.MCQ2Question;
import Item.MCQ2.MCQ2Answer;
import Item.MCQ2.MCQ2Item;
import Item.Comprehension.Comprehension;
import Item.Comprehension.Paragraph;
import Item.Comprehension.AddMCQ;
import Item.Comprehension.AddMCQ2;
import Item.Comprehension.ComprehensionItem;
import Item.Item;
import Database.QuestionDatabaseConnectionPool;
import java.util.ArrayList;
import java.util.Arrays;
public class Run 
{

    private static Item hardCodeCreateMCQ()
    {
        // creating an MCQ Item
        String question = "MCQ Question 1";
        ArrayList<String> options = new ArrayList<String>(Arrays.asList("Option 1", "Option 2", "Option 3", "Option 4"));
        Integer answer = 3;
        Integer difficulty = 5;
        Item mcqItem = new MCQItem(new MCQQuestion(question, options), new MCQAnswer(answer), difficulty);
        return mcqItem;
    }

    private static Item hardCodeCreateMCQ2()
    {
        // creating an MCQ2 Item
        String question = "MCQ2 Question 2";
        ArrayList<String> options = new ArrayList<String>(Arrays.asList("Option 1", "Option 2", "Option 3", "Option 4"));
        ArrayList<Integer> answers = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
        Integer difficulty = 8;
        Item mcq2Item = new MCQ2Item(new MCQ2Question(question, options), new MCQ2Answer(answers), difficulty);
        return mcq2Item;
    }

    private static Item hardCodeCreateComprehension()
    {
        Item mcqitem = hardCodeCreateMCQ();
        Item mcq2item = hardCodeCreateMCQ2();
        Integer difficulty = 4;
        Comprehension question = new Paragraph("This is the paragraph");
        question = new AddMCQ(question, mcqitem);
        question = new AddMCQ2(question, mcq2item);
        Item comprehensionItem = new ComprehensionItem(question, difficulty);
        return comprehensionItem;
    }

    public static void main(String[] args)
    {
        ArrayList<Item> unsavedItems = new ArrayList<Item>();
        unsavedItems.add(Run.hardCodeCreateMCQ());
        unsavedItems.add(Run.hardCodeCreateMCQ2());
        unsavedItems.add(Run.hardCodeCreateComprehension());
        ArrayList<Item> savedItems = new ArrayList<Item>();
        System.out.println("Welcome to the Item Authoring Module!");
        QuestionDatabaseConnectionPool pool = QuestionDatabaseConnectionPool.getConnectionPool();
        for(Item item : unsavedItems)
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
        System.out.println("These are all the questions that you have submitted!");
        for(Item item : savedItems)
        {
            System.out.println("\n" + item.displayItem());
        }
        System.out.println("Goodbye!");
    }
}
