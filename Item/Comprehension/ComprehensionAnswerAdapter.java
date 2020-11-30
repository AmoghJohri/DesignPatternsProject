package Item.Comprehension;
import  Item.Answer;
// adapter for making Comprehension and Answer compatible
// using composition adapter method
public class ComprehensionAnswerAdapter implements Answer
{
    private Comprehension comp;

    public ComprehensionAnswerAdapter(Comprehension comp)
    {
        this.comp = comp;
    }
    public String displayAnswer()
    {
        return this.comp.getAnswerDescription();
    }

}
