package Item.MCQ;
import  java.util.ArrayList;
// defines the class for storing question of type MCQ
public class MCQQuestion
{
    protected String            question; // string storing the question
    protected ArrayList<String> options;  // integer storing the correct option's index
    
    public MCQQuestion(String s, ArrayList<String> options)
    {
        this.question = s;
        this.options  = options;
    }

    // getters
    public String getQuestion()
    {
        return this.question;
    }

    public ArrayList<String> getOptions()
    {
        return this.options;
    }
}
