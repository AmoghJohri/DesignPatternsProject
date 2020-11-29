package Item.MCQ2;
import java.util.ArrayList;
public class MCQ2Answer
{
    protected ArrayList<Integer> correct_answers;

    public MCQ2Answer(ArrayList<Integer> answers)
    {
        this.correct_answers = answers;
    }

    public ArrayList<Integer> getCorrectAnswers()
    {
        return this.correct_answers;
    }
    
}
