import java.util.Scanner;

public class PalindromeNum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
         int num =sc.nextInt();
         int org_num=num;
         int rev=0;
         while(num!=0)
         {
             rev=rev*10+num%10;
             num=num/10;
         }
         System.out.println("rev value is :"+rev);
         if(org_num==rev)
         {
             System.out.println(org_num+" it is a palindrome");
         }
         else
         {
             System.out.println(org_num+" it is not a palindrome");
         }

    }
}
