package Item.Comprehension;
import  Item.Item;
// class for making Comprehension type Item compatible with the Item interface
// uses question and answer adapters for doing so
public class ComprehensionItem extends Item
{
    public ComprehensionItem(Comprehension comp, Integer difficulty)
    {
        super(new ComprehensionQuestionAdapter(comp), new ComprehensionAnswerAdapter(comp), difficulty);
    }
}
