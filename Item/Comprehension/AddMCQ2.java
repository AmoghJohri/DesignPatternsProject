package Item.Comprehension;
import  Item.Item;
import  Item.MCQ2.MCQ2Answer;
import  Item.MCQ2.MCQ2Question;
// concrete decorator corresponding to MCQ2
public class AddMCQ2 extends Decorator
{
    private MCQ2Question question; // MCQ2 question
    private MCQ2Answer   answer;   // MCQ2 answer
 
    public AddMCQ2(Comprehension tempComprehension, MCQ2Question question, MCQ2Answer answer)
    {
        super(tempComprehension);
        this.question = question;
        this.answer   = answer;
    }

    public AddMCQ2(Comprehension tempComprehension, Item item)
    {
        super(tempComprehension);
        this.question = (MCQ2Question)item.getQuestion();
        this.answer   = (MCQ2Answer)item.getAnswer();
    }

    // adding the required functionalities
    public String getQuestionDescription()
    {
        String s  = "Question " + Integer.toString(this.tempComprehension.getNumberOfItems().intValue()+1) + " : "+ this.question.getQuestion() + "\n" + "Options: \n";
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
        String s =  "Answer " + Integer.toString(this.tempComprehension.getNumberOfItems().intValue()+1) + " : ";
        for(Integer each : this.answer.getCorrectAnswers())
        {
            s = s + each.toString() + " ";
        }
        s = s + "\n";
        return this.tempComprehension.getAnswerDescription() + "\n" + s;
    }
}
