package Item.MCQ2;
import java.util.ArrayList;
public class MCQ2Question
{
    protected String question;
    protected ArrayList<String> options;
    
    public MCQ2Question(String s, ArrayList<String> options)
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
