import java.util.Scanner;
class NeonNumber 
	{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, sq, sum = 0, ld;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        sq = n * n;

        while (sq > 0) {
            ld = sq % 10;
            sum = sum + ld;
            sq = sq / 10;
        }

        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}