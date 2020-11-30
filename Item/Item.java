package Item;
// defines the item abstract class
// corresponding to every plug-in there is a concrete class for this
public abstract class Item 
{
    protected Question question;
    protected Answer   answer;
    protected Integer  difficulty;

    public Item(Question q, Answer a, Integer d)
    {
        this.question   = q;
        this.answer     = a;
        this.difficulty = d;
    }

    // getters
    public Question getQuestion()
    {
        return this.question;
    }
    
    public Answer getAnswer()
    {
        return this.answer;
    }

    public Integer getDifficulty()
    {
        return this.difficulty;
    }
    
    // display the item
    public String displayItem()
    {
        return this.question.displayQuestion() + "\n" + this.answer.displayAnswer();
    }
}
