
// update bit 
// For 0
// Bitmark: 1<<i
// Operation: AND with NOT
// For 1
// Bitmark: 1<<i
// Operaiton: OR

// Q- Update the 2nd bit(position = 1) of a number n to 1. (n=0101)


public class update_bit
{
    public static void main(String ags[])
    {
        int n=5;
        int pos=1;
        
        int bitmask=1<<pos;
        int Operation=bitmask | n;
        System.out.println(Operation);
    }
}

