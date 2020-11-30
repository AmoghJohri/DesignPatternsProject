package Item.Comprehension;
import  Item.Question;
// adapter for making Comprehension and Question compatible
// using composition adapter method
public class ComprehensionQuestionAdapter implements Question
{
    private Comprehension comp;

    public ComprehensionQuestionAdapter(Comprehension comp)
    {
        this.comp = comp;
    }
    
    // implementing the abstract function corresponding to Question
    public String displayQuestion()
    {
        return this.comp.getQuestionDescription();
    }
}
