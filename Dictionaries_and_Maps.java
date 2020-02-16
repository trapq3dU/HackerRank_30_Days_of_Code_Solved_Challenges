// Day 8: Dictionaries and Maps

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Dictionaries_and_Maps{
    public static void main(String []argh){
        
        HashMap<String,Integer> PhBook= new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            PhBook.put(name,phone);
            in.nextLine();
        }

        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(PhBook.containsKey(s))
                System.out.println(s+"="+PhBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
