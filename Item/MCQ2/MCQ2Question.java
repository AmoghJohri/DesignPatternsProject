package Item.MCQ2;
import  java.util.ArrayList;
// defines the class for storing question of type MCQ2
public class MCQ2Question
{
    protected String            question; // string storing the question
    protected ArrayList<String> options;  // list of strings storing the options
    
    public MCQ2Question(String s, ArrayList<String> options)
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
