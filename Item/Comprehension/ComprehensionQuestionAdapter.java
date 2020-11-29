package Item.Comprehension;
import Item.Question;
public class ComprehensionQuestionAdapter implements Question
{
    private String question;
    public ComprehensionQuestionAdapter(Comprehension comp)
    {
        this.question = comp.getQuestionDescription();
    }
    public String displayQuestion()
    {
        return this.question;
    }
}
