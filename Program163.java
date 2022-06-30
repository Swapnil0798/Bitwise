import java.lang.*;
import java.util.*;
class Bitwise
{

   public boolean chkbit(int ino)
   {
       int imask=0X00002000;
       int iresult=0;
       iresult=ino & imask;
       
       if(iresult==0)
       {
           return false;
       }
       else
       {
           return true;
       }

   }
}
//chk weather 21bit are on or off
class Program163
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);

      System.out.println("enter number");
      int value=sobj.nextInt();

      Bitwise bobj=new Bitwise();
       boolean bret=bobj.chkbit(value);
     
         if(bret==true)
      {
          System.out.println("bit is on");
      }
      else
      {
        System.out.println("bit is off");
      }

    }
}