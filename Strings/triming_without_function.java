


//input an email form the user. you have to create a username from the email by deleting the part that comes after '@'. Display the user name
//to the user. 

import java.util.*;
public class triming_without_function
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        String email=obj.next();
        String username = "";
        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i)== '@')
                break;
            else
            username+=email.charAt(i);
        }
        System.out.println("username: "+ username);
        obj.close();
    }
}

