package Item.MCQ;
import java.util.ArrayList;
public class MCQQuestion
{
    protected String question;
    protected ArrayList<String> options;
    
    public MCQQuestion(String s, ArrayList<String> options)
    {
        this.question = s;
        this.options = options;
    }

    public String getQuestion()
    {
        return this.question;
    }

    public ArrayList<String> getOptions()
    {
        return this.options;
    }
}
