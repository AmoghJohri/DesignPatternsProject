package Item.MCQ;
import  Item.Item;
// class for making MCQ type Item compatible with the Item interface
// uses question and answer adapters for doing so
public class MCQItem extends Item
{
    public MCQItem(MCQQuestion q, MCQAnswer a, Integer d)
    {
        super(new MCQQuestionAdapter(q), new MCQAnswerAdapter(a), d);
    }
}
