package Item.MCQ2;
import Item.Item;
public class MCQ2Item extends Item
{
    public MCQ2Item(MCQ2Question q, MCQ2Answer a, Integer d)
    {
        super(new MCQ2QuestionAdapter(q), new MCQ2AnswerAdapter(a), d);
    }
}
