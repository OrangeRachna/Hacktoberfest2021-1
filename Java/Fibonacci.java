import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n1=0,n2=1,n3,i,m;
        System.out.println("Enter the limit: ");
        m=obj.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2;i<m;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
