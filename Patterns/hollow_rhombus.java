


import java.util.Scanner;
public class hollow_rhombus{
    public static void main(String as[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==n || i==1 || j==1 || j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        obj.close();
    }
    
}
