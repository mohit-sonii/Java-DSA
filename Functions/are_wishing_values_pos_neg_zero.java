
// to enter the number  till the user wants and at the end it should display the count of positive,negative and zeros

import java.util.Scanner;
public class are_wishing_values_pos_neg_zero
{
    public static void main(String ags[])
    {
        int count_pos=0, count_neg=0, count_zero=0;
        System.out.println("Press 0 to stop and 1 to continue");
        Scanner obj=new Scanner(System.in);
        int input=obj.nextInt();
        while(input==1)
        {
            System.out.println("Enter your number");
            int i=obj.nextInt();
            
            if(i>0)
            {
                count_pos++;
            }
            else if(i<0)
            {
                count_neg++;
            }
            else
            {
                count_zero++;
            }
            System.out.println("Press 0 to stop and 1 to continue");
            input=obj.nextInt();
        }
        System.out.println("Total positiv count is: "+count_pos);
        System.out.println("Total negiv count is: "+count_neg);
        System.out.println("Total zero count is: "+count_zero);
    }
}
