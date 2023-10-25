

//write a program to coundt the number of 1's in a binary representation of a number

public class Count
{
    public static int Count(String binary_number)
    {
        int total=0;
        for(int i=0;i<binary_number.length()-1;i++)
        {
            char one=binary_number.charAt(i);
            if(one=='1')
            {
                total++;
            }
        }
        return total;
    }
    public static void main(String ags[])
    {
        String binary_number="1010001";
        System.out.println(Count(binary_number));
    }
}