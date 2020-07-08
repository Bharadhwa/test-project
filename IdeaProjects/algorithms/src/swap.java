public class swap
{
    public static void main(String[]args)
    {
        int a=10,b=20;
        System.out.println("Before swapping the values are"+a+" "+b);
        /*int t=0;
        t=a;
        a=b;
        b=t;*/
        /*a=a+b;
        b=a-b;
        a=a-b;*/
        a=a*b;
        b=a/b;
        a=a/b;
        
        System.out.println("after swapping the values are"+a+" "+b);
    }
}
