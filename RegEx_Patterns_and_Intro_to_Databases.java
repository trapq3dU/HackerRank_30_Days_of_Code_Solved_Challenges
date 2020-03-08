import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegEx_Patterns_and_Intro_to_Databases {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        ArrayList<String> names = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];


            Matcher matcher = pattern.matcher(emailID);

            if (matcher.find())
            {
                names.add(firstName);
            }
        }        
        scanner.close();       

        Collections.sort(names);

        for(int i=0; i<names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        
    }
}
