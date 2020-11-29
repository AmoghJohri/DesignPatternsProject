package Item.MCQ;

public class MCQAnswer
{
    protected Integer correct_answer;

    public MCQAnswer(Integer answer)
    {
        this.correct_answer = answer;
    }

    public Integer getAnswer()
    {
        return this.correct_answer;
    }

}
