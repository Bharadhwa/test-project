import java.util.Scanner;

public class countNum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number :");
        int num=sc.nextInt();
        int len=0;
        while(num>0)
        {
            num=num/10;
            len++;
        }
        System.out.println("the number of digits in given number is:"+len);
    }
}
