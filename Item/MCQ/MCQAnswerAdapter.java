package Item.MCQ;
import  Item.Answer;
// adapter for making MCQAnswer and Answer compatible
// using class adapter method
public class MCQAnswerAdapter extends MCQAnswer implements Answer
{
    public MCQAnswerAdapter(MCQAnswer mcq)
    {
        super(mcq.getAnswer());
    }    

    // implementing the abstract function corresponding to Answer
    public String displayAnswer()
    {
        return "Answer: "+ this.correct_answer.toString() + "\n";
    }
}
