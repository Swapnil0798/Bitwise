import java.lang.*;
import java.util.*;
class Bitwise
{
    public void displaybinary(int ino)
    {
        int idigit=0;
        while(ino!=0)
        {
            idigit=ino%2;
            System.out.print(idigit);
            ino=ino/2;
        }
        System.out.println();
    }

}
//decimal to binary
//enter number:11
//output:1101
class Program158
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);

      System.out.println("enter number");
      int value=sobj.nextInt();

      Bitwise bobj=new Bitwise();
      bobj.displaybinary(value);

    }
}