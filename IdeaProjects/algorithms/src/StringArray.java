public class StringArray
{
    public static void main(String[]args)
    {
        String str="ABCD";
        String rev="";
        char a[]=str.toCharArray();
        int len=a.length;
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+a[i];
        }
        System.out.println("revers is :"+rev);
    }
}

