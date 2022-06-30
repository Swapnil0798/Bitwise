import java.lang.*;
import java.util.*;
class Bitwise
{

   public int togglebit(int ino)
   {
       int imask=0X00000008;
       int iresult=0;
       

       iresult=ino ^ imask;
       
       return iresult;     
   }
}
//enter number
//171
//Updated number is:163


class Program166
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);

      System.out.println("enter number");
      int value=sobj.nextInt();

      Bitwise bobj=new Bitwise();
      int iret=bobj.togglebit(value);
      System.out.println("Updated number is:"+iret);   

    }
}