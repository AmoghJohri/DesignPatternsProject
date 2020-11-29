package Item.MCQ;
import Item.Answer;
public class MCQAnswerAdapter extends MCQAnswer implements Answer
{
    public MCQAnswerAdapter(MCQAnswer mcq)
    {
        super(mcq.getAnswer());
    }    

    public String displayAnswer()
    {
        return "Answer: "+ this.correct_answer.toString() + "\n";
    }
}
