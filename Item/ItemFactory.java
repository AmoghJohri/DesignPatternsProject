package Item;
import  Item.MCQ.MCQCreate;
import  Item.MCQ2.MCQ2Create;
import  Item.Comprehension.ComprehensionCreate;

import  java.util.HashMap;
// this class stores all the information regarding the concrete ItemCreate classes
// this class creates item corresponding to different plugins
public class ItemFactory
{
    private static HashMap<String, ItemCreate> createType = null; // storing the concrete creator class in a hash-map, with the key being its name

    private ItemFactory(String s)                                 // private constructor method (to control the number of object instances)
    {
        if(createType == null)
        {
            createType = new HashMap<String, ItemCreate>();
        }
        // adding the relevant concrete creators (lazy instantiation)
        if(!createType.containsKey(s))
        {
            if(s == "MCQ")                  // adding the MCQ type creator
            {
                createType.put(s, new MCQCreate());
            }
            else if(s == "MCQ2")            // adding the MCQ2 type creator
            {
                createType.put(s, new MCQ2Create());
            }
            else if(s == "Comprehension")   // adding the comprehension type creator
            {
                createType.put(s, new ComprehensionCreate());
            }
        }
    }

    public static Item getItem(String type) // returns with the item of the required type
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
            return getItem("MCQ");          // default Item type has been set to MCQ
        }
    }
}