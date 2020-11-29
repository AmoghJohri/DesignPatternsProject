package Item.Comprehension;
import Item.Item;
public class ComprehensionItem extends Item
{
    public ComprehensionItem(Comprehension comp, Integer difficulty)
    {
        super(new ComprehensionQuestionAdapter(comp), new ComprehensionAnswerAdapter(comp), difficulty);
    }
}
