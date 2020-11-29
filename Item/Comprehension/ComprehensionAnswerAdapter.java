package Item.Comprehension;
import Item.Answer;
public class ComprehensionAnswerAdapter implements Answer
{
    private String answer;
    public ComprehensionAnswerAdapter(Comprehension comp)
    {
        this.answer = comp.getAnswerDescription();
    }
    public String displayAnswer()
    {
        return this.answer;
    }

}
