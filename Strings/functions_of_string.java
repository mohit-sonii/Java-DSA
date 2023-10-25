

//functions of string



public class functions_of_string
{
    public static void main(String ags[])
    {
        //Concatenation
        String first="Tony";
        String second="Stark";
        String full=first + second;
        System.out.println(full);

        //length
        String value="Java";
        System.out.println(value.length());

        //charAt -> to print every characters in string, we can also use it to get char at specific index
        for(int i=0;i<value.length();i++)
        {
            System.out.println(value.charAt(i));
        }

        //compare string
        // if s1>s2 = +ve value
        // if s1<s2 = -ve value
        // if s1=s2 = zero
        if(first.compareTo(second)==0)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }

        //substrings  -> part of string is known as substring
        //syntax -> String variable_name = string_variable.substring(begin index, end index)
        System.out.println(value.substring(2,value.length()));

        //whitespace triming 
        System.out.println(value.trim());

        //uppercase conversion
        System.out.println(value.toUpperCase());

        //lowercase conversion
        System.out.println(value.toLowerCase());

        //checking for empty or null
        // -> Empty means zero length
        // -> null means nothing
        System.out.println(value.isEmpty());
        System.out.println(value == null);

        //replace
        //use 'replaceAll' to do changes as whole
        // use 'replaceFirst' to change the first match
        System.out.println(full.replace("ark","ms"));
        
        //search 
        System.out.println(full.indexOf("Stark"));
        System.out.println(full.contains("Tony"));
        
        
    }
}