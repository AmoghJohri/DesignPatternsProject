package Item;
import Item.MCQ.MCQCreate;
import Item.MCQ2.MCQ2Create;
import Item.Comprehension.ComprehensionCreate;
public class ItemFactory
{
    public static Item makeItem(String type)
    {
        if(type.equals("MCQ"))
        {
            return MCQCreate.makeItem();
        }
        else if(type.equals("MCQ2"))
        {
            return MCQ2Create.makeItem();
        }
        else if(type.equals("Comprehension"))
        {
            return ComprehensionCreate.makeItem();
        }
        else 
        {
            // default
            return MCQCreate.makeItem();
        }
    }
}