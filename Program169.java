import java.lang.*;
import java.util.*;
class Bitwise
{
    public int togglebit(int ino,int ipos)
    {
        int imask=0X00000001;
        int iresult=0;

        iresult=imask<<(ipos-1);
        iresult=ino^imask;

        return iresult;
    }

}
//Enter number
//49
//Enter position
//4
//Updated number is:48
class Program169
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  // 9th July

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        System.out.println("Enter position ");
        int pos = sobj.nextInt();
        
        Bitwise bobj=new Bitwise();
         int iret=bobj.togglebit(value,pos);
         System.out.println("Updated number is:"+iret);   

     
        

    }
}