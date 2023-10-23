


// Bits operations -> Get Bit

//Q- Get the 3rd bit(position=2) of a number n.(n=0101)
// Bitmask: 1<<i
// operation: AND

public class get_bit
{
    public static void main(String ags[])
    {
        int n=5; //0101
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask & n)==0)
        {
            System.out.println("Value is zero");
        }
        else
        System.out.println("value is one");
    }
}