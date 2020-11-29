package Item;
import Item.MCQ.MCQCreate;
import Item.MCQ2.MCQ2Create;
import Item.Comprehension.ComprehensionCreate;
import java.util.HashMap;
public class ItemFactory
{
    private static HashMap<String, ItemCreate> createType = null;

    private ItemFactory(String s)
    {
        if(createType == null)
        {
            createType = new HashMap<String, ItemCreate>();
        }
        if(!createType.containsKey(s))
        {
            if(s == "MCQ")
            {
                createType.put(s, new MCQCreate());
            }
            else if(s == "MCQ2")
            {
                createType.put(s, new MCQ2Create());
            }
            else if(s == "Comprehension")
            {
                createType.put(s, new ComprehensionCreate());
            }
        }
    }

    public static Item getItem(String type)
    {
        if(createType == null)
        {
            new ItemFactory(type);
        }
        else if(!createType.containsKey(type))
        {
            new ItemFactory(type);
        }
        if(createType.containsKey(type))
        {
            return createType.get(type).makeItem();
        }
        else
        {
            return getItem("MCQ");
        }
    }
}