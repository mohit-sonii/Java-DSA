
import java.util.*;
public class Function{
    public static void printMyName(String name)
    {
        System.out.println("Mohit");
        return;
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String string=obj.next();
        obj.close();
        printMyName(string);
    }
}