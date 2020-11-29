package Item.MCQ2;
import Item.Question;
public class MCQ2QuestionAdapter extends MCQ2Question implements Question
{
    public MCQ2QuestionAdapter(MCQ2Question mcq2)
    {
        super(mcq2.getQuestion(), mcq2.getOptions());
    }

    public String displayQuestion()
    {
        String s = "Question: " + this.question + "\n" + "Options: \n";
        Integer i = 1;
        for(String each : this.options)
        {
            s = s + i.toString() + ": " + each + "\n";
            i ++;
        }
        return s;
    }
}
