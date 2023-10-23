


// set bit
// Q- set the end bit(position=1) of a number n.(n=0101)
// bit mask: 1<<i
// operation: OR

public class set_bit
{
    public static void main(String ags[])
    {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int operation= bitmask | n;
        System.out.println(operation);
    }
}
