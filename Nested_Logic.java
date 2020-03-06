import java.io.*;
import java.util.*;

public class Nested_Logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your             class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int fine=0;
        
        int AD = sc.nextInt();  //Actual Day
        int AM = sc.nextInt();  //Actual Month
        int AY = sc.nextInt();  //Actual Year

        int ED = sc.nextInt();  // Expected Day
        int EM = sc.nextInt();  // Expectec Month
        int EY = sc.nextInt();  // Expected Year


        if(AY > EY)
            fine=10000;

        else if (AM > EM     &&     AY >= EY)
            fine=500*(AM - EM);

        else if (AD > ED     &&     AM >= EM     &&     AY >= EY)
            fine=15*(AD - ED);


        System.out.println(fine);
    }
}
