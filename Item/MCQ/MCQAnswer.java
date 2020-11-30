package Item.MCQ;
// defines the class for storing answer of type MCQ
public class MCQAnswer
{
    protected Integer correct_answer; // index for the correct answer

    public MCQAnswer(Integer answer)
    {
        this.correct_answer = answer;
    }
    
    // getter
    public Integer getAnswer()
    {
        return this.correct_answer;
    }

}
