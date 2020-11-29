package Item;

public abstract class Item {
    protected Question question;
    protected Answer answer;
    protected Integer difficulty;

    public Item(Question q, Answer a, Integer d)
    {
        this.question = q;
        this.answer = a;
        this.difficulty = d;
    }
    // setters

    public void setQuestion(Question q)
    {
        this.question = q;
    }
    
    public void setAnswer(Answer a)
    {
        this.answer = a;
    }

    public void setDifficulty(Integer d)
    {
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
}
