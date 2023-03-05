import java.util.*;
import java.lang.Math; 
public class Armstrong {
 public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number :");

    int n = s.nextInt();

    int last = 0,sum = 0, digit = 0;
    int temp = n;

    while(temp>0)
    {
        temp = temp/10;
        digit++;
    }

    temp = n ;
    while(temp>0)
    {
        last = temp % 10;

        sum += (Math.pow(last , digit));

        temp = temp /10;

    }

    if(sum == n)
    {
        System.out.println("it is armstrong number");
    }
    else{
        System.out.println("not armstrong number");
    }


    
s.close();
        
    }
    
} 