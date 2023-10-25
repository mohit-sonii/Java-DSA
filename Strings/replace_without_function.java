

//input a string from the user. Create  a new string called 'result' in which you will replace the letter 'e' with 'i'

import java.util.*;
public class replace_without_function
{
    public static void main(String sag[])
    {
        Scanner obj=new Scanner(System.in);
        String name=obj.next();
        // with funciton
        System.out.println(name.replace("e","i"));

        //without function
        String result = ""; 


        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += name.charAt(i);
            }
        }
        System.out.println(result);

        obj.close();
    }
}