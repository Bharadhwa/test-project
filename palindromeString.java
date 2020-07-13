import java.util.Scanner;

public class palindromeString
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word here:");
        String s=sc.next();
        String org_s=s;
        String rev="";
        int len=s.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("the reverse of given word is:"+rev);
        if(org_s==s)
        {
            System.out.println("given word is a palindrome");
        }
        else
        {
            System.out.println("given word is not a palindrome");
        }

    }
}
