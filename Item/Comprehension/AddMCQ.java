package Item.Comprehension;
import Item.MCQ.*;
public class AddMCQ extends Decorator
{
    private MCQQuestion question;
    private MCQAnswer answer;
    
    public AddMCQ(Comprehension tempComprehension, MCQQuestion question, MCQAnswer answer)
    {
        super(tempComprehension);
        this.question = question;
        this.answer = answer;
    }

    public String getQuestionDescription()
    {
        String s = "Question " + Integer.toString(this.tempComprehension.getNumberOfItems().intValue()+1) + " : " + this.question.getQuestion() + "\n" + "Options: \n";
        Integer i = 1;
        for(String each : this.question.getOptions())
        {
            s = s + i.toString() + ": " + each + "\n";
            i ++;
        }
        return this.tempComprehension.getQuestionDescription() + "\n" + s;
    }

    public String getAnswerDescription()
    {
        return this.tempComprehension.getAnswerDescription() + "\n" + "Answer " + Integer.toString(this.tempComprehension.getNumberOfItems().intValue()+1) + " : "+ this.answer.getAnswer().toString() + "\n";
    }
}
