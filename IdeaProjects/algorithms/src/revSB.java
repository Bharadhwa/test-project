
public class revSB
{
    public static void main(String[] args)
    {
        int num = 1234;
        System.out.println("the initial value is ="+num);
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("the reverse value is =" + rev);
    }
}
