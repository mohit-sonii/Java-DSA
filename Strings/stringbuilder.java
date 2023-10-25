

//string builder -> because strings are immuatable and once it stored in memory, it cannot be altered. 
//so to overcome this limitaiton of string, string builder came into existence.


public class stringbuilder
{
    public static void main(String ags[])
    {
        StringBuilder name=new StringBuilder("String");
        //string builder can perform all operations as of in string, 
        //here are some new functions

        //set char at index
        name.setCharAt(3,'e');
        System.out.println(name);

        //insert
        name.insert(3,'f');
        System.out.println(name);

        //delete
        name.delete(3,5);
        System.out.println(name);

        //append
        name.append(" builder");
        System.out.println(name);

        //capacity -> of the string builder object
        int capacity=name.capacity();
        System.out.println(capacity);
      
    }
}
