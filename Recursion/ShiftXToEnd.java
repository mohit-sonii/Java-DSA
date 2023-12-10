
//shift all the x to the end of the string

public class ShiftXToEnd {

     public static void Function(String oldstr,String newstr,int count, int index)
     {
          if(index==oldstr.length())
          {
               for(int i=0;i<count;i++)
               {
                    newstr+='x';
               }
               System.out.println(newstr);
               return;
          }
          char current=oldstr.charAt(index);
          
          if(current=='x')
          {
               count++;
               Function(oldstr,newstr,count,index+1);
          }
          else
          {
               newstr+=current;
               Function(oldstr,newstr,count,index+1);

          }
     }
     public static void main(String[] args) {
          Function("axbcxxd","",0,0);
     }
}
