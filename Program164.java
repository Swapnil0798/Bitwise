import java.lang.*;
import java.util.*;
class Bitwise
{

   public int onbit(int ino)
   {
       int imask=0X00000008;
       int iresult=0;

       iresult=ino | imask;
       return iresult;     
   }
}
//enter number
//7
//Updated number is:15


class Program164
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);

      System.out.println("enter number");
      int value=sobj.nextInt();

      Bitwise bobj=new Bitwise();
      int iret=bobj.onbit(value);
      System.out.println("Updated number is:"+iret);   

    }
}