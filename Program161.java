import java.lang.*;
import java.util.*;
class Bitwise
{

   public boolean chkbit(int ino)
   {
       int imask=1048576;
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
//enter number
//1048576
//bit is on
class Program161
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