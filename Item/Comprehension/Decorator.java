package Item.Comprehension;

public abstract class Decorator implements Comprehension 
{
    protected Comprehension tempComprehension;
    protected Integer numberOfQuestions;

    public Decorator(Comprehension comprehension)
    {
        this.tempComprehension = comprehension;
        this.numberOfQuestions = comprehension.getNumberOfItems();
        this.numberOfQuestions ++;
    }

    public String getQuestionDescription()
    {
        return this.tempComprehension.getQuestionDescription();
    }
    public String getAnswerDescription()
    {
        return this.tempComprehension.getAnswerDescription();
    }
    public Integer getNumberOfItems()
    {
        return this.numberOfQuestions;
    }
}
