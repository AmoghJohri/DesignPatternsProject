package Item.MCQ;
import Item.Question;
public class MCQQuestionAdapter extends MCQQuestion implements Question
{
    public MCQQuestionAdapter(MCQQuestion mcq)
    {
        super(mcq.getQuestion(), mcq.getOptions());
    }

    public String displayQuestion()
    {
        String s = "Question: " + this.question + "\n" + "Options: \n";
        Integer i = 1;
        for(String each : this.options)
        {
            s = s + i.toString() + ": " + each + "\n";
            i ++;
        }
        return s;
    }
}
