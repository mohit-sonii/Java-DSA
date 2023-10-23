


// clear bit
// Q- clear the 3rd bit (position-2) of a number n. (n=0101)
// bit mask: 1<<i
// operaion: AND with NOT

public class clear_bit
{
    public static void main(String s[])
    {
        int n=5;
        int pos=2;
        int Bitmask=1<<pos;
        int notbitmask= ~(Bitmask);
        int operations=notbitmask & n;
        System.out.println(operations);

    }
}