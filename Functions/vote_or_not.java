//write a function that takes in age as input and returns if that person is eligble to vote or not. a person of >18 is eleiglbe to vote


import java.util.*;
public class vote_or_not
{
    public static String vote(int n)
    {
        if(n>18)
        return "Eligible";
        else
        return "Not Eligible";
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.close();
        System.out.println(vote(n));
    }
}