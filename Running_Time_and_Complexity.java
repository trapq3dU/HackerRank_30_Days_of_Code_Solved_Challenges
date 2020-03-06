import java.io.*;
import java.util.*;

public class Running_Time_and_Complexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n=sc.nextInt();

            if(n>=2 && checkPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");       
        }

    }
    public static boolean checkPrime(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
