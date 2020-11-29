package Item.Comprehension;

public class Paragraph implements Comprehension
{
    private String paragraph;

    public Paragraph(String para)
    {
        this.paragraph = para;
    }

    public String getQuestionDescription()
    {
        return this.paragraph;
    }
    public String getAnswerDescription()
    {
        return "";
    }
    public Integer getNumberOfItems()
    {
        return 0;
    }
}
