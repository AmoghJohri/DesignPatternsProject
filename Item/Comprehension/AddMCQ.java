package Item.Comprehension;
import  Item.Item;
import  Item.MCQ.MCQAnswer;
import  Item.MCQ.MCQQuestion;
// concrete decorator corresponding to MCQ 
public class AddMCQ extends Decorator
{
    private MCQQuestion question; // MCQ question
    private MCQAnswer   answer;   // MCQ answer
    
    public AddMCQ(Comprehension tempComprehension, MCQQuestion question, MCQAnswer answer)
    {
        super(tempComprehension);
        this.question = question;
        this.answer   = answer;
    }

    public AddMCQ(Comprehension tempComprehension, Item item)
    {
        super(tempComprehension);
        this.question = (MCQQuestion)item.getQuestion();
        this.answer   = (MCQAnswer)item.getAnswer();
    }

    // adding the required functionalities
    public String getQuestionDescription()
    {
        String s  = "Question " + Integer.toString(this.tempComprehension.getNumberOfItems().intValue()+1) + " : " + this.question.getQuestion() + "\n" + "Options: \n";
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
