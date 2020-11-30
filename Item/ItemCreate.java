package Item;
// defines the ItemCreate interface - every plug-in has a suitable concrete interface corresponding to this
public interface ItemCreate 
{
    public Item makeItem(); // factory method - which generates an item
}
