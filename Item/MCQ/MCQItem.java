package Item.MCQ;
import Item.Item;
public class MCQItem extends Item
{
    public MCQItem(MCQQuestion q, MCQAnswer a, Integer d)
    {
        super(new MCQQuestionAdapter(q), new MCQAnswerAdapter(a), d);
    }
}
