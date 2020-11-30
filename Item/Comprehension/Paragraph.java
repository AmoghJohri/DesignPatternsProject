package Item.Comprehension;
// concrete component type
public class Paragraph implements Comprehension
{
    private String paragraph; // stores the paragraph for a comprehension question

    public Paragraph(String para)
    {
        this.paragraph = para;
    }

    // getters
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
