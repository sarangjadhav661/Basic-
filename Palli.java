import java.util.*;

public class Palli {
  
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");

        int n = s.nextInt();

        int temp = n;

        int reverse =0;

        while(n>0)
        {
            int remainder = n %10;
            reverse = reverse *10 + remainder;
            
            n = n /10; 
        }

        if(reverse == temp)
        {
            System.out.println("Palindrome number");

        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
