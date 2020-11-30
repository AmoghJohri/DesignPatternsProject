package Item.Comprehension;
// decorator corresponding to the component (which is comprehension)
public abstract class Decorator implements Comprehension 
{
    protected Comprehension tempComprehension; // storing the component (decorator has-a component)
    protected Integer       numberOfQuestions; // storing the number of times an a component is decorated

    public Decorator(Comprehension comprehension)
    {
        this.tempComprehension = comprehension;
        this.numberOfQuestions = comprehension.getNumberOfItems();
        this.numberOfQuestions ++;
    }

    // getters
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
