package Week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class XORStrings2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        /*
        Scanner scanner = new Scanner(System.in);
        String output = "";
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        for(int i = 0; i < string1.length(); i++) {
            if(string1.charAt(i) == string2.charAt(i))
                output += "0";
            else
                output += "1";
        }
        System.out.println(output);
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = reader.readLine();
        String string2 = reader.readLine();
        String output = "";

        for (int i = 0; i < string1.length(); i++) {
            int bit = (string1.charAt(i) - 48) ^ (string2.charAt(i) - 48);
            output += bit;
        }
        System.out.println(output);
    }

}
