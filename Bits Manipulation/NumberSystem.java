

// write two funcitons:
// decimaltobinary() and binarytodecimal()
// to convert a number form one number system to another.

public class NumberSystem
{
    //functino to convert decimal to binary
    public static String decimal_to_binary(int decimal_number)
    {
        if(decimal_number==0)
        {
            return "0";
        }
        StringBuilder conversion=new StringBuilder();
        while(decimal_number>0)
        {
            int remainder=decimal_number%2;
            conversion.insert(0,remainder);
            decimal_number=decimal_number/2;

        }
        return conversion.toString();
    }
    //function to convert binary to decimal
    public static int binary_to_decimal(String binary_number)
    {
        int base=2;
        int power=0;
        int decimal=0;
        for(int i=binary_number.length()-1;i>=0;i--)
        {
            char one=binary_number.charAt(i);
            if(one=='1')
            {
                decimal+= Math.pow(base,power);
            }
            power++;
        }
        return decimal;

    }
    public static void main(String ags[])
    {
        int decimal_number=8;
        String binary_number="1000";
        System.out.println(decimal_to_binary(decimal_number));
        System.out.println(binary_to_decimal(binary_number));
    }
}