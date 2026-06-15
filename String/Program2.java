import java.util.Scanner;

public class Program2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Email : ");
        String email1 = sc.next();

        System.out.println("Enter your Email agn : ");
        String email2 = sc.next();

        if((email1).equals(email2))
              System.out.println("True");
        else 
             System.out.println("False");
		
		/*if((email1)==(email2))
              System.out.println("True");
        else 
             System.out.println("False");*/
         
     }

    }