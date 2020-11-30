package Item.MCQ2;
import  java.util.ArrayList;
// defines the class for storing answer of type MCQ2
public class MCQ2Answer
{
    protected ArrayList<Integer> correct_answers; // list of Integer to store the indices corresponding to correct answers

    public MCQ2Answer(ArrayList<Integer> answers)
    {
        this.correct_answers = answers;
    }

    // getter
    public ArrayList<Integer> getCorrectAnswers()
    {
        return this.correct_answers;
    }
    
}
