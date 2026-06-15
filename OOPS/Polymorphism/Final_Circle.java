//final variable
import java.util.Scanner;

class Final_Circle
{
    public static void area(double PI , int r)
    {
        double ans = PI * r * r ;
        System.out.println("area of circle is : "+ans);
    }

    public static void periMeter(double PI , int r)
    {
        double ans = 2 * PI * r ;
        System.out.println("perimeter of circle is : "+ans);
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        final double PI = 3.14;
        System.out.print("enter r value of circle : ");
        int r = sc.nextInt();

        area(PI, r);
        periMeter(PI,r);
    }
}