// Day 2 Challenge


import java.util.*;

public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent)
    {
    	double tip = meal_cost * (double)tip_percent / 100;
        double tax = meal_cost * (double)tax_percent / 100;
        double total = meal_cost + tip + tax;
        
        //System.out.println("Tip: " + tip + "\n Tax:" + tax + "\n Total: " + total);
        
        // cast the result of the rounding operation to an int and save it as totalCos
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");

     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
