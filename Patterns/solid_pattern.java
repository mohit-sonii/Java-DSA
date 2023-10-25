
//solid square
// *****
// *****
// *****
// *****
// *****

import java.util.Scanner;
class solid_pattern{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        obj.close();
    }
}