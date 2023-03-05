public class Pract 
{
    public static void main(String[] args) {
        
        int n = 5 , i , j , x=1;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n/2+1; j++)
            {
                if(j==1|| i==1 ||i==n/2+1||(i<=n/2 && j==n/2
            +1)||j==x){
            System.out.print("* ");
            }
            else
            {
              System.out.print(" ");
            } 
            

            
            }
            if(i>n/2)
            x++;
            System.out.println( );
        }
    }

}