public class ConsOver
{
    public ConsOver(int w,int h,int b)
    {
        System.out.println("volume="+(w*h*b));
    }
    public ConsOver()
    {
        System.out.println("constuructor ovaer loading");
    }
    public ConsOver(int a,int b)
    {
        System.out.println("volume ="+(a*b));
    }
    public static void main(String args[])
    {
        ConsOver c1=new ConsOver();
        ConsOver c=new ConsOver(1,2,3);
        ConsOver c2=new ConsOver(1,2);
    }
}
