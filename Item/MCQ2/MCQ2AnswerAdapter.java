package Item.MCQ2;
import  Item.Answer;
// adapter for making MCQ2Answer and Answer compatible
// using class adapter method
public class MCQ2AnswerAdapter extends MCQ2Answer implements Answer
{
    public MCQ2AnswerAdapter(MCQ2Answer mcq2)
    {
        super(mcq2.getCorrectAnswers());
    }    

    // implementing the abstract function corresponding to Answer
    public String displayAnswer()
    {
        String s =  "Answer: ";
        for(Integer each : this.correct_answers)
        {
            s = s + each.toString() + " ";
        }
        s = s + "\n";
        return s;
    }
}
