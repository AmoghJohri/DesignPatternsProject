import Item.Comprehension.*;
import Item.MCQ.*;
import Item.MCQ2.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Comprehension question = new Paragraph("This is the paragraph for Question 1\n");
        MCQQuestion mcq_question_1 = new MCQQuestion("MCQ Question", new ArrayList<String>(Arrays.asList("Option 1", "Option 2", "Option 3", "Option 4")));
        MCQAnswer mcq_answer_1 = new MCQAnswer(2);
        MCQ2Question mcq_question_2 = new MCQ2Question("MCQ2 Question", new ArrayList<String>(Arrays.asList("Option 1", "Option 2", "Option 3", "Option 4")));
        MCQ2Answer mcq_answer_2 = new MCQ2Answer(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        question = new AddMCQ2(new AddMCQ(question, mcq_question_1, mcq_answer_1), mcq_question_2, mcq_answer_2);
        System.out.println(question.getQuestionDescription());
        System.out.println(question.getAnswerDescription());
    }
}