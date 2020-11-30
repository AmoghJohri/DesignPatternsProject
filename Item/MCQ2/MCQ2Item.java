package Item.MCQ2;
import  Item.Item;
// class for making MCQ2 type Item compatible with the Item interface
// uses question and answer adapters for doing so
public class MCQ2Item extends Item
{
    public MCQ2Item(MCQ2Question q, MCQ2Answer a, Integer d)
    {
        super(new MCQ2QuestionAdapter(q), new MCQ2AnswerAdapter(a), d);
    }
}
